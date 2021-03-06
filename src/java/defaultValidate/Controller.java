package defaultValidate;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        requestDataDefault data = new requestDataDefault();
        request.getSession().setAttribute("refData", data);

        data.setUsage(request.getParameter("usage"));
        data.setCrop(request.getParameter("crop"));
        data.setRegion(request.getParameter("region"));

        String address;

        if (request.getParameter("processButton") != null) {
            address = "/javaServerPages/process.jsp";
        } else if (request.getParameter("confirmButton") != null) {
            address = "/javaServerPages/confirm.jsp";
        } else {
            address = "/javaServerPages/edit.jsp";
        }

        RequestDispatcher dispatcher
                = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }
}
