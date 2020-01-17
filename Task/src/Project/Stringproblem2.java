package Project;

import java.util.Scanner;
public class Stringproblem2
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		char c=' ';
		int t=0;
		
		for(int i=0;i<s.length();i++)
		{
		    //System.out.print(s.charAt(i));
		    if(s.charAt(i)<'0'||s.charAt(i)>'9'){
		       c = s.charAt(i);
		       continue;
		    }
		    t=(t*10)+(s.charAt(i)-'0');
		    if(i==s.length()-1 || ( i!=s.length()-1 && (s.charAt(i+1)<'0'||s.charAt(i+1)>'9'))){
		        for(int j=0;j<t;j++){
		            System.out.print(c);
		            
		        }
		        t=0;
		    }
		}
	}
}

