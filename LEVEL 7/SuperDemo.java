class Parent {
    String message = "Hello from Parent";
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    String message = "Hello from Child";

    void show() {
        super.show();
        System.out.println(super.message);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
