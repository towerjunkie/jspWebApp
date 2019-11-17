
package ch5.requiredValidation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/ch5/requiredValidation/Controller"})
public class Controller extends HttpServlet {
      
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
        ControllerHelper helper = new ControllerHelper(this, request, response);
        helper.doGet();
    }
      
}
