package greedy_algo;
import java.util.*;
public class Buy_Sell {

	public static void main(String[] args) {
		 int stock[]= {11,3,1,4,8,7,2,5};
		int minsofar=stock[0];
		int maxprofit=0;
		for(int i=0;i<stock.length;i++) {
			minsofar=Math.min(minsofar, stock[i]);
		maxprofit=Math.max(maxprofit, stock[i]-minsofar);
		}

System.out.println(maxprofit);
	}

}
