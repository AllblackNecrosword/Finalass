package Exceptions;

@SuppressWarnings("serial")
public class CourseNotFoundException extends RuntimeException{
    public CourseNotFoundException(){
        super("Course not found");
    }
}