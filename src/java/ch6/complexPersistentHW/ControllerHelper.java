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

    private ComplexDataPersistentHW client
            = new ComplexDataPersistentHW();

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

    static public void initHibernate(HttpServlet servlet) {
        boolean create
                = Boolean.parseBoolean(servlet.getInitParameter("create"));
        if (create) {
            HibernateHelper
                    .createTable(ComplexDataPersistentHW.class);
        }
        HibernateHelper
                .initSessionFactory(ComplexDataPersistentHW.class);
    }

    public Object getClient() {
        return client;
    }

    public void copyFromSession(Object sessionHelper) {
        ControllerHelper helper = (ControllerHelper) sessionHelper;
        client = helper.client;
        checked = helper.checked;
        selected = helper.selected;
        logger.info("Copy from session was called");
    }

    public void resetNullable() {
        //Checkbox
        client.setCrop(null);
        //Mulitple select
        client.setLand(null);
        //Radio
    }

    protected String jspLocation(String page) {
        return "/WEB-INF/complexJSPs/" + page;
    }

    @ButtonMethod(buttonName = "editButton", isDefault = true)
    public String editMethod() {
        logger.warn("Edit button was called");
        return jspLocation("Edit.jsp");
    }

    @ButtonMethod(buttonName = "wishlistButton", isDefault = true)
    public String wishlistMethod() {
        return jspLocation("wishlist.jsp");
    }

    @ButtonMethod(buttonName = "confirmButton")
    public String confirmMethod() {
        //Create new data and populate from the query string
        resetNullable();
        fillBeanFromRequest(client);
        setCheckedAndSelected(client);
        //The next JSP address depends on the validity of the data.
        String address;
        if (isValid(client)) {
            address = jspLocation("Confirm.jsp");
        } else {
            address = jspLocation("Edit.jsp");
        }
        return address;
    }

    @ButtonMethod(buttonName = "processButton")
    public String processMethod() {
        logger.debug("Process button was called" + client.getRegion());
        if (!isValid(client)) {
            return jspLocation("Expired.jsp");
        }
        HibernateHelper.updateDB(client);
        List list = HibernateHelper.getListData(ComplexDataPersistentHW.class);
        request.setAttribute("baseData", list);
        return jspLocation("Process.jsp");
    }

    @ButtonMethod(buttonName = "viewButton")
    public String viewMethod() {
        if (!isValid(client)) {
            return jspLocation("view.jsp");
        }
        HibernateHelper.updateDB(client);
        java.util.List list
                = HibernateHelper.getListData(client.getClass());
        request.setAttribute("baseData", list);
        return jspLocation("view.jsp");
    }

    @Override
    protected void doGet()
            throws ServletException, java.io.IOException {
        //Call the method with false to place a new helper in the session
        addHelperToSession("assist", SessionData.IGNORE);

        //Edit.jsp is the only page that will be displayed from a GET request.
        String address = editMethod();

        request.getRequestDispatcher(address)
                .forward(request, response);

    }

    @Override
    protected void doPost()
            throws ServletException, java.io.IOException {
        //Call the method with false to place a new helper in the session
        addHelperToSession("assist", SessionData.READ);

        //Edit.jsp is the only page that will be displayed from a GET request.
        String address = executeButtonMethod();

        request.getRequestDispatcher(address)
                .forward(request, response);
    }

}
