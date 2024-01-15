package arraylists;
import java.util.*;
public class Container_water {

	public static int maxstore(ArrayList<Integer> cont) {
		int i=0;
		int j=cont.size()-1;
		int max=0;
		int curr=0;
		while(i<j) {
			if(cont.get(i)<cont.get(j)) {
				curr =j-i;
				curr = curr*cont.get(i);
				max=Math.max(max,curr);
				i++;
			}else {
				curr =j-i;
				curr = curr*cont.get(j);
				max=Math.max(max,curr);
				j--;

			}
			
		}
	return max;
			}
	public static void main(String[] args) {
	
		ArrayList<Integer> cont =new ArrayList<>();

		cont.add(1);
		cont.add(8);
		cont.add(6);
		cont.add(2);
		cont.add(5);
		cont.add(4);
		cont.add(8);
		cont.add(3);
		cont.add(7);
		
		Operation.print(cont);
		int ans=maxstore(cont);
	System.out.println("Max Water: "+ans );
	}

}
