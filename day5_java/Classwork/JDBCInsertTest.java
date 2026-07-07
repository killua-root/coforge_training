package com.coforge.day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsertTest {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbs","root","Aotjjk@1904");

            String s = "Update emp set name=? where id =?";

            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, "Luffy");

            ps.setInt(2, 101);
            

            int rows = ps.executeUpdate();

            System.out.println(rows + " record inserted successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}