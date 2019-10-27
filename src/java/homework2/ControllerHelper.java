package homework2;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import shared.ButtonMethod;
import shared.HelperBaseCh4;

import javax.servlet.http.HttpServlet;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class ControllerHelper extends HelperBaseCh4 {
  
  private requestDataDefault client;
  
  public ControllerHelper(
            HttpServlet servlet,
            HttpServletRequest request,
            HttpServletResponse response) {
        super(servlet, request, response);
        client = new requestDataDefault();
  }
  
  public Object getClient() {
    return client;
  }
  
  public void copyFromSession(Object sessionHelper) {
    if (sessionHelper.getClass() == this.getClass()) {
      client = ((ControllerHelper)sessionHelper).client;
      logger.info("Copy from session was called");
    }
  }
  
  protected String jspLocation(String page) {
    return "/WEB-INF/JSPs/" + page;
  }
  
  @ButtonMethod(buttonName="editButton", isDefault=true)
  public String editMethod() {
    logger.warn("Edit button was called");
    return jspLocation("edit.jsp");
  }
  
  @ButtonMethod(buttonName="confirmButton")
  public String confirmMethod() {
    fillBeanFromRequest(client);
    return jspLocation("confirm.jsp");
  }
  
  
  @ButtonMethod(buttonName="processButton")
  public String processMethod() {
      logger.debug("Process button was called" + client.getRegion());
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
    addHelperToSession("assist", SessionData.READ);
    
    String address = executeButtonMethod();
    
    request.getRequestDispatcher(address)
        .forward(request, response);
  }
  
}