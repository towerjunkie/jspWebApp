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

        data.setHobby(request.getParameter("hobby"));
        data.setName(request.getParameter("name"));

        String address;

        if (request.getParameter("processButton") != null) {
            address = "process.jsp";
        } else if (request.getParameter("confirmButton") != null) {
            address = "confirm.jsp";
        } else {
            address = "edit.jsp";
        }

        RequestDispatcher dispatcher
                = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }

}
