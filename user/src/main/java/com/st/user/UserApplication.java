package com.st.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SpringApplication.run(UserApplication.class, args);
		//testAWSDb();
		//mySqlDb();
	}
	
	private static void testAWSDb() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver is loaded");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
		//Connection con = DriverManager.getConnection("jdbc:postgresql://database-1.ceu38hjhoi8q.ap-south-1.rds.amazonaws.com:5432/skills-tute", "postgres", "postgres");
		System.out.println("Connection is created");
		Statement stmt = con.createStatement();
		ResultSet rs =stmt.executeQuery("select * from users");
		while(rs.next()) {
			System.out.println(rs.getString("name"));
		}
	}
		
		private static void mySqlDb() throws ClassNotFoundException, SQLException {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skillstute", "root", "root");
			//Connection con = DriverManager.getConnection("jdbc:postgresql://database-1.ceu38hjhoi8q.ap-south-1.rds.amazonaws.com:5432/skills-tute", "postgres", "postgres");
			System.out.println("Connection is created");
			Statement stmt = con.createStatement();
			ResultSet rs =stmt.executeQuery("select * from mytable");
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
	}

}
