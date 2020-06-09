package dayEighteen;

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Day18 {

        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<>();
    
        void pushCharacter(char ch)
        {
            stack.push(ch);
        }
    
        char popCharacter()
        {
            return stack.pop();
        }
    
        void enqueueCharacter(char ch)
        {
            queue.add(ch);
        }
    
        char dequeueCharacter()
        {
            return queue.remove();
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();

        Day18 d = new Day18();

        for (char c : s) {
            d.pushCharacter(c);
            d.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (d.popCharacter() != d.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
    
}