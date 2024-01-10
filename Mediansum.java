package array;
import java.util.*;
public class Mediansum {

	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int s= nums1.length;
		        s =s+nums2.length;
		      int sum[]  = new int[s];
		      int i=0;
		      int j=0;
		      int k=0;
		      
		   
		   for( k=0;k<nums1.length;k++) {
			   sum[k]=nums1[i];
			   i++;
		   }
	   	
		   for( k=nums1.length;k<s;k++) {
			   sum[k]=nums2[j];
			   j++;
		   }
		 
		   Arrays.sort(sum);
		      double ans=0;
		    int size = nums1.length+nums2.length;
		    int mid=size/2;
		   
		    if(s%2==0){

		ans=(sum[mid]+sum[mid-1]);
	    ans=ans/2;
		    }else{
		    	
		        ans=sum[mid];
		    }
		  return ans;
		    }
		    
		


public static void main(String args[]) {
	int nums1[]={1,3};
int nums2[]= {2,4};
double ans = findMedianSortedArrays(nums1,nums2);
System.out.println(ans);
}
	    
	}

