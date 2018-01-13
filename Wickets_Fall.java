//Fall of wickets 

/*
 An unusual increase in the graph, usually higher than its adjacent points is called a Spike. First and last points can also be the spike points. Given the runs per over of “n” overs as an Array, find the indices of the spike points.



Input Format:
First line of the input is an integer “n” that contains the number of overs.
Next “n” lines contains integers that specifies the runs per over of each of the “n” over.


Output Format:
Output should print the indices of the spike points in seperate lines.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 

Sample Input 1:
5
19
15
20
10
12
Sample Output 1:
1
3
5

Sample Input 2:
-5
Sample Output 2:
Invalid Input

Sample Input 3:
4
15
-2
Sample Output 3:
Invalid Input
 */

//Source Code:

import java.util.*;
import java.io.*;
public class Wickets_Fall {
	    public static void main(String args[])throws Exception{
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(bf.readLine());
	        int i=0;
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        
	            int[] runs = new int[n+1];
	            for(i=0;i<n;i++){
	                runs[i] = Integer.parseInt(bf.readLine()); 
	                if(runs[i] < 0){
	                    System.out.println("Invalid Input");
	                    System.exit(1);
	                }
	            }
	            
	            for(i=0;i<n;i++){
	                if(i==0){
	                    if(runs[i]>runs[i+1]){
	                        System.out.println(1);
	                    }
	                }
	                else if(i==(n-1)){
	                    if(runs[i]>runs[i-1]){
	                        System.out.println(i+1);
	                    }
	                }
	                else{
	                    if(runs[i]>runs[i-1] && runs[i] > runs[i+1]){
	                        System.out.println(i+1);
	                    }
	                }
	            }
	}
}
