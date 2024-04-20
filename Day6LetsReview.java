import java.io.*;
import java.util.*;

public class Day6LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            String s_even = "";
            String s_odd = "";
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    s_even = s_even + s.charAt(j);
                } else {
                    s_odd = s_odd + s.charAt(j);
                }
            }
            System.out.println(s_even + " " + s_odd);
        }
    }
}
