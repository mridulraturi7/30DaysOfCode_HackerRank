package dayTwentyFive;

public class Day25
{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

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


    }


}