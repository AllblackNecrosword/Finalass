package Data;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Courses {
    Database database = new Database();
    Connection connection = database.connectToDatabase();
    public ArrayList<String> getCourseList() {
        ArrayList<String> list = new ArrayList<>();
        try {
            Statement st = connection.createStatement();
            ResultSet res = st.executeQuery("SELECT * from COURSES_INFO;");
            while (res.next()) {
//            	System.out.println(res.getString("courseName"));
                list.add(res.getString("courseName"));
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception");
        }catch (NullPointerException E){
            System.out.println("The database is empty");
        }
        System.out.println(list.size());
        return list;
    }


    public int getModuleCount(){
        int count =0;
        try {
            Statement st = connection.createStatement();
            ResultSet res = st.executeQuery("SELECT * from modules_info");
            while(res.next()) {
//            	System.out.println(res.getString("moduleName"));
            	count++;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return count;
    }


	public int getTeachersCount() {
    	int count=0;
    	try {
    		Statement st = connection.createStatement();
    		ResultSet res = st.executeQuery("select * from users_login_data where role = 'teacher' ");
    		while(res.next()) {
    			count++;
//    			System.out.println(res.getString("role"));
    		}
    	} catch(SQLException e) {
    		throw new RuntimeException(e);
    	}
		return count;
	}
    

//        public ArrayList<String> gettutors() {
//            ArrayList<String> list1 = new ArrayList<>();
//            try {
//                Statement st = connection.createStatement();
//                ResultSet res = st.executeQuery("select * from user_login_data where role = 'Teacher' ");
//                while (res.next()) {
//                	System.out.println(res.getString("role"));
//                    list1.add(res.getString("role"));
//                }
//            } catch (SQLException e) {
//                System.out.println("SQL Exception");
//            }catch (NullPointerException E){
//                System.out.println("The database is empty");
//            }
//            System.out.println(list1.size());
//            return list1;
//    	}
    
//    public int settutors() {
//    	int count=0;
//    	try {
//    		Statement st = connection.createStatement();
//    		ResultSet res = st.executeQuery("select * from users_login_data where role = 'teacher' ");
//    		while(res.next()) {
//    			count++;
//    			System.out.println(res.getString("role"));
//    		}
//    	} catch(SQLException e) {
//    		throw new RuntimeException(e);
//    	}
//    	return count;
//    	}
    
    
    }


