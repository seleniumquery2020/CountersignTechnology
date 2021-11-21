package stringStringBufferStringBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	
	public static void main(String[] args) {
		
		String password = "Welcome@123";
		
		//8 character to 13 character
		//at least one Capital
		//at least one special character
		//number
		//lower case character
		
		Pattern p = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%&]).{8,13}");
		Matcher m = p.matcher(password);
		
		if(m.matches())
			System.out.println("Password is valid");
		else
			System.out.println("Password is Invalid");
	}

}
