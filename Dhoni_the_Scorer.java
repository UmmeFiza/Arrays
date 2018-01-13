//Dhoni the scorer
/*
 * Input Format:
First line of the input contains an integer “N” that specifies the number of Dhoni's top scores.
Next “N” lines contains each the top score of Dhoni in the order of year.
 
Output Format:
Output should display the top scores of Dhoni in the order reversed, line by line.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 

Sample Input1:
3
150
200
100
Sample Output1:
100 
200 
150
 
Sample Input2:
-5
Sample Output2:
Invalid Input
 
Sample Input3:
3
600
-200
Sample Output3:
Invalid Input
 */
//package Arrays_API;
import java.util.*;
public class Dhoni_the_Scorer {
    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        int n = Integer.parseInt(s.nextLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        int[] score = new int[n];
	        for(int i=0;i<n;i++){
	            score[i] =Integer.parseInt(s.nextLine()); 
	            if(score[i]<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	            }
	        }
	        for(int i = n-1;i>=0;i--){
	            System.out.println(score[i]+" ");
	        }
	    }
	
}
