package com.example.emloyeems.DbConn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbCon {
    @Autowired
    Properties dbpro;

    public Connection getConn() {
        Connection con = null;
        try {

            String dbPath = "jdbc:mysql://localhost:3306/employeems?Charset=utf8?useSSL=false";
            String userName = "root";
            String password = "1234";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    dbPath, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
