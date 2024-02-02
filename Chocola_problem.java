package greedy_algo;
import java.util.*;
public class Chocola_problem {

	public static void main(String[] args) {
		
		Integer hc[]= {2,1,3,1,4};
		Integer vc[]= {4,1,2};
		Arrays.sort(hc,Collections.reverseOrder());
		Arrays.sort(vc,Collections.reverseOrder());
		
		int h=0;
		int v=0;
		int cost=0;
		int hp=1;
		int vp=1;
		
		while(h<hc.length&&v<vc.length) {
			if(hc[h]>=vc[v]) {
				cost+=hc[h]*vp;
				h++;
				hp++;
			}else {
				cost+=vc[v]*hp;
				v++;
				vp++;
			}
		}
while(h<hc.length) {
	cost+=hc[h]*vp;
	h++;
	hp++;
}
while(v<vc.length) {
	cost+=vc[v]*hp;
	v++;
	vp++;	
}
	System.out.println(cost);	
		
	}

}
