import java.util.Scanner;

public class p31starpattern {
    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) {
            // one line
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
