package defaultValidate;

public class requestDataDefault {

    protected String name;
    protected String hobby;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        if (isValidName()) {
            return name;
        } else {
            return "No Name";
        }
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        if (isValidHobby()) {
            return hobby;
        } else {
            return "No Hobby";
        }
    }

    public boolean isValidName() {
        return name != null && !name.trim().equals("");
    }

    public boolean isValidHobby() {
        return hobby != null && !hobby.trim().equals("");
    }

}
