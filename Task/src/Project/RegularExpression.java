package Project;

public class RegularExpression {

	public static void main(String[] args) {
		
		 String passwd = "Mohan@97"; 
	      String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}";
	      if  (passwd.matches(pattern))
	      {
	    	  System.out.println("valid password");
	      }
	      else
	      {
	    	  System.out.println(" not a valid password");
	      }
	   }
}

