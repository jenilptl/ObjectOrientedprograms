final class FinalClass {
    final int value = 100;

    final void display() {
        System.out.println("Value is: " + value);
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
