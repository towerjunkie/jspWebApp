
package ch2.servletController;
public class RequestData { 
    
    protected String hobby;
    protected String aversion;
    
    public RequestData() {
    }
    
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    public String getHobby() {
        return hobby;
    } 
    
    public void setAversion(String aversion) {
        this.aversion = aversion;
    }
    
    public String getAversion() {
        return aversion;
    } 
}