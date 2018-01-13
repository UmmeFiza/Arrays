//Jadeja’s Admirer
/*
 * Input Format:
First line of the input is an integer “N” that specifies  the number of matches “N” he has bowled.
Next “N-1” lines contain each the number of wickets he has fetched in the N-1 matches.
Last line contains the float value of the  bowling average in all of the ”N” matches.
 
Output Format:
Output should display the missing data of number of wickets Jadeja had picked in one of the matches.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 

Sample Input1:
4
3
5
9
8.0
Sample Output1:
15
 
Sample Input2:
-1
Sample Output2:
Invalid Input
 
Sample Input3:
2
-1
Sample Output3:
Invalid Input
 
Sample Input4:
3
6
9
7.0
Sample Output4:
6
 */
//Source Code:
//package Arrays_API;
import java.util.*;
public class Jadeja_Admirer {
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int sum =0;
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        int[] a = new int[n];
	        for(int i = 0;i<(n-1);i++){
	            a[i] = s.nextInt();
	            if(a[i]<0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	            sum = sum+a[i];
	        }
	        float avg = s.nextFloat();
	        int total = (int)(avg * n)-sum;
	        
	        System.out.println(total);
	    }
	
}
