package shape;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getPerimeter() {
        return (2 * Math.PI * this.radius);
    }

    public double getArea() {
        return (Math.PI * this.radius * this.radius);
    }

    @Override
    public String toString() {
        return "a circle with radius = " + this.radius + " ; color : " + this.color;
    }
}
