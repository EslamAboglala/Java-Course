package chapter11;

public class Rectangle extends Shape{
    private double length = 0;
    private double width = 0;

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
