package recursion1;
import java.util.*;
public class Factorial {
public static int fact(int data) {
	if(data==0) {
		return 1;
	}else {
		return data*fact(data-1);
	}
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int data=sc.nextInt();
		int factorial=fact(data);
System.out.println(factorial);
	}

}
