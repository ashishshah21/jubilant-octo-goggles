public class Circle extends Shape {

    private double radius;
    private double height;



    public Circle(double radius) {
        this.radius = radius;

    }

    public double getArea() {
        return 3.14*radius*radius;
    }
}