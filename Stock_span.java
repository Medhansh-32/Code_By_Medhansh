package stack;
import java.util.*;

public class Stock_span {
	public static int[] span(int stock[],int span[]) {
		int i=0;
		Stack<Integer> s=new Stack<>();
		i+=1;
		s.push(0);
		span[0]=1;
		for(i=1;i<span.length;i++) {
			while(s.isEmpty()!=true&&stock[i]>stock[s.peek()]) {
			s.pop();	
			}
			if(s.isEmpty()==true) {
				span[i]=i+1;
			}else {
				span[i]=i-s.peek();
						
			}
			s.push(i);
		}
		
		
		
	return span;
	}
	public static void main(String[] args) {
	int stock[]= {100,80,60,70,60,85,100};
	int span[]=new int[stock.length];
	
	span=span(stock,span);
for(int i=0;i<span.length;i++) {
	System.out.println(span[i]);
}
	}

}
