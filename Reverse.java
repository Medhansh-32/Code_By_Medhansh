package Queue;
import java.util.*;
public class Reverse {
	
		
public static Queue<Integer> rev(Queue<Integer> q3){
	Stack<Integer>s=new Stack<>();
	while(q3.isEmpty()!=true) {
		s.push(q3.remove());
	}
	while(s.isEmpty()!=true) {
		q3.add(s.pop());
	}
	return q3;
}
	public static void main(String[] args) {
		Queue<Integer> q1=new LinkedList<>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		q1.add(6);
		q1.add(7);
		q1.add(8);
		q1.add(9);
		q1.add(10);
	System.out.println(q1);
		System.out.println(rev(q1));
		
	}

}
