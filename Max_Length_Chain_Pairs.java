package greedy_algo;
import java.util.*;

public class Max_Length_Chain_Pairs {

	public static void main(String args[]) {
int chain[][]= {{5,24},{39,60},{5,28},{27,40},{50,90}};

Arrays.sort(chain,Comparator.comparingDouble(o -> o[1]));
ArrayList<Integer> indx=new ArrayList<Integer>(); 

int lastend=chain[0][1];
int count=1;	
indx.add(chain[0][0]);
for(int i=1;i<chain.length;i++) {
if(chain[i][0]>lastend) {
	count++;
	indx.add(chain[i][0]);
	lastend=chain[i][1]; 
}
	}
	System.out.println(count);
	System.out.println(indx);
	}
}
