package dayTwelve;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{

	private int[] testScores;

    Student(String firstName, String lastName, int id, int[] scores)
    {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    public char calculate()
    {
        int sum=0,average;
        for(int i=0; i<testScores.length; i++)
        {
            sum = sum + testScores[i];
        }

        average = sum/testScores.length;

        if(average>=90 && average<=100)
            return 'O';

        if(average>=80 && average<90)
            return 'E';

        if(average>=70 && average<80)
            return 'A';

        if(average>=55 && average<70)
            return 'P';

        if(average>=40 && average<55)
            return 'D';

        return 'T';
    }
   
}

public class Day12
{
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}