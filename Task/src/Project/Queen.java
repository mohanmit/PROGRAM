package Project;

import java.util.Scanner;
public class Queen
{
	public static void main(String[] args) {
	    Scanner obj =new Scanner(System.in);
	  System.out.println("Enter queen row");
	  
	  int queenRow  = obj.nextInt();
	  
	  System.out.println("Enter queen column");
	  
	  int queenColumn=obj.nextInt();
	  
	  System.out.println("Enter horse row");
	  
	  int horseRow=obj.nextInt();
	  
	  System.out.println("Enter horse column");
	  
	  int horseColumn=obj.nextInt();
	  
	  if((queenRow==horseRow)||(queenColumn==horseColumn)||(queenRow+queenColumn==horseRow+horseColumn)||(queenRow-queenColumn==horseRow-horseColumn))
		{
		    System.out.println("Queen cutting the horse");
		}
		else{
		    System.out.println("Queen not cutting the horse");
		    
		}
	}
}

