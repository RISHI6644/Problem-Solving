import java.util.Arrays;
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String S = sc.next();
            char[] words = S.toCharArray();

            for (int x = 0; x < words.length; x++) {
                if (x % 2 == 0) {
                    System.out.print(words[x]);
                }
            }

            System.out.print(" ");

            for (int y = 0; y < words.length; y++) {
                if (y % 2 != 0) {
                    System.out.print(words[y]);
                }
            }
            System.out.println();
            }
        }
}