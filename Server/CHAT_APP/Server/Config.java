package Server;

import java.sql.Connection;
import java.sql.DriverManager;

public class Config {

    public static String DB_URL = "jdbc:mysql://localhost:3306/karaoke";
    public static String USER_NAME = "root";
    public static String PASSWORD = "QuanG&C13082004";

    public Config() {
        Connection conn = null;
        String gettext;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            gettext = "connect successfully!";
        } catch (Exception ex) {
            gettext = "connect failure!";
        }

    }
}
