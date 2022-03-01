public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.setFilled(filled);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return Math.PI * this.radius * 2;
    }

    public double getDiameter() {
        return this.radius * 2;
    }

    public void printCircle() {
        System.out.println("The circle was created on " + this.getDateCreated());
        System.out.println(this.toString());
    }

}
