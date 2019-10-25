package hw2;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import shared.ButtonMethod;
import shared.HelperBaseCh4;

import javax.servlet.http.HttpServlet;

public class ControllerHelper extends HelperBaseCh4 {
  
  private requestDataDefault data;
  
  public ControllerHelper(
            HttpServlet servlet,
            HttpServletRequest request,
            HttpServletResponse response) {
        super(servlet, request, response);
        data = new requestDataDefault();
  }
  
  public Object getData() {
    return data;
  }
  
  public void copyFromSession(Object sessionHelper) {
    if (sessionHelper.getClass() == this.getClass()) {
      data = ((ControllerHelper)sessionHelper).data;
    }
  }
  
  protected String jspLocation(String page) {
    return "/WEB-INF/" + page;
  }
  
  @ButtonMethod(buttonName="editButton", isDefault=true)
  public String editMethod() {
    return jspLocation("/JSPs/edit.jsp");
  }
  
  @ButtonMethod(buttonName="confirmButton")
  public String confirmMethod() {
    fillBeanFromRequest(data);
    return jspLocation("/JSPs/confirm.jsp");
  }
  
  
  @ButtonMethod(buttonName="processButton")
  public String processMethod() {
    return jspLocation("/JSPs/process.jsp");
    
  }
  
  @ButtonMethod(buttonName="wishList")
  public String wishlistMethod() {
    return jspLocation("/JSPs/WishList.jsp");
    
  }
  
  @Override
  public void doGet() 
    throws ServletException, IOException
  {
    addHelperToSession("assist", SessionData.READ);
    
    String address = executeButtonMethod();
    
    request.getRequestDispatcher(address)
        .forward(request, response);
  }
  
}
