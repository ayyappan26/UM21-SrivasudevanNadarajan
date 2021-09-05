package um21.activity1;

import um21.activity1.Manager.Trainee;

public class InheritanceActivity {

	public static void main(String[] args)
	{
		Employee emp=new Employee();
		Manager mymanager=new Manager(126534,"Peter","Chennai India",237844,65000);
		Trainee trainee=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		mymanager.calculateSalary();
		trainee.calculateSalary();
		mymanager.calculateTransportAllowance();
		trainee.calculateTransportAllowance();
		

	}

}
