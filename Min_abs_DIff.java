package greedy_algo;

import java.util.Arrays;

public class Min_abs_DIff {

	public static void main(String[] args) {
		int a[]= {4,1,8,7};
		int b[]= {2,3,6,5};
		
		Arrays.sort(a);
		Arrays.sort(b);
		int minDiff=0;
		for(int i=0;i<a.length;i++) {
			minDiff+=a[i]-b[i];
			if(minDiff<0) {
				minDiff=minDiff*(-1);
			}
		}
		System.out.println(minDiff );
	}

}
