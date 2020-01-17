package Project;

import java.util.Arrays;
import java.util.Scanner;
public class Frequency 
{
	public static void main(String[] args) {
		int a =0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the value :");
		String string = scanner.nextLine();
		
		int count=1,max=0;
		       //split the paragraph store in array
		    String [] arr1 = string.split(" ");
		     //to store the count of word
		    int[] arr2 =new int[arr1.length];
		    
		    for(int i=0;i<arr1.length-1;i++)
		    {
	    		count=1;

		    	for(int j=i+1;j<arr1.length;j++)
		    	{
		    		if(arr1[i].equals(arr1[j]))
		    		{
		    			count++;
		    			// avoid to count the same one
		    			arr2[j]=-1;
		    		}

		    	}
		    	//provide he count in int array 
	    		if(arr2[i]!=-1)
	    		{
	    			arr2[i]=count;
	    		}
		    }
           // loop for counting occurence	    
		    for(int i=0;i<5;i++)
		    {
		    	//loop for findout he max value
		    	for(int j=0;j<arr2.length;j++)
		    	{
		    		if(arr2[j]>max)
		    		{
		    			max=arr2[j];
		    			 a=j;
		    		}
		    		
		    	}if(arr2[a]!=0)
		    		System.out.println("input "+arr1[a]+"--> "+arr2[a]);
	    		arr2[a]=0;
	    			max=0;
	    			
		    }
		    
	}
}

// 1 1 1 2 2 2 2 5 5 5 5 5 5 8 8 8 8 7 7 7 7
