package com.cestar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cestar.model.Employee;

public class EmployeeDao {

	public Connection getConnection() {

		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/emps";
		String user = "root";
		String pwd = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url, user, pwd);

			System.out.println("Connection successful:");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

	public int insert(Employee emp) {

		Connection con = getConnection();

		String sql = "insert into Employee values (?,?,?,?)";

		int status = 0;

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getContact());
			pstmt.setString(4, emp.getCity());

			status = pstmt.executeUpdate();

			if (status > 0) {

				System.out.println("Record Insertd successfully:");
			} else {

				System.out.println("Try again please:");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;

	}

}
