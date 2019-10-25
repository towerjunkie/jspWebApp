package hw1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {
          
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response)
    throws ServletException, IOException {
        ControllerHelper helper = 
            new ControllerHelper(this, request, response);
        helper.doGet();
    }   
}
