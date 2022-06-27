public class Rectangle extends Shape {

    private double width;
    private double height;



    public Rectangle(double length, double width) {
        this.height = length;
        this.width = width;
    }

    public double getArea() {
        return width*height;
    }
}
