package stack;
import java.util.*;
public class Duplicate_paranthessis {
	
public static boolean checkpara(String str) {
	Stack<Character> s=new Stack<>();
for(int i=0;i<str.length();i++) {
	char ch=str.charAt(i);
	if(ch==')') {
		int count=0;
		while(s.peek()!='(') {
		
			s.pop();
		count ++;	
		}
		if(count<1) {
			return true;
		}else {
			s.pop();
		}
	}else {
		s.push(ch);
	}
}
return false;
}
	
	public static void main(String[] args) {
String a="(a+b)";
String b="((a+b))";
System.out.println(checkpara(b));

	}

}
