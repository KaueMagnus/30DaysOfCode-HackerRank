//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Day8DictionariesAndMaps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String, Integer> myMap = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name, phone);

        }
        while(in.hasNext()){
            String name = in.next();
            // Write code here
            if (myMap.containsKey(name)) {
                int phone = myMap.get(name);
                System.out.println(name + "=" + phone);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}