package greedy_algo;
import java.util.*;
public class Activity_selection {

	public static void main(String[] args) {
		int start[] ={1,3,0,5,8,5};
int end[]= {2,4,6,7,9,9};

ArrayList<Integer> idx=new ArrayList<>();
int count=1;
idx.add(0);
int lastend=end[0];
for( int i=1;i<start.length;i++) {
	if(start[i]>=lastend) {
		count++;
		idx.add(i);
		lastend=end[i];
		
	}
}
System.out.println(count);
for(int i=0;i<idx.size();i++) {
	System.out.print(" A"+idx.get(i));
}
	}

}
