package com.coforge.day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCReadTest {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbs","root","Aotjjk@1904");

            String s = "Select * from emp";

            PreparedStatement ps = con.prepareStatement(s);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
            	System.out.println("ID : " + rs.getInt(1) + "Name : " + rs.getString(2)+ "branch : " + rs.getString(3));
            }

            ps.close();
            con.close();
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}