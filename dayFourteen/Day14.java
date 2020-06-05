package dayFourteen;

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

  Difference(int[] elements)
  {
      this.elements = elements;
  }

  public void computeDifference()
  {
      int max = 1;
      int min = 100;
      for(int i = 0; i < elements.length; i++)
      {
          if(elements[i] < min)
              min = elements[i];

          if(elements[i] > max)
              max = elements[i];
      }
      maximumDifference = max - min;
  }

}

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
    
}