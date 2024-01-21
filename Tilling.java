package recursion1;

public class Tilling {

	public static int ways(int n) {
		if(n==1||n==0) {
			return 1;
		}
		int ver=ways(n-1);
		int horz=ways(n-2);
		return ver+horz;
	}
	public static void main(String[] args) {
		System.out.println(ways(5));
		
		
	}

}
