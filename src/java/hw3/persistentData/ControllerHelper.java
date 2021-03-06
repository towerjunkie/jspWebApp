package hw3.persistentData;

import java.util.Properties;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import shared.HelperBaseCh5;
import shared.ButtonMethod;
import shared.HibernateHelper;

public class ControllerHelper extends HelperBaseCh5 {

    protected DataPersistent client =
            new DataPersistent();

    public ControllerHelper(
            HttpServlet servlet,
            HttpServletRequest request,
            HttpServletResponse response) {
        super(servlet, request, response);
    }

    static public void initHibernate(HttpServlet servlet) {
        Properties props = new Properties();
        props.setProperty("hibernate.dialect",
                "org.hibernate.dialect.MySQLDialect");
        props.setProperty("hibernate.connection.driver_class",
                "com.mysql.jdbc.Driver");
        props.setProperty("hibernate.c3p0.min_size", "1");
        props.setProperty("hibernate.c3p0.max_size", "5");
        props.setProperty("hibernate.c3p0.timeout", "300");
        props.setProperty("hibernate.c3p0.max_statements",
                "50");
        props.setProperty("hibernate.c3p0.idle_test_period",
                "300");

        //The following properties must be updated with your information.
        //Replace the capitalized words with your database information.
        //The standard port for MySQL is 3306.
        props.setProperty("hibernate.connection.url",
                "jdbc:mysql://SERVER:PORT/DATABASE");
        props.setProperty("hibernate.connection.username",
                "USERNAME");
        props.setProperty("hibernate.connection.password",
                "PASSWORD");

        boolean create =
                Boolean.parseBoolean(servlet.getInitParameter("create"));
        if (create) {
            HibernateHelper.createTable(
                    props,
                    DataPersistent.class);
        }

        HibernateHelper.initSessionFactory(
                props,
                DataPersistent.class);
    }  

    public Object getClient() {
        return client;
    }

    protected void copyFromSession(Object sessionHelper) {
        if (sessionHelper.getClass() == this.getClass()) {
            client = ((ControllerHelper) sessionHelper).client;
        }
    }

    protected String jspLocation(String page) {
        return "/WEB-INF/PJSPs/" + page;
    }

    @ButtonMethod(buttonName = "editButton", isDefault = true)
    public String editMethod() {
        return jspLocation("edit.jsp");
    }
     @ButtonMethod(buttonName = "wishlistButton", isDefault = true)
    public String wishlistMethod() {
        return jspLocation("wishlist.jsp");
    }


    @ButtonMethod(buttonName = "confirmButton")
    public String confirmMethod() {
        fillBeanFromRequest(client);
        //The next JSP address depends on the validity of the data.
        String address;
        //Delete this and it moves forward
        if (isValid(client)) {
            address = jspLocation("confirm.jsp");
        } else {
            address = jspLocation("edit.jsp");
        }
        
        return address;
    }

    @ButtonMethod(buttonName = "processButton")
    public String processMethod() {
        if (!isValid(client)) {
            return jspLocation("Expired.jsp");
        }
        HibernateHelper.updateDB(client);
        java.util.List list =
                HibernateHelper.getListData(client.getClass());
        request.setAttribute("database", list);
        return jspLocation("process.jsp");
    }
    

    @ButtonMethod(buttonName = "viewButton")
    public String viewMethod() {
        if (!isValid(client)) {
            return jspLocation("view.jsp");
        }
        HibernateHelper.updateDB(client);
        java.util.List list =
                HibernateHelper.getListData(client.getClass());
        request.setAttribute("database", list);
        return jspLocation("view.jsp");
    }
    
    
    @Override
    public void doGet()
            throws ServletException, java.io.IOException 
    {
        //Call the method with false to place a new helper in the session
        addHelperToSession("assist", SessionData.IGNORE);

        //Edit.jsp is the only page that will be displayed from a GET request.
        String address = editMethod();

        request.getRequestDispatcher(address).forward(request, response);
    }

    @Override
    public void doPost()
            throws ServletException, java.io.IOException 
    {
        addHelperToSession("assist", SessionData.READ);

        String address = executeButtonMethod();

        request.getRequestDispatcher(address).forward(request, response);
    }  
}
