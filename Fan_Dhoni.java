//Fan of Dhoni
/*
 * This fan's next attempt to show his madness on Dhoni is to paint a string “MSMSMSMS” on his body. He had numerous other strings of the similar pattern with him(but not the exact), that contains only characters 'M' and 'S'. In order to achieve the same string of any even string length “MSMSMSMS”, help him find how many minimum number of corrections can be made to a given string “str”. Allowed corrections are to either replace M with S or S with M. Write a program for the same. 
 Sample Input 1:
MSMMMSMMMS
Sample Output 1:
2
 
Sample Input 2:
MMMSMMMSMMMS
Sample Output 2:
3
 */
//package Arrays_API;
import java.util.*;
public class Fan_Dhoni {
	
	
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        
	        String str = s.nextLine();
	        int len = str.length();
	        int count = 0;
	        for(int i = 0;i<len;i++){
	            if(i%2 == 0){
	                if(str.charAt(i)!='M')
	                    count++;
	            }
	            else{
	                if(str.charAt(i)!='S')
	                    count++;
	            }
	        }
	        System.out.println(count);
	    }
	
}
