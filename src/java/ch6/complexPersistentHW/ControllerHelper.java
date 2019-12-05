package ch6.complexPersistentHW;


import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import shared.HelperBaseCh6;
import shared.ButtonMethod;
import shared.HibernateHelper;

public class ControllerHelper extends HelperBaseCh6 {
    
    private ComplexDataPersistentHW data = 
        new ComplexDataPersistentHW();
    
    public ControllerHelper(
            HttpServlet servlet,
            HttpServletRequest request,
            HttpServletResponse response) {
        super(servlet, request, response);
        logger.warn("Controller Helper");
        logger.info("Controller Helper");
        logger.error("Controller Helper");
        logger.debug("Controller Helper");
    }

    static public void initHibernate(HttpServlet servlet) 
    {
        boolean create =
                Boolean.parseBoolean(servlet.getInitParameter("create"));
	if (create) {
	    HibernateHelper
		.createTable(ComplexDataPersistentHW.class);
	}     
	HibernateHelper
	    .initSessionFactory(ComplexDataPersistentHW.class);       
    }

    public Object getData() {   
        return data;
    }
    
    public void copyFromSession(Object sessionHelper) {
        ControllerHelper helper = (ControllerHelper) sessionHelper;
        data = helper.data;
        checked = helper.checked;
        selected = helper.selected;
    }
    
    public void resetNullable() {
        //Checkbox
        data.setCrop(null);
        //Mulitple select
        data.setLand(null);
        //Radio
    }

    protected String jspLocation(String page) {
        return "/WEB-INF/complexJSPs/" + page;
    }
    
    @ButtonMethod(buttonName="editButton", isDefault=true)
    public String editMethod() {
        return jspLocation("Edit.jsp");
    }

    @ButtonMethod(buttonName="confirmButton")
    public String confirmMethod() {
        //Create new data and populate from the query string
        resetNullable();
        fillBeanFromRequest(data);
        setCheckedAndSelected(data);
        //The next JSP address depends on the validity of the data.
        String address;
        if (isValid(data)) {
            address = jspLocation("Confirm.jsp");
        } else {
            address = jspLocation("Edit.jsp");
        }
        return address;
    }

    @ButtonMethod(buttonName="processButton")
    public String processMethod() { 
        if (!isValid(data)) {
            return jspLocation("Expired.jsp");
        }
        HibernateHelper.updateDB(data);
        List list = HibernateHelper.getListData(ComplexDataPersistentHW.class);
        request.setAttribute("baseData", list);
        return jspLocation("Process.jsp");
    }
    
    @ButtonMethod(buttonName = "viewButton")
    public String viewMethod() {
        if (!isValid(data)) {
            return jspLocation("view.jsp");
        }
        HibernateHelper.updateDB(data);
        java.util.List list =
                HibernateHelper.getListData(data.getClass());
        request.setAttribute("baseData", list);
        return jspLocation("view.jsp");
    }
    
    @Override
    protected void doGet() 
        throws ServletException, java.io.IOException
    {      
        //Call the method with false to place a new helper in the session
        addHelperToSession("assist", SessionData.IGNORE);

        //Edit.jsp is the only page that will be displayed from a GET request.
        String address = editMethod();

        request.getRequestDispatcher(address)
            .forward(request, response);
      
    }
    
    @Override
    protected void doPost() 
        throws ServletException, java.io.IOException 
    {           
        //Call the method with false to place a new helper in the session
        addHelperToSession("assist", SessionData.READ);

        //Edit.jsp is the only page that will be displayed from a GET request.
        String address = executeButtonMethod();

        request.getRequestDispatcher(address)
            .forward(request, response);
      }        
    
 
}