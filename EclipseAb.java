public class EclipseAb extends Shape {

    public EclipseAb(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return dim1 * dim2 * Math.PI;
    }

}
