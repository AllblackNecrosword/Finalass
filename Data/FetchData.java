package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class FetchData {
    String[] loginInfo = new String[2];

    public String[] loginData(String username, String password, String role) {
        boolean loginSuccess = false;
        try {
            Database database = new Database();
            Connection connection = database.connectToDatabase();
            String sql = "SELECT email, role FROM users_login_data WHERE email = ? AND password = ? AND role = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, role);
            ResultSet res = statement.executeQuery();
            if (res.next()) {
                loginInfo[0] = res.getString("username");
                loginInfo[1] = res.getString("role");
                loginSuccess = true;
            }
        } catch (Exception e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
        if (loginSuccess) {
            return loginInfo;
        } else {
            return null;
        }
    }

    
}
