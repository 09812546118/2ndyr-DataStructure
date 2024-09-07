/**
*  job
*/
public class Job implements Comparable{

   private int job_id;
   private int job_size;
   private int priority_id;
   private int arrival_time;
   //
   private int status;  //0=waiting,1=process,2=finish
   
   public Job(int job_id,int job_size,int priority_id,int arrival_time){
      this.job_id = job_id;
      this.job_size = job_size;
      this.priority_id = priority_id;
      this.arrival_time = arrival_time;
   }
   
   public void setStatus(int status)   { this.status = status; }
   public int getStatus()             { return status; }
   //
   public int getJobSize()             { return job_size;}
   //
   public void setPriority(int priority_id)  { this.priority_id = priority_id; }
   public int getPriority()            { return priority_id;}
   
   public int compareTo(Object obj){
      Job job=null;
      if(obj instanceof Job){
         job = (Job)obj;
         return (job_size - job.getJobSize()); //if positive, the current is larger,negative smaller,0 equal
      }
      return 0;
   }
   
}//end of class