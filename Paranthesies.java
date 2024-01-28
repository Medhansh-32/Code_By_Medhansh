package stack;

import java.util.Stack;

public class Paranthesies {
public static boolean check(String arg) {
	Stack<Character> s=new Stack<>();
	int i=0;
	int flag=0;
while(i!=arg.length()) {
	if(arg.charAt(i)=='['||arg.charAt(i)=='{'||arg.charAt(i)=='(') {
		s.push(arg.charAt(i));
	}else {
		if(s.isEmpty()==true) {
			return false;
		}
		if(arg.charAt(i)==']'||arg.charAt(i)=='}'||arg.charAt(i)==')') {
			if(s.peek()=='['&&arg.charAt(i)==']') {
				flag=1;
				s.pop();
			}
			else if(s.peek()=='{'&&arg.charAt(i)=='}') {
				flag=1;
				s.pop();
			}else if(s.peek()=='('&&arg.charAt(i)==')') {
				flag=1;
				s.pop();
			}else {
				flag=0;
				break;
			} 
	
	}
		}
i++;
}
if(s.isEmpty()!=true) {
	return false;
}
if(flag==0) {
	return false;
}else {
	return true;
}
}
	public static void main(String[] args) {
		System.out.println(check("[])"));

	}

}
