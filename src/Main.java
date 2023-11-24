import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int number;
        ArrayList<Integer> num = new ArrayList<>();

        System.out.print("Enter your number: ");
        number = t.nextInt();

        for(int i = 0; i < number; i++) {
            System.out.print("Your number : ");
            int n = t.nextInt();
            num.add(n);
        }

        Collections.sort(num);

        for(int n : num) {
            System.out.println(n);
        }

    }

}