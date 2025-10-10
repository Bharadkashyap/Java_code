//WriteajavaprogramtouseNestedInterface

interface OuterInterface {
    interface InnerInterface {
        void display();
    }
}

class NestedInterfaceDemo implements OuterInterface.InnerInterface {
    public void display() {
        System.out.println("Nested Interface Method");
    }

    public static void main(String[] args) {
        new NestedInterfaceDemo().display();
    }
}
