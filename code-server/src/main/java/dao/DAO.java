/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class DAO {
    protected Connection con;

    public DAO() {
        String jdbcURL = "jdbc:sqlserver://localhost:1433;databaseName=carophantan";
        String jdbcUsername = "sa";
        String jdbcPassword = "1234567$"; //please change information to connect to DB
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection to database failed");
        }
    }
}