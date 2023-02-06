package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;


    public class FetchData {
        public String[] loginInfo= new String[3];

        public String[] loginData(String username){
            try {
                Database database = new Database();
                Connection connection = database.connectToDatabase();
                Statement st = connection.createStatement();
                ResultSet res = st.executeQuery("SELECT * FROM USERS_LOGIN_DATA WHERE EMAIL='" + username + "';");
                while (res.next()) {
                	loginInfo[0] =  res.getString("password");
                	loginInfo[1] = res.getString("role");
                   
                }
                loginInfo[2] =res.getString("username");
              
            }catch(SQLException e){
                System.out.println("sql exception");
            }
            return loginInfo;
        }
    }
    

