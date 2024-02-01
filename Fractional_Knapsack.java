package greedy_algo;
import java.util.*;
import java.util.Comparator;

public class Fractional_Knapsack {

	public static void main(String[] args) {
	int value[]= {60,100,120};
	int weight[]= {10,20,30};
	int w=50;
	int finalvalue=0;
	double ratio[][]=new double[value.length][2];
	
	for(int i=0;i<ratio.length;i++) {
		ratio[i][0]=i;
		ratio[i][1]=value[i]/(double)weight[i];
		
	}
	int capacity=w;
	Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
	for(int i=value.length-1;i>=0;i--) {
	int idx= (int)ratio[i][0];
	if(capacity>=weight[idx]) {
		finalvalue+=value[idx];
		capacity-=weight[idx];
	}else {
		finalvalue += (ratio[i][1]*capacity);
		capacity=0;
		break;
	}
	}
	System.out.println(finalvalue);
	}

}
