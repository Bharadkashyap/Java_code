//1Writeajavaprogramtousesimpleinnerclassinyourprogram
public class Pro31 {
    class Inner {
        void show() {
            System.out.println("Inside Inner Class");
        }
    }

    public static void main(String[] args) {
        Pro31.Inner obj = new Pro31().new Inner();
        obj.show();
    }
}
