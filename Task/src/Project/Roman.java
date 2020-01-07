package Project;

public class Roman {

	public static void main(String[] args) {
          int number=6;
	 Roman roman = new Roman();
	     roman.romanValues(number);
	     

	}
	
	public void subDisplay(char ch1,char ch2)
	{
		System.out.print(ch1);
		System.out.print(ch2);
	}
		
	public  static void display(char ch , int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(ch);
		}
	}
	public void romanValues( int num)
	{
		while(num!=0) {
			
		
		if(num>=1000)
		{
			display('M',num/1000);
			num=num%1000;
		}
		else if(num>=500)
		{
			if(num<900)
			{
				display('D',num/500);
				num=num%500;
			}
			else
			{
				subDisplay('C','M');
				num=num%100;
				
			}
		}
		else if ( num>=100)
		{
			if(num<400)
			{
			
				display('C',num/100);
				num=num%100;
			}
			else
			{
				display('C','M');
			}
		}
		else if(num>=50)
		{
			if(num<90)
			{	
			display('L',num/50);
			num=num%50;
			}
			else
			{
				subDisplay('X','C');
			   num=num%10;
		    }
		}
		else if(num>=10)
		{
			if(num<40)
			{
				display('X',num/10);
				num=num%10;
				
			}
			else
			{
				subDisplay('X','L');
			}
			
		}
		else if(num>=5)
		{
			if(num<9)
			{	
			display('V',num/5);
			num=num%5;
			}
			else
			{
				subDisplay('I','X');
				num=0;
				
			}
		}
		else if(num>=1)
		
		{
		 if(num<4)
		 {
			 display('I',num/1);
			 num=0;
		 }
		 else
		 {
			 subDisplay('I','V');
			 num=0;
		 }
		}
		
		}
		}
		
		
	}
	//private void display(char c, int i) {
		// TODO Auto-generated method stub
		
	//}


