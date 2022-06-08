package excaptiondemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Account {

    public Connection getConnection() throws SQLException {
        String url = "jdbc:msql://localhost:3606/";
        String user = "prime";
        String  password = "code";
        Connection connection = null;
         connection = DriverManager.getConnection(url, user, password);
         return connection;
        }
        public void withdraw(int amount) throws SQLException {
        getConnection();

            System.out.println("Withdraw :" +amount);
        }

    }

