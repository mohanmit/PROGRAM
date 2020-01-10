package Project;

import org.apache.poi.util.StringUtil;

public class InVoice {

	public static void main(String[] args) {
		 String text = "Mobileno: 9840200287  Name: Mohankumar Date: 10/1/2020 Address: chennai,sholinganallur";
		    System.out.println(getNextWord(text, "Name:"));
		    System.out.println(getNextWord(text, "Date:"));
		    System.out.println(getNextWord(text, "Address:"));
		    System.out.println(getNextWord(text, "Mobileno:"));
	}
	public static String getNextWord(String str, String word) {
	    String[] strArr = str.split(word);
	    if(strArr.length > 1) {
	        strArr = strArr[1].trim().split(" ");
	        return strArr[0];
	    }
	    return null;
	}

}
