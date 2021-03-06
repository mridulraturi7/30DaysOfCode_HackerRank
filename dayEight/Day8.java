package dayEight;

import java.util.Scanner;
import java.util.*;

public class Day8 {

    public static void main(String []argh){
        
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
        }

        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.containsKey(s))
            {
                System.out.printf("%s=%d\n",s,phoneBook.get(s));
            }

            else{
                System.out.println("Not found");
            }
        }

        in.close();

    }
    
}