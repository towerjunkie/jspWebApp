package ch4.enhanced;

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
    return "/WEB-INF/classes/ch4/enhanced/" + page;
  }
  
  @ButtonMethod(buttonName="editButton", isDefault=true)
  public String editMethod() {
    return jspLocation("edit.jsp");
  }
  
  @ButtonMethod(buttonName="confirmButton")
  public String confirmMethod() {
    fillBeanFromRequest(data);
    return jspLocation("confirm.jsp");
  }
  
  
  @ButtonMethod(buttonName="processButton")
  public String processMethod() {
    return jspLocation("process.jsp");
    
  }
  
  @ButtonMethod(buttonName="wishList")
  public String wishlistMethod() {
    return jspLocation("WishList.jsp");
    
  }
  
  @Override
  public void doGet() 
    throws ServletException, IOException
  {
    addHelperToSession("helper", SessionData.READ);
    
    String address = executeButtonMethod();
    
    request.getRequestDispatcher(address)
        .forward(request, response);
  }
  
}
