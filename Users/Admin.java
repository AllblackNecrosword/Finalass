package Users;

import Interface.UserInterface;
import Data.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Admin implements UserInterface {

  
    //constructor
    public Admin(){
  
    }
    private Database database = new Database();
    private Connection connection =database.connectToDatabase();

    public void addCourse(String courseName, String courseDescription,int courseCost, String[] moduleList) throws SQLException {
        //convert the list of modules into a single string
        String moduleListString = "";
        for(int i =0;i<moduleList.length;i++){
            moduleListString+= moduleList[i];
            moduleListString+= " ";
        }
        Statement addCourseSt = connection.createStatement();
        addCourseSt.executeUpdate("INSERT INTO COURSES_INFO(courseName,courseDescription,courseCost,moduleList) VALUES ('"+courseName+"', '"+courseDescription+"', "+courseCost+",'"+moduleListString+"');");
    }
    public void addModule(String courseName,String newModuleName)throws  SQLException{
        String oldModuleList = "";
        Statement getModuleListSt = connection.createStatement();
        ResultSet res = getModuleListSt.executeQuery("SELECT * FROM COURSES_INFO;");
        while(res.next()){
            oldModuleList+=res.getString("moduleList");
        }
        Statement updateModuleSt = connection.createStatement();
        updateModuleSt.executeUpdate("UPDATE COURSES_INFO SET moduleList= '"+oldModuleList+newModuleName+"' WHERE courseName = '"+courseName+"';");
    }
    public void deleteCourse(String courseName)throws  SQLException{
        Statement deleteCourseSt = connection.createStatement();
        deleteCourseSt.executeUpdate("DELETE FROM COURSES_INFO WHERE courseName='"+courseName+"';");
    }
    public void updateCourse(String courseName, String courseDescription)throws SQLException{
        Statement updateCourseSt = connection.createStatement();
        updateCourseSt.executeUpdate("UPDATE COURSES_INFO SET courseDescription='"+courseDescription+"' WHERE courseName='"+courseName+"';");
    }
    public void updateCourse(String courseName, int courseCost)throws SQLException{
        Statement updateCourseSt = connection.createStatement();
        updateCourseSt.executeUpdate("UPDATE COURSES_INFO SET courseCost="+courseCost+" WHERE courseName='"+courseName+"';");
    }
    public void generateResult(String studentName) throws  SQLException{
        Statement generateResultSt = connection.createStatement();
        generateResultSt.executeUpdate("");
    }
}