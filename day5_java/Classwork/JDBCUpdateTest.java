package com.coforge.day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUpdateTest {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbs","root","Aotjjk@1904");

            String s = "insert into emp values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(s);

            ps.setInt(1, 101);
            ps.setString(2, "Naruto");
            ps.setString(3, "Matty");

            int rows = ps.executeUpdate();

            System.out.println(rows + " record inserted successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}