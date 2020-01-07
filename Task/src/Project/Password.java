package Project;


import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		int count1=0,count2=0,count3=0,count4=0;
		Scanner scanner =new Scanner(System.in);
		String password=scanner.nextLine();
		char[] arr= password.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
		   if(arr[i]>='A'&& arr[i]<='Z')
		   {
			   count1++;
			 
		   }

		   else if(arr[i]>='a' && arr[i]<='z')
		   {
			   count2++;
		   }
		   else if(arr[i]>='0'&& arr[i]<='9')
		   {
			   count3++;
		   }
		   else 
		   {
			   count4++;
		   }
		   
		}
		 int count=count1+count2+count3+count4;
		 if(count==8)
		 {
			 if(count1>=1&&count2>=1&&count3>=1&&count4>=1)
			 {
				 System.out.println("Strong password");
			 }
			 else
			 {
				 System.out.println("weak password");
			 }
		 }
		 else
		 {
			 System.out.println(" not a valid password");
		 }
		
				
		
		
	}

}
