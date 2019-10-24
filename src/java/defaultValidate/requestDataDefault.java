package defaultValidate;

public class requestDataDefault {

    protected String crop;
    protected String usage;
    protected int region;
    protected double acres;

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public String getCrop() {
        if (isValidCrop()) {
            return crop;
        } else {
            return "No crop";
        }
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getUsage() {
        if (isValidUsage()) {
            return usage;
        } else {
            return "No Usage";
        }
    }
    public void setRegion(int region) {
        this.region = region;
    }

    public int getRegion() {
        if (isValidRegion()) {
            return region;
        } else {
            return 1;
        }
    }
     public void setAcers(double acres) {
        this.acres = acres;
    }
      public double getAcres() {
        if (isValidAcres()) {
            return acres;
        } else {
            return 1.0;
        }
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
