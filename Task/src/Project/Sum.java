package Project;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		int start;

		int[] arr= {4,5,8,9,23,6,8,2,1};
		int[] arr1=new int[arr.length];
		 Arrays.fill(arr1,0);
	for(int i=0;i<arr.length;i++)
		{
			int index=0,sum = 0;
			
	abc:	for(int j=i;j<arr.length;j++)
		{
			 sum=sum+arr[j];
			
			 arr1[index++]=arr[j];
			 
			 
			 
			 if(sum==11)
			 {
				 for(int k=0;k<arr1.length;k++)
				 {
					 if(arr1[k]!=0)
					 {
					 System.out.println(arr1[k]);
					 }
				 }
			 }
			 if(sum>=12)
			 
			 {
				 Arrays.fill(arr1,0);
				 break abc;
//				 continue;
			 }
			
		
		}

	}

}}
