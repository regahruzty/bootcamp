package com.gmail.regahruzty.bootcamp_jdbc;

import java.sql.SQLException;

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


    public static void main( String[] args ) throws SQLException {
    	BasicDataSource ds = new BasicDataSource();
    	ds.setUrl(url);
    	ds.setPassword(password);
    	ds.setUsername(username);
    	 ds.setDriverClassName(driverClassName);
    	
    	ds.getConnection();
    	
    	{ System.out.println( "Hello it works!" );
    }
}
}

/**
*Class 1
**/
