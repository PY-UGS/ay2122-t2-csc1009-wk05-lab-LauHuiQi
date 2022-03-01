import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        this.color = "white";
        this.filled = false;
        Date today = new Date();
        this.dateCreated = today;
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        Date today = new Date();
        this.dateCreated = today;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString() {
        return "color: " + this.color + " isFilled: " + this.filled;
    }
}