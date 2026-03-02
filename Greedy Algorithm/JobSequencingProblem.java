// Question - Job sequencing 

// You are given two arrays: deadline[], and profit[], which represent a set of jobs, where each job is associated with a deadline, 
// and a profit. Each job takes 1 unit of time to complete, and only one job can be scheduled at a time. 
// You will earn the profit associated with a job only if it is completed by its deadline.
// Your task is to find:
// The maximum number of jobs that can be completed within their deadlines.
// The total maximum profit earned by completing those jobs.
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Vector;

public class JobSequencingProblem {

    public static void main(String[] args) {

        int deadline[] = {2, 1, 2, 1, 1};
        int profit[] = {100, 19, 27, 25, 15};

        ArrayList<Integer> result = null;

        result = jobSequencing(deadline, profit);

        System.out.println("Final result :" + result);
    }

    public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        Vector<Vector<Integer>> jobDone = new Vector<>();
        int length = profit.length;

        for (int i = 0; i < length; i++) {
            Vector<Integer> addVector = new Vector<>();
            addVector.add(deadline[i]);
            addVector.add(profit[i]);
            jobDone.add(addVector);
        }

        jobDone.sort((a, b) -> {
            return Integer.compare(a.get(0), b.get(0));
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < jobDone.size(); i++) {

            int deadlineVal = jobDone.get(i).get(0);
            int profitVal = jobDone.get(i).get(1);

            pq.offer(profitVal);
            if (pq.size() > deadlineVal) {
                pq.poll();
            }
        }
        int totalNetProfit = 0;
        for (int p : pq) {
            totalNetProfit += p;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(pq.size());
        result.add(totalNetProfit);

        return result;
    }
}
