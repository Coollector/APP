package com.coollector.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {

    public User(){

        String url = "jdbc:mysql://162.55.212.105:3306/cmd_program";
        String user = "felix";
        String pass = "fcfn061223";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}