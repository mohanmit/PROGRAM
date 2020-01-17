package Project;


public class Triangle {

	public static void main(String[] args) 
	{
		int size=10;  //n=10
		int k=size;   //k=10
	    int m=size-1; //m=9
	    int n=size-1;
		for(int i=size;i>=0;i--)
		{
			// loop to provide space
		 for(int s=0;s<i;s++)
		 {
			 System.out.print("  ");
		 }
		 // to print left triangle
			for(int j=i;j<=k;j++)
			{ 
				if(j<=size)
				{
					System.out.print(j+" ");
				}
				//to print left triangle
				else if(j>size)
				{
					if(n>=0)
					{
						for(int l=m;l>=n ;l--)
						{
							System.out.print(l+" ");
						}
						n--;
						break;
					}
				}
			
	
		}
			System.out.println("  ");
			
			k++;
	}

}}
