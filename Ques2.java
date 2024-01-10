//Question 2 :Write a program to find the factorialof any number entered by the user
package loops;
import java.util.*;
public class Ques2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	for(int i = number -1;i>=1;i--) {
	
		number *= i;
	}
System.out.println(number);
	}

}
