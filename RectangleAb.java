public class RectangleAb extends Shape {

    public RectangleAb(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return (this.dim1 * this.dim2);
    }

}
