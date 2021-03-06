package reorganized;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import defaultValidate.requestDataDefault;
import javax.servlet.http.HttpServlet;

public class ControllerHelper extends HelperBase {

    protected requestDataDefault data;

    public ControllerHelper(HttpServlet servlet,
            HttpServletRequest request,
            HttpServletResponse response) {
        super(servlet, request, response);
        data = new requestDataDefault();
    }

    public Object getData() {
        return data;
    }

    public void doGet()
            throws ServletException, IOException {
        request.getSession().setAttribute("helper", this);

        data.setUsage(request.getParameter("usage"));
        data.setCrop(request.getParameter("crop"));
        data.setRegion(request.getParameter("region"));

        String address;

        if (request.getParameter("processButton") != null) {
            address = "/javaServerPages/process.jsp";
        } else if (request.getParameter("confirmButton") != null) {
            address = "/javaServerPages/confirm.jsp";
        } else if (request.getParameter("wishList") != null) {
            address = "/javaServerPages/WishList.jsp";
        } else {
            address = "/javaServerPages/edit.jsp";
        }

        RequestDispatcher dispatcher
                = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }

}
