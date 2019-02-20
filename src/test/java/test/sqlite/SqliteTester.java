package test.sqlite;

import java.sql.*;

public class SqliteTester {

    public static void main(String[] arg) {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:test.db");
            Statement st = connection.createStatement();
            ResultSet rt = st.executeQuery("select 1 from dual");
            while (rt.next()) {
                System.out.println(rt.getInt(1));
            }

        } catch (SQLException e) {

        }
    }
}
