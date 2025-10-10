//2WriteajavaprogramtouseStaticInnerClass
public class Pro32 {
    static class Inner {
        void display() {
            System.out.println("Static Inner Class");
        }
    }

    public static void main(String[] args) {
        Pro32.Inner obj = new Pro32.Inner();
        obj.display();
    }
}
