package com.gmail.regahruzty.bootcamp_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 * Hello world!
 *
 */
public class App {

    private final static String url = "jdbc:postgresql://localhost:5432/bootcamp_2";
    private final static String username = "bootcamp_2";
    private final static String password = "bootcamp";
    private final static String driverClassName = "org.postgresql.Driver";

    public static void main(String[] args) throws SQLException {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(url);
        ds.setPassword(password);
        ds.setUsername(username);
        ds.setDriverClassName(driverClassName);

        Connection koneksiDb = ds.getConnection();
        String sql = "select id, uname, fullname, email, tanggal_lahir from s_user";
        Statement statement = koneksiDb.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            Integer idUser = resultSet.getInt("id");
            String username = resultSet.getString("uname");
            Date tanggalLahir = resultSet.getDate("tanggal_lahir");
            {
                
                resultSet.close();
                statement.close();
                koneksiDb.close();
                                     
                
                System.out.println("Hello it works!");
            }
        }
    }
}

/**
 * Class 1
*
 */
