//Scoring rate 

/*
 * Write a program to determine the average of the all the spike points.

Input Format:
First line of the input is an integer “n” that contains the number of overs.
Next “n” lines contains integers that specifies the runs per over of each of the “n” over.

Output Format:
Output should print the average of the spike points corrected to two decimal places, in a line.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program.

Sample Input 1:
5
19
15
20
10
12
Sample Output 1:
17.00

Sample Input 2:
-5
Sample Output 2:
Invalid Input

Sample Input 3:
4
15
-9
Sample Output 3:
Invalid Input 
 */

//Source Code:

import java.util.*;
	import java.text.*;
public class Scoring_Rate {
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        int n = Integer.parseInt(s.nextLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        int[] score = new int[n];
	        int i=0;
	        int count = 1;
	        for(i = 0 ; i<n;i++){
	            score[i] = Integer.parseInt(s.nextLine());
	            if(score[i]<0){
	               System.out.println("Invalid Input");
	                System.exit(1); 
	            }
	        }
	        float sum = 0;
	        int z = 0;
	        for(i = 0 ; i<n; i++){
	            if(i==0){
	                if(score[i] > score[i+1]){
	                    sum = sum+score[i];
	                    z++;
	                }
	            }
	            else if(i == (n-1)){
	                if(score[i]>score[i-1]){
	                    sum = sum+score[i];
	                    z++;  
	                }
	            }
	            else {
	                if(score[i]>score[i-1] && score[i]>score[i+1]){
	                    sum = sum+score[i];
	                    z++;
	                }
	            }
	        }
	        
	        float avg = (float)sum/z;
	        
	            DecimalFormat df = new DecimalFormat("#.00");
	            System.out.println(df.format(avg));
	   }
}
