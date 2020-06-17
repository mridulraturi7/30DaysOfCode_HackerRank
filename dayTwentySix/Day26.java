package dayTwentySix;

public class Day26
{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int dayR = scan.nextInt();
        int monthR = scan.nextInt();
        int yearR = scan.nextInt();

        int dayD = scan.nextInt();
        int monthD = scan.nextInt();
        int yearD = scan.nextInt();

        if(yearR < yearD)
        {
            System.out.println("0");
        }

        else if(yearR == yearD)
        {
            if(monthR < monthD)
            {
                System.out.println("0");
            }

            else if(monthR == monthD)
            {
                if(dayR <= dayD)
                {
                    System.out.println("0");
                }
                else
                {
                    System.out.println(15 * (dayR - dayD));
                }
            }

            else
            {
                System.out.println(500 * (monthR - monthD));
            }
        }

        else
        {
            System.out.println("10000");
        }

    }

}