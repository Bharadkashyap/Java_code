abstract class Shape {
    abstract void draw();

    void describe() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}
public class Pro20 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s1.describe();

        s2.draw();
        s2.describe();
    }
}