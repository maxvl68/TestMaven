package ua.kpi.tef;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
	// write your code here
        System.out.print("Hello");
        System.out.println(" World");

        Connection con =
                DriverManager.
                        getConnection(  "jdbc:"+
                                        "mysql:"+
                                        "//localhost/"+
                                        //"world" ,
                                        "mydbtest",
                                "root" ,
                                "root");
        Statement query = con.createStatement();
        //ResultSet rs = query.executeQuery("SELECT * FROM city");
        ResultSet rs = query.executeQuery("SELECT * FROM users");
        while( rs.next()) {
            System.out.println(rs.getString("Name"));
        }
    }
}
