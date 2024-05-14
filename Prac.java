package practice;
import java.util.*;
public class Prac {

	static class Multithread implements Runnable{
		String color;
		int duration;
		
		Multithread(String color,int duration){
			this.color=color;
			this.duration=duration;
		}
		
		@Override
		public void run() {
			try {
System.out.println("TrafficLight is "+this.color+" ......");
					Thread.sleep(this.duration);
					
				
			} catch (InterruptedException e) {
				
			System.out.println("Error :"+e);	
			}
		}
		
		public void change() {
			
			String pres=this.color;
			 if (pres.equals("green")) {
			        this.color = "red";
			    } else if (pres.equals("red")) {
			        this.color = "green";
			    }
			
		}
	
        public void check() {
        	System.out.println("Traffic Light is : "+this.color);
        }
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Traffic Light : ");
		String color=sc.nextLine();
		
		System.out.println("Enter the Traffic Light Duration : ");
		int duration =sc.nextInt();
	
		Multithread m1 = new  Multithread(color,duration);
Thread t1=new Thread(m1);
t1.start();
try {
	t1.join();
} catch (InterruptedException e) {
	
	e.printStackTrace();
}
m1.change();
m1.check();
	}

}
