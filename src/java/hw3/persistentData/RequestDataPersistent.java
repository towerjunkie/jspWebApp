
package hw3.persistentData;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class RequestDataPersistent 
        extends shared.PersistentBase
        implements Serializable
{
    protected String usage;
    protected String crop;
    protected String region;
    protected String acres;
    
    public RequestDataPersistent() {
    }

    @Pattern(regexp=".*\\S.*", message="cannot be empty")
    @NotNull
    public String getUsage() { 
        return usage; 
    } 
     
    public void setUsage(String usage) {
        this.usage = usage;
    }   
    
    @Pattern(regexp=".*\\S.*", message="cannot be empty")
    @NotNull
    public String getCrop() {
        return crop;
    } 
    
    public void setCrop(String crop) {
        this.crop = crop;
    }
    
    @Pattern(regexp=".*\\S.*", message="cannot be empty")
    @NotNull
    public String getRegion() {
        return region;
    } 
    
    public void setRegion(String region) {
        this.region = region;
    }
    
     @Pattern(regexp=".*\\S.*", message="cannot be empty")
    @NotNull
    public String getAcres() {
        return acres;
    } 
    
    public void setAcres(String acres) {
        this.acres = acres;
    }

/*
    protected int daysPerWeek;

    @Min(value=1, message="must be greater than 1, if this is a hobby.")
    @Max(value=7, message="cannot be greater than 7. A week only has 7 days.")
    public int getDaysPerWeek() {
        return daysPerWeek;
    }

    public void setDaysPerWeek(int daysPerWeek) {
        this.daysPerWeek = daysPerWeek;
    }
*/
}
