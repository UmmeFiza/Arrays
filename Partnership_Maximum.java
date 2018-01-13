//Partnership Maximum

/*Input Format:
First line of the input contains an integer “n” that specifies the number of partnerships in the match.
Next “n” lines contain each an integer that specifies the runs scored in each of the partnerships.

Output Format:
Output should display the indices of the 3 consecutive partnerships that is maximum, in separate lines.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 

Sample Input 1:
5
40
70
30
80
50
Sample Output 1:
2
3
4

Sample Input 2:
5
40
70
-30
Sample Output 2:
Invalid Input 
*/

//Source Code:

import java.util.*;
import java.io.*;
public class Partnership_Maximum {
	    public static void main(String args[])throws Exception{
	       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(bf.readLine());
	        int max = 0;
	        int imax = 0;
	        
	      
	        int i = 0;
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        
	        int[] runs = new int[n];
	        for(i=0;i<n;i++){
	            runs[i] = Integer.parseInt(bf.readLine());
	            if(runs[i]<0){
	                
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	        }
	        
	            for(i=0;i<n-2;i++){
	                int sum = 0;
	                 sum = runs[i]+runs[i+1]+runs[i+2];
	            if(sum>max){
	                max = sum;
	                imax = i;
	            }
	            }
	            System.out.println(imax+1);
	            System.out.println(imax+2);
	            System.out.println(imax+3);
	        
	    
	    
	    
	}
}
