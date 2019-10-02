/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2.servletController;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/ch3/dataBean/Controller"})
public class Controller extends HttpServlet
{
  
  protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException
  {
    RequestData data = new RequestData();
    request.getSession().setAttribute("refData", data);
    
    data.setHobby(request.getParameter("hobby"));
    data.setAversion(request.getParameter("aversion"));
    
    String address;
    
    if (request.getParameter("processButton") != null)
    {
      address = "Process.jsp";
    }
    else if (request.getParameter("confirmButton") != null)
    {
      address = "Confirm.jsp";
    }
    else
    {
      address = "Edit.jsp";
    }
    
    RequestDispatcher dispatcher =
        request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
  }
}
