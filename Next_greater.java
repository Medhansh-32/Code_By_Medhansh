package stack;
import java.util.*;
public class Next_greater {
public static int[] greater(int arr[]) {
	Stack<Integer> s=new Stack<>(); 
	int i=0;
	int great[]=new int[arr.length];
	for(i=0;i<arr.length;i++) {
	while(!s.isEmpty()&& arr[s.peek()]<=arr[arr.length-1-i]) {
		s.pop();
	}
		if(s.isEmpty()==true) {
			great[arr.length-1-i]=-1;
		}else {
			great[arr.length-1-i]=arr[s.peek()];
		}
	s.push(arr.length-1-i);
	
	}
	
	return great;
}
	
	public static void main(String[] args) {
int arr[]= {6,8,0,1,3};
int ans[]=new int[arr.length];
ans=greater(arr);
for(int i=0;i<arr.length;i++) {
	System.out.print(ans[i]+"  ");
}
	}

}
