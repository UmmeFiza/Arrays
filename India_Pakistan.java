//India-Pakistan

/*
 Given the venues of “n” matches that India played against Pakistan under Dhoni, 
 Total runs put on board by India and the year when each of the matches were held, find the highest total scored by India in a particular year “x”.
 Input Format:
First line of the input is an integer “n” that specifies the number of matches India played against Pakistan under Dhoni.
Every 3 lines from second line “n” times, contains each the details of the venue of the match, total runs scored by India and the year the match was held.
Last line is an input “x” that specifies the particular year during which the highest total scored by India has to be found.

Output Format:
Output should display the venue of the match and the highest score that Team India put up against Pakistan on a particular year, separated by hyphen.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 

Sample Input 1:
5
Eden Gardens
258
2015
VCA Ground
190
2011
Gandhi Stadium
298
2015
Feroz Shah Kotla Ground
320
2013
Brabourne Stadium
224
2015
2015
Sample Output 1:
Gandhi Stadium-298

Sample Input 2:
5
Eden Gardens
258
2015
VCA Ground
-190
Sample Output 2:
Invalid Input
 */

//Source Code:

import java.io.*;
public class India_Pakistan {
	
	public static void main(String args[])throws Exception{
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        
	        int n = Integer.parseInt(bf.readLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        String[] venue = new String[n];
	        int[] score = new int[n];
	        int[] year = new int[n];
	        
	        for(int i = 0 ;i<n;i++){
	            venue[i] = bf.readLine();
	            score[i] = Integer.parseInt(bf.readLine());
	            if(score[i]<0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	            year[i] = Integer.parseInt(bf.readLine());
	            if(year[i]<0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	        }
	        int searchYear = Integer.parseInt(bf.readLine());
	        if(searchYear < 0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        int max = -1,pos = 0;
	        for(int i = 0;i<n;i++){
	            if(searchYear == year[i]){
	                if(score[i]>max){
	                    max = score[i];
	                    pos = i;
	                }
	            }
	        }
	        System.out.println(venue[pos]+"-"+score[pos]);
	    }
	
}
