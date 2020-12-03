package com.icss.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url2="jdbc:oracle:thin:@localhost:1521:orcl";
            String name="YUANHAO";
            String pwd2="123";
            Connection connection1= DriverManager.getConnection(url2,name,pwd2);
            String sql="select * from LOGIN";

            Statement statement=connection1.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
