package Queue;
import java.util.*;
public class Queue_2stack {
	public static class Queue{
	public static	Stack<Integer> s1=new Stack<>();
    public static Stack<Integer> s2= new Stack<>();
    public static boolean isEmpty() {
    	if(s1.isEmpty()==true) {
    		return true;
    	}else {
    		return false;
    	}
    }
public static void add(int data){


    while(!s1.isEmpty()) {
    	s2.push(s1.pop());
    }
    s1.push(data);   
    while(!s2.isEmpty()) {
    	s1.push(s2.pop());
    }
    
}
    
public static int remove() {
	if(isEmpty()) {
		return-1;
	}
	int data=s1.pop();
return data;
}
public static int peek() {
	int data=s1.peek();
return data;	
}
}
	public static void main(String[] args) {
	Queue q1=new Queue();
	q1.add(1);
	q1.add(2);
	q1.add(3);
	
		System.out.println(q1.peek());
q1.remove();
System.out.println(q1.peek());
q1.remove();
System.out.println(q1.peek());
q1.remove();

	}

}
