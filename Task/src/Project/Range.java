package Project;
import java.util.Arrays;

public class Range {

	public static void main(String[] args) {
		
		int start=100,end=130;
		boolean check=true;
		for(int i=start;i<=end;i++)
		{
			check=true;
		              String str =String.valueOf(i);
		              
		             char[] arr = str.toCharArray();
			  
			 for(int j=0;j<arr.length-1;j++)
			 {
				 for(int k=j+1;k<arr.length;k++)
			 
				 if(arr[j]==arr[k])
				 {
				     check=false;
				     //System.out.println( arr[j]);
				 }
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
