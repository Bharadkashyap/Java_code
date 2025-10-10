//3WriteajavaprogramtouseLocalInnerClass
public class Pro33 {
    void outer() {
        class Inner {
            void display() {
                System.out.println("Local Inner Class");
            }
        }
        Inner obj = new Inner();
        obj.display();
    }

    public static void main(String[] args) {
        new Pro33().outer();
    }
}
