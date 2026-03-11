
abstract class Vegetable {
    String color;

    public Vegetable(String color) {
        this.color = color;
    }

}

class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Potato is " + color;
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Brinjal is " + color;
    }
}

class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Tomato is " + color;
    }
}

public class Main {
    public static void main(String[] args) {
        Vegetable v1 = new Potato("brown");
        Vegetable v2 = new Brinjal("purple");
        Vegetable v3 = new Tomato("red");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
