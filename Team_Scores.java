//Team's Season-wise score 

/*Input Format:
First line of the input is an integer “n” that specifies the number of players considered for selection.
Next “n” lines contain the names of the players.
Next “n” lines contain each an integer that specifies the runs scored by the players during the season 2015.
Next “n” lines contain each an integer that specifies the runs scored by the players during the season 2016. 

Output Format:
Output should display in “n” lines, the Name of the players and their sum of scores in both seasons, separated by a hyphen.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 

Sample Input 1:
5
S Dhawan
AT Rayudu
MS Dhoni
MK Pandey
R Ashwin
50
30
70
90
40
40
30
60
20
40
Sample Output 1:
S Dhawan-90
AT Rayudu-60
MS Dhoni-130
MK Pandey-110
R Ashwin-80

Sample Input 2:
-5
Sample Output 2:
Invalid Input

Sample Input 3:
3
R Ashwin
MS Dhoni
S Dhawan
46
-100
Sample Output 3:
Invalid Input 
*/

//Source Code:

import java.io.*;
public class Team_Scores {
	    public static void main(String args[])throws Exception{
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(bf.readLine());
	        int i=0;
	        boolean flag = true;
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        
	        String[] name = new String[n];
	        int[] run = new int[2*n];
	        for(i=0;i<n;i++){
	            name[i] = bf.readLine();
	        }
	        for(i=0;i<2*n;i++){
	            run[i] = Integer.parseInt(bf.readLine());
	            if(run[i]<0){
	                flag = false;
	                System.out.println("Invalid Input");
	                break;
	            }
	        }
	        if(flag){
	            for(i=0;i<n;i++){
	                int tot = run[i]+run[n+i];
	                System.out.println(name[i]+"-"+tot);
	                
	            }
	        }
	    
	}
}
