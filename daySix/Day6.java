package daySix;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    while(n>0)
    {
        String string = scan.next();
        new Day6().printSequence(string);
        System.out.println();
        n--;
    }

    }

    public void printSequence(String str)
    {
        for(int i=0;i<str.length();i+=2)
        {
            System.out.printf("%c",str.charAt(i));
        }

        System.out.printf(" ");

        for(int i=1;i<str.length();i+=2)
        {
            System.out.printf("%c",str.charAt(i));
        }

    }
    
}