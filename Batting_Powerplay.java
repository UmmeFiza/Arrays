//Batting powerplay
/*
 * Input Format:
First line of the input contains an integer “n” that specifies the number of batting powerplay overs in the match.
Next n lines contains each the runs scored in each of the n powerplay overs by New Zealand.
Second n lines contains each the runs scored in each of the n powerplay overs by India.
 
Output Format:
Output should print “Yes” if the runs scored by NZ in every over is highest than India else print “No”. 

Sample Input1:
4
5
6
7
8
4
3
2
1
Sample Output1:
Yes
 
Sample Input2:
4
1
2
3
5
6
7
8
9
Sample output2:
No
 
Sample Input3:
-5
Sample output3:
Invalid Input
 
Sample Input4:
5
2
3
8
-1
Sample Output4:
Invalid Input
 */
//package Arrays_API;
import java.util.*;
public class Batting_Powerplay {
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        boolean flag = true;
	        
	         int n = Integer.parseInt(s.nextLine());
	         if(n<0){
	             System.out.println("Invalid Input");
	             System.exit(1);
	         }
	         int[] nz = new int[n];
	         int[] ind = new int[n];
	         for(int i=0;i<n;i++){
	             nz[i] = Integer.parseInt(s.nextLine());
	             if(nz[i]<0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	        }
	        for(int i=0;i<n;i++){
	             ind[i] = Integer.parseInt(s.nextLine());
	             if(ind[i]<0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	        }
	        
	        for(int i =0;i<n;i++){
	            if(nz[i] <= ind[i]){
	                flag = false;
	            }
	        }
	        if(flag)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }
	
}
