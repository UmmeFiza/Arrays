//Dhoni and his bike arrangement 

/*
Given the number of bikes of Dhoni “n”, the number of rides he has taken during a season “k” and for each ride k, how will he swap the bike's position in the garage (xi  and yi), determine the final arrangement of his bikes after his “k” rides.

Input Format:
First line of the input is an integer “n” that specifies the number of bikes of Dhoni.
Next n lines contain the names of the bikes.
n+1th line contains the integer “k” that specifies the number of his rides.
Next k lines contain 2 integers  xi  and yi  each, that specifies the positions of swap during ith ride.

Output Format:
Output should display the final arrangement of the bikes in Dhoni's garage after k rides, in separate lines.
If the array size is negative, print "Invalid Input" and terminate the program.

Sample Input 1:
5
Rajdoot
Yamaha Thundercat
TVS Apache
Royal Enfield Machismo
Kawasaki Ninja H2R
3
2 4
1 3
5 2
Sample Output 1:
TVS Apache
Kawasaki Ninja H2R
Rajdoot
Yamaha Thundercat
Royal Enfield Machismo

Sample Input 2:
3
Yamaha RD350
Royal Enfield Machismo
Kawasaki Ninja H2R
2
1 3
2 1
Sample Output 2:
Royal Enfield Machismo
Kawasaki Ninja H2R
Yamaha RD350

Sample Input 3:
-5
Sample Output 3:
Invalid Input 
 */

//Source Code:

import java.io.*;
import java.util.*;
public class Dhoni_And_Bike {
	    public static void main(String args[])throws Exception{
	        Scanner s = new Scanner(System.in);
	        int n = Integer.parseInt(s.nextLine());
	        int i;
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        
	         String[] bike = new String[100];
	            for(i = 1;i<=n;i++){
	                bike[i] = s.nextLine();
	            }
	          int ride = Integer.parseInt(s.nextLine());
	          for(i=1;i<=ride;i++){
	               int x = Integer.parseInt(s.next());
	               int y =  Integer.parseInt(s.next());
	               if(x<0 || y<0){
	                    System.out.println("Invalid Input");
	                    break;
	               }
	               else{
	                String temp = bike[y];
	                bike[y] = bike[x];
	                bike[x] = temp;
	               }
	                
	           }
	           for(i=1;i<=n;i++)
	               System.out.println(bike[i]);
	        
	    
	}
}
