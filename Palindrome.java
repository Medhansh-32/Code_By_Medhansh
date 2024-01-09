package loops;

public class Palindrome {

	public static void main(String[] args) {
		int org =129873;
		int dig=1;
		
		while(org!=0) {
		org =org%10;
		
	org =org/10;
	dig +=1;
		}
		System.out.println(dig);
		
//		int rem =0;
//		int reversed=0;
//		while(org!=0){
//		    rem =org%10;
//		   rem =rem*divider;
//		   
//		   
//		reversed += rem;
//		rem =0;
//		divider=divider/10;
//		org = org/10;
//
//		}
//	System.out.println(reversed);
//	if(org == reversed) {
//		System.out.println("it is palindrome");
//	}
//	else{
//			System.out.println("it is not palindrome");
//		}
	}
	}


