//Greatest win of India

/*
 * --> Array A contains “n” character elements that specifies if the “n” wins are by defending denoted by “W” or by chasing denoted by “R”. eg., n = 5 here and A= {R, W, R, W, W}
--> Array B contains “n” integers that specifies the “n” wins were won by how many wickets if Ai = W  or by how many runs if  Ai = R eg., n = 5 here and B = {23, 3, 78, 2, 8}

With these details, write a program to print the greatest win of India when defending as well as chasing the opponent. 

Input Format:
First line of the input is an integer “n” the number of wins under Dhoni.
Next “n” even numbered lines contains the character “W” or “R” based on the win by number of wickets when defending or by number of wins when chasing.
Odd numbered lines contains an integer that specifying the number of runs or wickets.

Output Format:
In the first line display an integer showing the number of runs for the greatest win.
In the second line display an integer showing the number of wickets for the greatest win. 
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 

Sample Input 1:
5
R
37
W
3
R
41
R
77
W
4
Sample Output 1:
77
4

Sample Input 2:
-5
Sample Output 2:
Invalid Input

Sample Input 3:
4
W
3
R
-25
Sample Output 3:
Invalid Input 
 */
//Source Code:

import java.io.*;
public class India_Win {
	    public static void main(String args[])throws Exception{
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        
	        int wins = Integer.parseInt(bf.readLine());
	        if(wins < 0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        char[] type = new char[wins];
	        int[] by = new int[wins];
	        
	        for(int i=0;i<wins;i++){
	            type[i] = bf.readLine().charAt(0);
	            by[i] = Integer.parseInt(bf.readLine());
	            if(by[i] < 0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	        }
	        
	        int rmax = -1,wmax = -1;
	        for(int i=0;i<wins;i++){
	            switch(type[i]){
	                case 'R': if(by[i] > rmax){
	                                rmax = by[i];
	                          }
	                          break;
	                case 'W': if(by[i] > wmax){
	                                wmax = by[i];
	                          }
	                          break;
	            }
	            
	        }
	        System.out.println(rmax+"\n"+wmax);
	    }
	
}
