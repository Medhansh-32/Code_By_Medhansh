package greedy_algo;
import java.util.*;
public class Kth_odd {
	public static int largestodd(int a,int b,int c) {
if(c>b) {
	return -1;
}
else{
	int l=a;
		int r=b;
		int k=c;
		ArrayList<Integer> odd=new ArrayList<>();
		for(l=-3;l<=r;l++) {
			if(l%2!=0) {
				odd.add(l);
			}
		}

	int ans=	odd.get(odd.size()-k);
return ans;
}
	}

	public static void main(String[] args) {
		System.out.println(largestodd(1,10,3));
		
	}

}
