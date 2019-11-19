
package hw3.persistentData;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class RequestDataPersistent 
        extends shared.PersistentBase
        implements Serializable
{
    protected String land;
    protected String crop;
    protected int region;
    protected double acres;
    protected double calculation;
    
    public RequestDataPersistent() {
    }

    @Pattern(regexp=".*\\S.*", message="cannot be empty")
    @NotNull
    public String getLand() { 
        return land; 
    } 
     
    public void setLand(String land) {
        this.land = land;
    }   
    
    @Pattern(regexp=".*\\S.*", message="cannot be empty")
    @NotNull
    public String getCrop() {
        return crop;
    } 
    
    public void setCrop(String crop) {
        this.crop = crop;
    }
    
    @Min(value=1,message="Value must be greater than 1")
    @Max(value=4,message="Value must be less than 4")
    @NotNull
    public int getRegion() {
        return region;
    } 
    
    public void setRegion(int region) {
        this.region = region;
    }
    
    @Min(value=1,message="Value must be greater than 1")
    @Max(value=10000, message="Value must be less than 10,000")
    @NotNull
    public double getAcres() {
        return acres;
    } 
    
    public void setAcres(double acres) {
        this.acres = acres;
    }
    
    @Transient
    public double getCalculation() {
          calculation = acres/region;
          return calculation;
      }
}
