import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        double input2 = sc.nextDouble();

        sc.nextLine(); /* Reason for using this statement: Each line of multi-line input contains an invisible
                           separator indicating that the end of a line of input has been reached. When we use
                           Scanner functions that read tokens (e.g.: next(), nextInt(), etc.), the Scanner reads
                           and returns the next token. But when we read an entire line (i.e.: readLine()), it reads
                           from the current position until the beginning of the next line. Because of this, a call
                           to nextLine() may return an empty string if there are no characters between the end of the
                           last read and the beginning of the next line.

                          Here, When we read a double value using scan.nextDouble(), it only reads the numeric value
                           and leaves the newline character (\n) in the input buffer. If we don't consume this newline
                           character before reading the next line using scan.nextLine(), it will consume that newline
                           character instead of reading the intended string input. */

        String input3 = sc.nextLine();
        sc.close();

        System.out.println(i + input1);
        System.out.println(d + input2);
        System.out.println(s + " " + input3);
    }
}