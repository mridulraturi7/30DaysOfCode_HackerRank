package dayTwentyFive;

import java.util.Scanner;

public class Day25
{
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t>0)
        {
            boolean check;
            int n = scan.nextInt();
            check = isPrime(n);
            t--;

            if(check == true)
            {
                System.out.println("Prime");
            }

            else if(check == false)
            {
                System.out.println("Not prime");
            }
        }
        scan.close();
    }

    static boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 
            
        if (n <= 3) 
            return true;

        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
    }
}