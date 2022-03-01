public class CircleAb extends Shape {

    public CircleAb(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return (dim1 * dim1) * Math.PI;
    }

}
