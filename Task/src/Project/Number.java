package Project;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		 
          Scanner scanner = new Scanner(System.in);   
          String string = scanner.nextLine();
          char[] arr  = string.toCharArray();
          int num=0;
          for(int i=0;i<arr.length;i++)
          {
        	  if(arr[i]=='I')
        	  {
        		  if(i+1<string.length())
        		  {
        			  if(arr[i+1]=='V')
        			  {
        				  num=num+4;
        				  i++;
        				  
        			  }
        		  }
        		  else
        		  {
        		  num=num+1;
        		  }
        	  }
        	  else if(arr[i]=='V')
        	  {
        		  num=num+5;
        	  }
        	  else if(arr[i]=='X')
        	  {
        		  if(i+1<string.length())
        		  {
        			  if(arr[i+1]=='L')
        			  {
        				  num=num+40;
        				  i++;
        				  
        			  }

        			  else if(arr[i+1]=='C')
        			  {
        				  num=num+90;
        				  i++;
        				  
        			  }
        			  else
        			  {
                		  num=num+10;
        			  }
        		  }
        		  
        		  else
        		  {
        		  num=num+10;
        		  }
        	  }
        	  else if(arr[i]=='L')
        	  {
        		  num=num+50;
        	  }
        	  else if(arr[i]=='C')
        	  {
        		  if(i+1<string.length())
        		  {
        			  if(arr[i+1]=='D')
        			  {
        				  num=num+400;
        				  i++;
        				  
        			  }
        			  else if(arr[i+1]=='M')
            			  {
            				  num=num+900;
            				  i++;
            				  
            			  }
        			  else
        			  {
                		  num=num+100;
        			  }
        		  }
        			  else
        			  {
                		  num=num+100;
        			  }
            		  }
        		  
        		 
        	  else if(arr[i]=='D')
        	  {
        		  num=num+500;
        	  }
        	  else if(arr[i]=='M')
        	  {
        		  num=num+1000;
        	  }
        	  
          }
          System.out.println(num);
	}
}
        	  
        	  
        	  
        	  
        	  
	
        	  
        	  
        	  
        	  
          
                       
	


