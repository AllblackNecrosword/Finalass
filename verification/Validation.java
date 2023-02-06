package verification;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
	

	    public boolean validateUsername(String username){
	        if(username.length() > 5& !username.contains(" ")){
	            return true;
	        }
	        return false;
	    }

	    //validate email
	    public boolean validateEmail(String email){
	        //email validation pattern
	        String patternEmailString = "^(.+)@(.+)$";
	        return Pattern.matches(patternEmailString, email);
	    }

	    //validate password
	    public boolean validatePassword(String password){
	        //password validation pattern
	        String patternPasswordString = "[a-z A-Z]{1,}+[@ &][0-9]{1,}";
	      return Pattern.matches(patternPasswordString, password);
	       
	    }
}
