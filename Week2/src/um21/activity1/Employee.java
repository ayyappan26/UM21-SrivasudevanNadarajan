package um21.activity1;

public class Employee {
	   long employeeId;
	   String employeeName;
	   String employeeAddress;
	   long employeePhone;
	   double basicSalary;
	   double specialAllowance=250.80;
	   double hra=1000.50;
	   double transportAllowance;
	   public Employee()
	   {}
	 public Employee(long employeeId,String employeeName,String employeeAddress,long employeePhone)
	   {
		   this.employeeId=employeeId;
		   this.employeeName=employeeName;
		   this.employeeAddress=employeeAddress;
		   this.employeePhone=employeePhone;
	   }
	  public void calculateSalary()
	  {
		  double salary;
		  salary = basicSalary + ( basicSalary * specialAllowance/100) + (basicSalary * hra/100); 
		  System.out.println("The salary is "+salary);
	  }
	  public void calculateTransportAllowance()
	  {
		  transportAllowance = basicSalary* 10/100;
		  System.out.println("The travel allowance is "+transportAllowance);
	  }
}
     class Manager extends Employee
     {
      public Manager(long employeeId,String employeeName,String employeeAddress,long employeePhone,double basicSalary)  
      {
    	   this.employeeId=employeeId;
		   this.employeeName=employeeName;
		   this.employeeAddress=employeeAddress;
		   this.employeePhone=employeePhone;
		   this.basicSalary=basicSalary;
      }
      public void calculateTransportAllowance()
	  {
		  transportAllowance =basicSalary* 15/100;
		  System.out.println("The travel allowance is "+transportAllowance);
	  }    
}
    class Trainee extends Employee
    {
      public Trainee(long employeeId,String employeeName,String employeeAddress,long employeePhone,double basicSalary)
      {
    	  this.employeeId=employeeId;
		   this.employeeName=employeeName;
		   this.employeeAddress=employeeAddress;
		   this.employeePhone=employeePhone;
		   this.basicSalary=basicSalary;
      }
    }