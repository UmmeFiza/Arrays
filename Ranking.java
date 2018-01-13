//ODI Ranking
/*Input Format:
First line is the integer “n” that specifies the number of Teams.
Next “n” even numbered lines contains the names of the Teams.
Odd numbered lines contain an integer that carries the points scored by the Teams.

Output Format:
There are “n” lines in the output displaying the ODI Ranking. Each line has a Team Name followed by the points received by it with a hyphen separation.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 

Sample Input 1:
5
India
1500
Pakistan
1000
Australia
1200
South Africa
1400
West Indies
1100
Sample Output 1:
India-1500
South Africa-1400
Australia-1200
West Indies-1100
Pakistan-1000

Sample Input 2:
-5
Sample Output 2:
Invalid Input

Sample Input 3:
5
India
1000
Pakistan
-800
Sample Output 3:
Invalid Input
*/
//Source Code:
import java.util.*;
import java.io.*;
public class Ranking {
	    public static void main(String args[])throws Exception{
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(bf.readLine());
	        boolean flag = true;
	        int count = 0;
	        int imax = 0;
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        String[] team = new String[n];
	        int[] score = new int[n];
	        for(int i=0;i<n;i++){
	            team[i] = bf.readLine();
	            score[i] = Integer.parseInt(bf.readLine());
	            if(score[i]<0){
	                System.out.println("Invalid Input");
	                flag = false;
	                break;
	            }
	        }
	        if(flag){
	            while(count<n){
	            int max = 0;
	            	for(int i=0;i<n;i++){
	            		if(score[i]>max){
	            			max = score[i];
	            			imax = i;
	            		}
	            	}
	            score[imax] = 0;
	            System.out.println(team[imax]+"-"+max);
	            count++;
	            }
	        }
	    }
	}

