package stack;
import java.util.*;
public class Max_area {
	public static int[] smallerright(int arr[]) {
		Stack<Integer> s=new Stack<>(); 
		int i=0;
		int great[]=new int[arr.length];
		for(i=0;i<arr.length;i++) {
		while(!s.isEmpty()&& arr[s.peek()]>=arr[arr.length-1-i]) {
			s.pop();
		}
			if(s.isEmpty()==true) {
				great[arr.length-1-i]=great.length;
			}else {
				great[arr.length-1-i]=s.peek();
			}
		s.push(arr.length-1-i);
		
		}
		
		return great;
	}public static int[] smallerleft(int arr[]) {
		Stack<Integer> s=new Stack<>(); 
		int i=0;
		int great[]=new int[arr.length];
		for(i=0;i<arr.length;i++) {
		while(!s.isEmpty()&& arr[s.peek()]>=arr[i]) {
			s.pop();
		}
			if(s.isEmpty()==true) {
				great[i]=-1;
			}else {
				great[i]=s.peek();
			}
		s.push(i);
		
		}
		
		return great;
	}
	public static int area(int hieght[]) {
		Stack<Integer> s=new Stack<>();
		int area[]=new int[hieght.length];
		int rightsmaller[]=smallerright(hieght);
		int leftsmaller[]=smallerleft(hieght);
		int greater=0;
		for(int i=0;i<hieght.length;i++) {
			area[i]=hieght[i]*(rightsmaller[i]-leftsmaller[i]-1);
			
		if(greater>area[i]) {
			continue;
		}else {
			greater=area[i];
		}
		}
		return greater;
	}

	public static void main(String[] args) {
	int arr[]= {2,1,5,6,2,3};
System.out.println(area(arr));
	}

}
