package Project;

import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		
	    Power power = new Power();
	    Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter the numbers");
	       int num = scanner.nextInt();
	       int number= num;
	       int rem;
	        double temp=0, ans;
	     int length = Integer.toString(num).length();
	     
	     int index = length-1;
	       int[] arr = new int[length];
	       // loop to get single digit
	       while(number>0)
	       {
	    	   rem =number%10;
	    	   arr[index--]=rem;
	    	   number= number/10;
	       }
	       // except first and last combinaton
	       for(int i=0; i<arr.length-1;i++)
	       {
	    	   temp=temp + Math.pow(arr[i],arr[i+1]);
	    	  
	    	   
	       }
	           // to first and last combination
	     ans  =  temp+Math.pow(arr[length-1], arr[0]);
	     System.out.println(ans);
	       
	    

	}

}
