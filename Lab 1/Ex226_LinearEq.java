import java.util.Scanner;
public class SolveEquation{
	public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
        	System.out.print("Input a: ");
        	double a = input.nextDouble();
        	System.out.print("Input b: ");
        	double b = input.nextDouble();
        	if(a==0 && b==0){
            		System.out.print("Infinite solution!");}
        	else if(a==0 && b!=0){
            		System.out.print("No Solution!");}
        	else{
			double result = -b/a;
            	System.out.print(result);
	}
	input.close();}
}