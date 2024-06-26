import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Day10BinaryNumbers {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        char[] binary = Integer.toBinaryString(n).toCharArray();
        int tmpCount = 0;
        int maxCount = 0;
        for(int i = 0; i < binary.length; i++){
            tmpCount = (binary[i] == '0') ? 0 : tmpCount + 1;
            if(tmpCount > maxCount){
                maxCount = tmpCount;
            }
        }
        System.out.println(maxCount);
    }
}