package Project;

import java.util.Scanner;
public class Stringproblem
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		 String c="";
		int t=0;
		
		for(int i=0;i<s.length();i++)
		{
		    //System.out.print(s.charAt(i));
		    if(s.charAt(i)<'0'||s.charAt(i)>'9'){
		       c = c +s.charAt(i);
		       continue;
		    }
		    t=(t*10)+(s.charAt(i)-'0');
		    if(i+1<s.length()) 
		    {
	
		        if(s.charAt(i+1)>='a'&& s.charAt(i+1)<='z' )
		      {
		    	for(int j=0;j<t;j++)
		    	{
		    		System.out.print(c);
		    	}
		    	t=0;
		    	c="";
		    }
		    }
		    else
		    {
		    for(int j=0;j<t;j++)
		    {
		    	System.out.print(c);
		    }
		    }
		
		}

	
}}

