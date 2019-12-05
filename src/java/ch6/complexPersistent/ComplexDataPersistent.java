package ch6.complexPersistent;
import java.io.Serializable;
import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.IndexColumn;
import shared.SetByAttribute;
import shared.AttributeType;

@Entity
public class ComplexDataPersistent implements Serializable {
    
    protected Long id;
    
    @Id
    @GeneratedValue 
    public Long getId() { return id; }

    private void setId(Long id) { this.id = id; }

    protected String password;
    protected int happiness;
    protected String[] extra;
    protected String comments;
    protected double grade;
    protected String[] land;
    
    public ComplexDataPersistent() {
    }
      
    public void setPassword(String code) {
        this.password = code;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
        
    public void setExtra(String[] extra) {
        this.extra = extra;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    public String getComments() {
        return comments;
    }
    
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public void setLand(String[] land) {
        this.land = land;
    }
    
    @SetByAttribute(type=AttributeType.CHECKED)
    public int getHappiness() {
        return happiness;
    }
    
    @SetByAttribute(type=AttributeType.SELECTED)
    public double getGrade() {
        return grade;
    }

    @ElementCollection
    @IndexColumn(name="extra_pos", base=0)
    @SetByAttribute(type=AttributeType.CHECKED)
    @NotNull(message=": must select at least one extra.")
    public String[] getExtra() {
        return extra;
    }
 
    @ElementCollection
    @IndexColumn(name="land_pos", base=0)
    @SetByAttribute(type=AttributeType.SELECTED)
    @Size(min=0, max=3, message=": cannot select all lands.")
    public String[] getLand() {
        return land;
    }

}
