import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        while (true) {
            System.out.print("Enter a sentence (type 'quit' to exit): ");
            String sentence = sc.nextLine().toLowerCase();

            if (sentence.equals("quit")) break;

            for (char ch : sentence.toCharArray()) {
                switch (ch) {
                    case 'a': a++; break;
                    case 'e': e++; break;
                    case 'i': i++; break;
                    case 'o': o++; break;
                    case 'u': u++; break;
                }
            }
        }

        System.out.println("\nTotal vowel counts:");
        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);
    }
}
