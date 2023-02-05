package Exceptions;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(){
        super("User was not found");
    }
}