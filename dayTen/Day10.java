package dayTen;

import java.util.*;

public class Day10
{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> binary = new ArrayList<Integer>();

        int rem;

        while(n > 0)
        {
            rem = n%2;
            binary.add(rem);
            n = n/2;
        }

        int count = 0, res = 0;

        for(int i=0; i < binary.size(); i++)
        { 
            if(binary.get(i) == 1)
            {
                count++;
            }
            else
            {
                count = 0;
            }
            if(count > res)
            res = count;
        }

        System.out.println(res);

        scanner.close();
    }
}