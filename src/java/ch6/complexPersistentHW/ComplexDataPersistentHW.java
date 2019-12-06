package ch6.complexPersistentHW;

import homework2.requestDataDefault;
import java.io.Serializable;
import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.annotations.IndexColumn;
import shared.SetByAttribute;
import shared.AttributeType;

@Entity
public class ComplexDataPersistentHW implements Serializable {

    protected Long id;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    protected String[] land;
    protected String[] crop;
    protected String password;
    protected int region;
    protected double acres;
    protected double calculation;
    protected Logger logger;

    public ComplexDataPersistentHW() {
    logger = Logger.getLogger(requestDataDefault.class);
    logger.setLevel (Level.INFO);
    }

    public void setLand(String[] land) {
        this.land = land;
    }

    public void setCrop(String[] crop) {
        this.crop = crop;
    }
    
    public void setPassword(String code) {
        this.password = code;
    }
    
    public String getPassword() {
        return password;
    }
    

    @Min(value = 1, message = "Value must be greater than 1")
    @Max(value = 4, message = "Value must be less than 4")
    @NotNull
    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    @Min(value = 1, message = "Value must be greater than 1")
    @Max(value = 10000, message = "Value must be less than 10,000")
    @NotNull
    public double getAcres() {
        return acres;
    }

    public void setAcres(double acres) {
        this.acres = acres;
    }

    @Transient
    public double getCalculation() {
        calculation = acres / region;
        return calculation;
    }

    @ElementCollection
    @IndexColumn(name = "crop_pos", base = 0)
    @SetByAttribute(type = AttributeType.CHECKED)
    @NotNull(message = ": must select at least one crop.")
    public String[] getCrop() {
        return crop;
    }

    @ElementCollection
    @IndexColumn(name = "land_pos", base = 0)
    @SetByAttribute(type = AttributeType.SELECTED)
    @Size(min = 0, max = 3, message = ": cannot select all lands.")
    public String[] getLand() {
        return land;
    }

}
