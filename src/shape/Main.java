package shape;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.4, "red");
        Circle circle2 = new Cylinder(3.3, "yellow", 2.1);
        Cylinder cylinder1 = new Cylinder(3.3, "yellow", 2.1);

        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
        System.out.println(circle2.getPerimeter());
        System.out.println(circle2.getArea());
        System.out.println(cylinder1.getPerimeter());
        System.out.println(cylinder1.getArea());
        System.out.println(cylinder1.getVolume());
        System.out.println(circle2.toString());
        // circle2 can not use method of cylinder even though it is a cylinder
        //System.out.println(circle2.getVolume());
    }
}
