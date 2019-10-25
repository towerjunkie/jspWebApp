package defaultValidate;

public class requestDataDefault {

    protected String crop;
    protected String usage;
    protected String region;

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
    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        if (isValidRegion()) {
            return region;
        } else {
            return "No Region";
        }
    }

    public boolean isValidCrop() {
        return crop != null && !crop.trim().equals("");
    }

    public boolean isValidUsage() {
        return usage != null && !usage.trim().equals("");
    }
     public boolean isValidRegion() {
        return region != null && !region.trim().equals("");
    }

}
