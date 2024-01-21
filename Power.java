package recursion1;
import java.util.*;
public class Power {

public static int pow(int base,int power) {
	
	if(power==1) {
		return base;
	}
	return base * pow(base,power-1);
}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in); 
	System.out.println("Enter the base Value :");
		int base=sc.nextInt();
		System.out.println("Enter the power Value :");
		int pow=sc.nextInt();
		
		System.out.println("Ans : "+pow(base,pow));

	}

}
