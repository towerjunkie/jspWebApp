package shared;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelperBaseCh4 {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpServlet servlet;

    public HelperBaseCh4(HttpServlet servlet,
            HttpServletRequest request,
            HttpServletResponse response) {
        this.servlet = servlet;
        this.request = request;
        this.response = response;
    }

}
