//Brilliant captaincy
/*
 * Input Format:
First line of the input is an integer “N” that specifies the scores of Dhoni in all “N” matches of the series.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program.
 
Output Format:
Output should display a float value that gives the average of Dhoni's scores in the complete series. 
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 
 
Sample Input1:
5
10
20
30
 0
 0
Sample Output1:
12.0
 
Sample Input2:
-3
Sample Output2:
Invalid Input
 
Sample Input3:
2
40
-60
Sample Output3:
Invalid Input
 */
//Sourve Code:
//package Arrays_API;
import java.util.*;
public class Brilliant_Captaincy {
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        int sum =0;
	        int n = Integer.parseInt(s.nextLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        int[] runs = new int[n];
	        for(int i = 0;i<n;i++){
	            runs[i] = Integer.parseInt(s.nextLine());
	             if(runs[i]<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	            }
	            sum = sum + runs[i];
	        }
	        float avg = (float)sum/n;
	        System.out.println(avg);
	    }
	
}
