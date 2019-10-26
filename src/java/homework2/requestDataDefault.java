package homework2;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;


public class requestDataDefault {

    protected String crop;
    protected String usage;
    protected int region;
    protected double acres;
    protected Logger logger;
    protected double calculation;
    
    
    public void setCrop(String crop) {
        this.crop = crop;
        logger.info("Crop has been set");
    }
    
   

    public String getCrop() {
        if (isValidCrop()) {
            return crop;
        } else {
            return "Must Choose Crop";
        }
    }

    public void setUsage(String usage) {
        this.usage = usage;
        logger.info("Usage has been set");
    }

    public String getUsage() {
        if (isValidUsage()) {
            return usage;
        } else {
            return "Must Choose Usage";
        }
    }
    public void setRegion(int region) {
        this.region = region;
        logger.info("Region has been set");
    }

    public int getRegion() {
        if (isValidRegion()) {
            return region;
        } else {
            return 1;
        }
    }
     public void setAcres(double acres) {
        this.acres = acres;
        logger.info("Acerage has been set");
    }
      public double getAcres() {
        if (isValidAcres()) {
            return acres;
        } else {
            return 1.0;
        }
      }
      
      public double getCalculation() {
          calculation = acres/region;
          return calculation;
      }
    public boolean isValidCrop() {
        return crop != null && !crop.trim().equals("");
    }

    public boolean isValidUsage() {
        return usage != null && !usage.trim().equals("");
    }
     public boolean isValidRegion() {
        return (region >=1 && region <=4);
        
    }
     public boolean isValidAcres() {
        return (acres >=1.0 && acres <=10000.0);
    }
}