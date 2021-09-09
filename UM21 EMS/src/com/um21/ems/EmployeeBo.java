package com.um21.ems;
import java.sql.SQLException;
import java.util.Scanner;


public class EmployeeBo {
	public void empSystem() {
		int choice = 0;
		Scanner scan = Scan.getScannerInstance();
		EmployeeDao dao = new EmployeeDao();
		do {
			System.out.println("1. Register Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Exit");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
		} while (choice == 0);

		switch (choice) {
		case 1:
			registerEmployee(dao);
			break;
		case 2:
			viewEmployees(dao);
			break;
		case 3:
			updateEmployee(dao);
			break;
		case 4:
			deleteEmployee(dao);
			break;
		case 5:
			return;
		}
	}

	public void registerEmployee(EmployeeDao dao) {
		EmployeeDto empDto = getEmpDetails();
		try {
			dao.registerEmployee(empDto);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void viewEmployees(EmployeeDao dao) {
		try {

			dao.viewEmployees();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}}
	
	private void updateEmployee(EmployeeDao empDao) {
		try {
			Scanner scan=Scan.getScannerInstance();
			System.out.println("Enter EmployeeId to update:");
			int id=scan.nextInt();
			EmployeeDto dto=new EmployeeDto();
			dto.setEmpId(id);
			empDao.updateEmployee(dto);
		}catch(SQLException e) {
			return;
		}     
	} 

	private void deleteEmployee(EmployeeDao empDao) {
		try {
			Scanner scan=Scan.getScannerInstance();
			System.out.println("Enter Employee id to delete :");
			int id=scan.nextInt();
			EmployeeDto dto=new EmployeeDto();
			dto.setEmpId(id);
			empDao.deleteEmployee(dto);
		}catch(SQLException e) {
			return;
		}    
	}

	private EmployeeDto getEmpDetails(){
		Scanner scan = Scan.getScannerInstance();
		EmployeeDto empDto = new EmployeeDto();
		System.out.println("Enter Employee Id: ");
		empDto.setEmpId(scan.nextInt());
		System.out.println("Enter First Name : ");
		empDto.setFirstName(scan.next());
		System.out.println("Enter Last Name : ");
		empDto.setLastName(scan.next());
		System.out.println("Enter Salary : ");
		empDto.setSalary(scan.nextFloat());
		System.out.println("Enter Mobile : ");
		empDto.setMobile(scan.nextInt());
		System.out.println("Enter Department : ");
		empDto.setDept(scan.next());		
		return empDto;

	}

}

