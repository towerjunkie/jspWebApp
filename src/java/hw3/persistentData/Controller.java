package hw3.persistentData;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {

    @Override
    public void init() {
        ControllerHelper.initHibernate(this);
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
        ControllerHelper assist =
                new ControllerHelper(this, request, response);
        assist.doGet();
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
        ControllerHelper assist =
                new ControllerHelper(this, request, response);
        assist.doPost();
    }
}
