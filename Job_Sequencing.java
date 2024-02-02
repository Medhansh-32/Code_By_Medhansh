package greedy_algo;
import java.util.*;
public class Job_Sequencing {

	static class Job{
		int deadline;
		int profit;
	    int id;
	
	public Job(int deadline,int profit  ,int id){
		this.profit=profit;
		this.deadline=deadline;
		this.id=id;
	}
	}
	public static void main(String[] args) {
	int jobsinfo[][]= {{4,20},{1,10},{1,40},{1,30}};
	ArrayList<Job> jobs=new ArrayList<>();
	
	for(int i=0;i<jobsinfo.length;i++) {
		jobs.add( new Job(jobsinfo[i][0],jobsinfo[i][1],i));
	}
	Collections.sort(jobs,(a,b)->b.profit-a.profit);
	ArrayList<Integer> seq=new ArrayList<>();
	int time=0;
	for(int i=0;i<jobs.size();i++) {
		Job curr=jobs.get(i);
		if(curr.deadline>time) {
			seq.add(curr.id);
			time++;
		}
	}
	System.out.println(seq);
	}

}
