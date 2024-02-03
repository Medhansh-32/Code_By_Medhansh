package greedy_algo;

public class Lexi_small {

	public static void main(String[] args) {
	int n=42;
	int k=5;
	StringBuilder ans=new StringBuilder("");
	char alpha[]=new char[26];
for(char i='a';i<='z';i++) {
	alpha[i-'a']=i;
}
int temp=n;
for(int i=0;i<k;i++) {
	ans.append('a');
}
if(n<25) {
int i=1;
while(n!=0) {
temp=Math.min(25,n);
ans.setCharAt(ans.length()-i , alpha[temp-k]);
n-=Math.min(25, n);
i++;
}
}else {
	int i=1;
	while(n!=0) {
	temp=Math.min(25,n);
	ans.setCharAt(ans.length()-i , alpha[temp]);
	n-=Math.min(25+k, n);
	i++;	
}
}
	
System.out.println(ans);
}
}
