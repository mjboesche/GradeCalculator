//Mitchell Boesche
//Grade Calculator

import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeCalculator 
{
	public static void main(String[] args) 
	{
		DecimalFormat dc = new DecimalFormat("###.##");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Mitchell's Grade Calculator!");
		System.out.println("---------------------------------------");
		double grade = 0;
		double totalweight = 0;
		int go = 1;
		while (go == 1)
		{
			System.out.println("Please enter the weight of the category!: ");
			double weight = scanner.nextDouble();
			totalweight = totalweight + weight;
			System.out.println("Please enter the total amount of possible points!: ");
			double possible = scanner.nextDouble();
			System.out.println("Please enter number of points earned (Including Extra Credit Points)!: ");
			double earned = scanner.nextDouble();
			double points = (earned/possible) * weight;
			grade = grade + points;
			System.out.println("1 = Another Category or 0 = Done: ");
			go = scanner.nextInt();
		}
		
		if (totalweight > 100.00)
		{
			System.out.println("-----------------------------------------------");
			System.out.println("Error! Total weight cannot be greater than 100!");
			System.out.println("-----------------------------------------------");
		}
		else if (grade >= 90.00)
		{
			System.out.println("---------------------------------");
			System.out.println("Your grade is " +  dc.format(grade) +  " which is an A!");
			System.out.println("---------------------------------");
		}
		else if (grade >= 80.00)
		{
			System.out.println("---------------------------------");
			System.out.println("Your grade is " +  dc.format(grade) +  " which is a B!");
			System.out.println("---------------------------------");
		}
		else if (grade >= 70.00)
		{
			System.out.println("---------------------------------");
			System.out.println("Your grade is " +  dc.format(grade) +  " which is a C!");
			System.out.println("---------------------------------");
		}
		else if (grade >= 60.00)
		{
			System.out.println("---------------------------------");
			System.out.println("Your grade is " +  dc.format(grade) +  " which is a D!");
			System.out.println("---------------------------------");
		}
		else
		{
			System.out.println("---------------------------------");
			System.out.println("Your grade is " + dc.format(grade) + " which is a F!");
			System.out.println("---------------------------------");
		}
		scanner.close();
	}
}
