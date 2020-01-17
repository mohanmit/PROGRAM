package Project;

import java.util.Scanner;
public class Ip {

	public static void main(String[] args) {
		boolean check =false;
		
		Scanner scanner =new Scanner(System.in);
		
		String ip= scanner.nextLine();
		      String[] arr= ip.split("[.]");
		      
		      for(int i=0;i<arr.length;i++)
		      {
		    	  // to convert string to integer and check range
		    	  
		    	  if(Integer.parseInt(arr[i])>=0 && Integer.parseInt(arr[i])<=255)
		    	  {
		    		   check= true;
		    	  }
		    	  
		    	  else
		    	  {
		    		  System.out.println("no");
		    		  System.exit(0);
			      }
		    	  }
		      
		      if (check==true)
		      {
		    	  System.out.println("yes");
		      }
		      
			
			
				
		
	}

}
