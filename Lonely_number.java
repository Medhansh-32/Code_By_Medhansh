package arraylists;
import java.util.*;
public class Lonely_number {
public static ArrayList<Integer> lonely(ArrayList<Integer> data){
ArrayList<Integer> ans=new ArrayList<Integer>();
	for(int i=0;i<data.size();i++) {
		if(data.indexOf(data.get(i)-1)==-1&&data.indexOf(data.get(i)+1)==-1) {
			
		}else {
			ans.add(data.get(i));
		}
		if(data.indexOf(data.get(i))!=-1) {
		if(data.indexOf(data.get(i))==i) {
			
		}else {
			ans.add(data.get(i));	
		}
	}
	}
	data.removeAll(ans);
return data;
}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> data=new ArrayList<Integer>();
		data.add(1);
		data.add(3);
		data.add(5);
		data.add(3);
		
System.out.println(lonely(data));
	}

}
