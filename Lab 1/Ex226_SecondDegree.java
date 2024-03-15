import java.util.Scanner;
import java.lang.Math;
public class SolveEquation3 {
	public static void main(String[] args) {
	       	Scanner input = new Scanner(System.in);
	        System.out.print("Input a: ");
	        double a = input.nextDouble();
	        System.out.print("Input b: ");
	        double b = input.nextDouble();
	        System.out.print("Input c: ");
	        double c = input.nextDouble();
	        double delta=b*b-(4*a*c);
	        double OneSol= -b/(2*a);
	        double FirstSol= ((-b-Math.sqrt(delta))/(2*a));
	        double SecondSol= ((-b+Math.sqrt(delta))/(2*a));
	        if(delta<0)
	        {
	            System.out.print("No solution");
	        }
	        else if(delta==0)
	        {
	            System.out.print("One solution: "+ OneSol);
	        }
	        else {
	            System.out.print("First solution: "+ FirstSol);
	            System.out.print("\nSecond solution: "+ SecondSol);
	        }
	        input.close();
	}
}