/*public class Jobtest {
  public static void mani(String... args){
      MyQueueLinked q = 
  }
}*/

public class JobTest{
    public static void main (String... args) {
        MyQueueLinked q = new MyQueueLinked();

        int[][] jobs = {{1,  5, 1, 10},
                        {2, 10, 2, 65},
                        {3, 20, 3, 91},
                        {4, 30, 4, 1099},
                        {5, 40, 5, 100}};
                        
        System.out.println("Job Queue:");
        System.out.println("------------------------------------------------------------------------------------");
        for (int i = 0; i < jobs.length; i++) {
            MyQueueLinked temp = new MyQueueLinked();
            int job_id = jobs[i][0];
            int job_size = jobs[i][1];
            int priority_id = jobs[i][2];
            int arrival_time = jobs[i][3];
            Job job = new Job(job_id, job_size, priority_id, arrival_time);

            if (q.isEmpty())  q.enqueue(job);
             else {
                MyQueueLinked temp2 = new MyQueueLinked();
                while (!q.isEmpty()) {
                    if (((Job) q.peek()).compareTo(job) > 0)   temp.enqueue(q.dequeue());
                    else temp2.enqueue(q.dequeue());
                }
                int temp2Size = temp2.size();
                for (int j = 0; j < temp2Size; j++)   q.enqueue(temp2.dequeue());
                
                q.enqueue(job);
                int tempSize = temp.size();
                for (int j = 0; j < tempSize; j++)    q.enqueue(temp.dequeue());
            }
            System.out.printf("Job %d size: %d | ", i+ 1, job.getJobSize());
        }
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Queue: ");
            System.out.println("------------------------------------------------------------------------------------");
            int size = q.size();

            for (int j = 0; j < size; j++) {
                Job jb = (Job) q.dequeue();
                System.out.printf("Job %d size: %d | ", j + 1, jb.getJobSize());
            }
    }//end of main

}//end of class