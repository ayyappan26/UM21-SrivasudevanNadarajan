package com.um21.aircraft.bo;
import com.um21.aircraft.factory.*;
import com.um21.aircraft.utility.Scan;
import com.um21.aircraft.dao.IDao;
import java.util.Scanner;
import java.sql.SQLException;
public class AircraftBo {
    public void aircraftSystem()
    {
    	AbstractFactory factory=AbstractFactory.getFactory(1);
    	IDao dao=factory.getDao();
    	Scanner scan=Scan.getScannerInstance();
    	int choice=0;
    	do {
    		System.out.println("1. Add Aircraft Details");
			System.out.println("2. Add Sector Details");
			System.out.println("3. View Sector Details");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
    	}while(choice==0);
    	switch(choice) {
    	case 1:
    		try 
    		{
    			dao.registerAircraft();
    		}catch(SQLException e)
    		{
    			e.printStackTrace();
    		}
    		break;
    	case 2:
    		try
    		{
    			dao.registerSector();
    		}catch(SQLException e)
    		{
    			e.printStackTrace();
    		}
    		break;
    	case 3:
    		try
    		{
    			dao.viewSectorDetails();
    		}catch(SQLException e)
    		{
    			e.printStackTrace();
    		}
    		break;
    	case 4:
    		return;
    	}
    	aircraftSystem();
    }
}
