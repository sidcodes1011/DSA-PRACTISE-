package localrun;

import java.util.ArrayList;
import java.util.Vector;

import cdjd.org.checkerframework.common.reflection.qual.NewInstance;

public class JobSequencingProblem {

	  public static void main(String[] args) {
			  
		  int deadline[] = {2, 1, 2, 1, 1}; 
		  int profit[] = {100, 19, 27, 25, 15};
		  
		  ArrayList<Integer> result = null;
		  
		  result = jobSequencing (deadline ,profit );
		  
		  System.out.println("Final result :" +result);
	  }
	  
	   public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
		
		   
		   // Adding both in vector and sort in desending of profit [START]
		   Vector<Vector<Integer>> jobDone = new Vector<>();
			  int length = profit.length;
			  int profitamt;
			  int deadlineval;
			  int totalNetProfit =0;
			  System.out.println("llength :::" + length);		  
			  for (int i = 0; i < length ; i++) {
				  Vector<Integer> addVector = new Vector<>();
				  
				  addVector.add(deadline[i]);
				  addVector.add(profit[i]);
				  jobDone.add(addVector);
			}
			  System.out.println("Added vector" +jobDone);
			  jobDone.sort((a, b) -> {
			        return Integer.compare(b.get(1), a.get(1));
			        });  
			  
			  
			    int maxDeadline = 0;
			    for (int i = 0; i < jobDone.size(); i++) {
			        int d = jobDone.get(i).get(0);
			        if (d > maxDeadline) {
			            maxDeadline = d;
			        }
			    }
			    boolean[] slot = new boolean[maxDeadline + 1];

			  System.out.println("After sorting ::: "+ jobDone);
			 
			  // Adding both in vector and sort in desending of profit [End]
			   
			 // Iterating and adding in arraylist [Start]
			int count =0;
			// [[1, 40], [1, 30], [4, 20], [1, 10]]  
			//[2, 100], [2, 27], [1, 25], [1, 19], [1, 15]
			for (int i = 0; i < jobDone.size(); i++) {
				  deadlineval = jobDone.get(i).get(0);
				  profitamt   = jobDone.get(i).get(1);
				  System.out.println("deadlineval"+deadlineval);
				  System.out.println("profitamt"+profitamt);
				     for (int j = deadlineval; j > 0; j--) {

				            if (!slot[j]) {    // if slot is empty
				                slot[j] = true;
				                count++;
				                totalNetProfit += profitamt;
				                break;         // move to next job
				            }
				        }  
				  
			}
			  System.out.println(count);
			  
			  ArrayList<Integer> result = new ArrayList<>();
			    result.add(count);
			    result.add(totalNetProfit);
			 
			// Iterating and adding in arraylist [END]
			  
			  
		   return result;
	        
	    }
	  
}
