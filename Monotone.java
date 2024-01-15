package arraylists;
import java.util.*;
public class Monotone {

	public static boolean check(ArrayList<Integer> data) {
		int flag=0;
	if(data.get(0)>=data.get(1)) {
		for(int i=0;i<data.size()-1;i++) {
			if(data.get(i)>=data.get(i+1)) {
		flag=1;
		}else {
			flag=0;
		
	}
	}
	}
		if(data.get(0)<=data.get(1)) {
			for(int i=0;i<data.size()-1;i++) {
				if(data.get(i)<=data.get(i+1)) {
			flag=1;
			
			}else {
				flag=0;
			}
	}
		}
		if(flag==0) {
			return false;	
		}else {
			return true;
		}
	
	}
	
	public static void main(String[] args) {
	ArrayList<Integer> data=new ArrayList<>();
	data.add(1);
	data.add(3);
	data.add(2);
	//data.add(4);

System.out.println(check(data));

	}

}
