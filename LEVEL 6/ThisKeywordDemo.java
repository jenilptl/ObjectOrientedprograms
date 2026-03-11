class Demo {
    static int staticVar = 100;
    int instanceVar;

    Demo(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    void show() {
        System.out.println("Instance Variable: " + this.instanceVar);

        System.out.println("Access staticVar using class name: " + Demo.staticVar);
        System.out.println("Access staticVar using this: " + this.staticVar);

    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Demo d = new Demo(50);
        d.show();
    }
}
