package AbstractClasses;
import java.util.Scanner;

import Data.Database;

public  class Users {
	
	  protected Users(){
		Database database = new Database();
		try {
			database.connectToDatabase();
			
		}catch(Exception e) {
			System.out.println("Error");
		}
		
	}
    Scanner scanner = new Scanner(System.in);
    String username = null;
    String password = null;
    private boolean login() {
        String realUsername = "user";
        String realPassword = "password";
        this.username = scanner.next();
        this.password = scanner.next();
        if(realPassword.equals(password) & realUsername.equals(username)){return true;}
            return false;
    }
    private void logout(){
        this.username = null;
        this.password = null;
    };
}