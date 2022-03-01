import javax.sound.midi.Track;

public class Main {
    public static void main(String arg[]) {
        System.out.println();

        /// Question 1

        Circle circle = new Circle(1);
        circle.printCircle();
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        System.out.println("The perimeter is " + circle.getPerimeter());

        System.out.println();

        Rectangle rectangle = new Rectangle(2, 4, "blue", true);
        rectangle.printRectangle();
        System.out.println("The color is " + rectangle.getColor());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

        /// Question 2
        RectangleAb r = new RectangleAb(9, 5);
        TriangleAb t = new TriangleAb(9, 5);
        CircleAb c = new CircleAb(9, 5);
        EclipseAb e = new EclipseAb(9, 5);

        Shape s;
        s = r;
        System.out.println("The area of rectangle is " + s.area());

    }
}
