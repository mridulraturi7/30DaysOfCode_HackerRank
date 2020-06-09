package dayEighteen;

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Day18 {

        // Write your code here.
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

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 d = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            d.pushCharacter(c);
            d.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (d.popCharacter() != d.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
    
}