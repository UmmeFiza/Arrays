/*Team Selection
 Input Format:
First line is the integer “n” that specifies the number of teams that are qualified for the tournament.
Next “n” lines contain each a string that specifies the names of teams qualified.
Last line of the input is a string that specifies the team name that is to be checked in the list of qualified teams.

Output Format:
Output should display “Yes” in the first line if the team name is available and print its position in the list in the next line. Otherwise, print “No”.
If the array size is negative, print "Invalid Input" and terminate the program. 

Sample Input 1:
5
India
Pakistan
Australia
South Africa
West Indies
Pakistan
Sample Output 1:
Yes
2

Sample Input 2:
5
India
Pakistan
Australia
South Africa
West Indies
Bangladesh
Sample Output 2:
No

Sample Input 3:
-5
Sample Output 3:
Invalid Input 
 */
//Source_Code:
import java.util.*;

class Team_Selection{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        if(n>0){
        boolean flag = false;
        String[] team = new String[n];
        for(int i = 0; i < n; i++){
            team[i] = s.nextLine();
        }
        String t = s.nextLine();
        
            
        for(int i=0;i<n;i++){
            if(team[i].equals(t))
            {
                System.out.println("Yes");
                System.out.println(i+1);
                flag = true;
                break;
            }
        }
        if(flag==false)
             System.out.println("No");
    }
    else
         System.out.println("Invalid Input");
    }
    
}
