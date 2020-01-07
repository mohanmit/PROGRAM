package Project;

import java.util.Arrays;
import java.util.Scanner;
public class Anagram1 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
	    String s=scanner.nextLine();
	    int[] arr1= new int[s.length()];
	    String[] arr =s.split("[. ]"); 
	    for(int i=0;i<arr.length-1;i++)
	    {
	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    		  String str1=arr[i];
         		  String str2=arr[j];
   	    		 int status =  checkAnagram(str1,str2);

	    		  if(status==1)
	    		  {
	    			  arr1[i]=-1;
	    			  arr1[j]=-1;
	    			  
	    		  }
	    	}
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	    	if (arr1[i]==-1)
	    	{
	    		System.out.print(arr[i]+" ");
	    	}
	    }
     		}

	private static   int checkAnagram(String s1, String s2) {
		          boolean check=  false; 
		        char[] chr =   s1.toCharArray();
		        char[] chr1 = s2.toCharArray();
		        Arrays.sort(chr);
		        Arrays.sort(chr1);
		        boolean result =(Arrays.equals(chr, chr1));
		        
		        if(result == true)
		        {
		        	return 1;
		        }
		        else
		        {
		        	return 0;
		        }
		
	}

}
