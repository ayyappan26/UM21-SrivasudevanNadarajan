package com.um21.ems;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class EmployeeDao {
	Scanner scan=Scan.getScannerInstance();
	public void registerEmployee(EmployeeDto empDto) throws SQLException
	{
		Connection con = DataConnection.getDbConnection();

		String sql = "INSERT INTO EMPLOYEE VALUES(?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, empDto.getEmpId());
		pst.setString(2, empDto.getFirstName());
		pst.setString(3, empDto.getLastName());
		pst.setFloat(4, empDto.getSalary());
		pst.setInt(5, empDto.getMobile());
		pst.setString(6, empDto.getDept());
		int rowsUpdated = pst.executeUpdate();

		System.out.println("Rows Updated :" + rowsUpdated);

	}
	public void viewEmployees() throws SQLException
	{
		Connection con = DataConnection.getDbConnection();
		String sqlQuery = "select * from EMPLOYEE";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		ResultSet rs = pst.executeQuery(sqlQuery);

		int empId;
		String firstName;
		String lastName;
		float salary;
		int mobile;
		String dept;

		while(rs.next()){
			empId = rs.getInt("EmpId");
			firstName = rs.getString(2);
			lastName = rs.getString(3);
			salary = rs.getFloat(4);
			mobile = rs.getInt(5);
			dept = rs.getString(6);
			System.out.println(empId);
			System.out.println(firstName);
			System.out.println(lastName);
			System.out.println(salary);
			System.out.println(mobile);
			System.out.println(dept);


		}	}

	public void deleteEmployee(EmployeeDto empDto) throws SQLException{
		Connection con=DataConnection.getDbConnection();
		String sql="DELETE FROM EMPLOYEE where empId=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, empDto.getEmpId());
		int rowsAffected=pst.executeUpdate();
		System.out.println("Rows deleted :"+rowsAffected);

	}
	public void updateEmployee(EmployeeDto empDto) throws SQLException
	{
		Connection con=DataConnection.getDbConnection();
		System.out.println("Enter new employee id :");
		String sql="UPDATE EMPLOYEE SET empId="+Scan.getScannerInstance().nextInt()+"where empId=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, empDto.getEmpId());
		int rowsAffected=pst.executeUpdate();
		System.out.println("Rows updated :"+rowsAffected);
	}   

}



