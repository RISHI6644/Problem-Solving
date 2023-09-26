import java.io.*;
import java.util.*;

public class Day8 {
    public static void main(String[] args) {
        Map<String, Integer> phone_book = new HashMap<String, Integer>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            phone_book.put(key, value);
        }
        // System.out.println(phone_book.toString());
        while (sc.hasNext()) {
            String query = sc.next();
            if (phone_book.containsKey(query)) {
                System.out.println(query + "=" + phone_book.get(query));
            }
            else {
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}