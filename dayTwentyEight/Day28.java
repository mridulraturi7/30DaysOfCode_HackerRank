package dayTwentyEight;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Day28
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String string = "[a-z]+@gmail\\.com$";

        Pattern p = Pattern.compile(string);

        List<String> list = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Matcher m = p.matcher(emailID);

            if(m.find())
            {
                list.add(firstName);
            }
        }

        Collections.sort(list);

        for(String firstName : list)
        {
            System.out.println(firstName);
        }

        scanner.close();
    }

}