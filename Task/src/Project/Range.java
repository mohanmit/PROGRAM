package Project;
import java.util.Arrays;

public class Range {

	public static void main(String[] args) {
		
		int start=100,end=130;
		boolean check=true;
		for(int i=start;i<=end;i++)
		{
			check=true;
			//to convert integer to string
			
		    String str =String.valueOf(i);
		              
		    char[] arr = str.toCharArray();
			  
			 for(int j=0;j<arr.length-1;j++)
			 {
				 for(int k=j+1;k<arr.length;k++)
			   // to check same letter present or not
				 if(arr[j]==arr[k])
				 {
				     check=false;
				     
			 }
			 if(check==true)
			 {
				 for(int k=0;k<arr.length;k++)
				 {
					 System.out.print(arr[k]);
				 }
				 System.out.print(" ");
			 }
		
	}

}
	}
}
