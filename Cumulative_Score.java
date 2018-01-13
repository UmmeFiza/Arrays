//Cumulative score 
/*
 * Given the data for the runs scored by two teams against the overs played “n”, write a program to find the cumulative score of both the teams till “n” to plot the Worm graph.

Input Format:
First line of the input is an integer “n” that contains the number of overs.
Next “n” lines contains integers that specifies the runs scored in each over by the first team.
Second set of “n” lines contains integers that specifies the runs scored in each over by the second team.

Output Format:
Output should display the cumulative score of each of the team in line after line.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 

Sample Input 1:
5
7
10
6
4
8
11
7
6
4
5
Sample Output 1:
7
17
23
27
35
11
18
24
28
33

Sample Input 2:
-5
Sample Output 2:
Invalid Input

Sample Input 3:
4
4
9
-5
Sample Output 3:
Invalid Input
 */

//Source Code:
import java.util.*;
class Cumulative_Score{
    public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
        
        int n = Integer.parseInt(s.nextLine());
        if(n<0){
            System.out.println("Invalid Input");
            System.exit(1);
        }
        int[] r1 = new int[n];
        int[] r2 = new int[n];
        int sum =0,sum1 = 0;
        int i=0;
        for(i =0;i<n;i++){
            r1[i] = Integer.parseInt(s.nextLine());
            if(r1[i]<0){
                System.out.println("Invalid Input");
                System.exit(1);
            }
        }
        for(i =0;i<n;i++){
            r2[i] = Integer.parseInt(s.nextLine());
            if(r2[i]<0){
                System.out.println("Invalid Input");
                System.exit(1);
            }
        }
        for(i=0;i<n;i++){
            sum = sum + r1[i];
            System.out.println(sum);
        }
        for(i=0;i<n;i++){
            sum1 = sum1 + r2[i];
            System.out.println(sum1);
        }
    }
}