package com.um21.aircraft.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.um21.aircraft.utility.Scan;
import java.util.Scanner;
import com.um21.aircraft.dto.*;
import com.um21.aircraft.data.DataConnect;
public class OracleDao implements IDao
{
	public void registerAircraft() throws SQLException
	{
		System.out.println("No.of aircraft needed to be added :");
		int n=Scan.getScannerInstance().nextInt();
		ArrayList<AircraftDto> aircraftlist=new ArrayList<>();
		AircraftDto craftdto=new AircraftDto();
		aircraftlist=setAircraftDetails(n);
		for(int i=0;i<n;i++)
		{
			craftdto=aircraftlist.get(i);
            Connection con = DataConnect.getDbConnection();
		    String sql = "INSERT INTO aircraft VALUES(?,?)";
		    PreparedStatement pst = con.prepareStatement(sql);
		    pst.setString(1, craftdto.getaircraftCode());
		    pst.setString(2, craftdto.getdescription());
		    int rowsUpdated = pst.executeUpdate();
		    System.out.println("Rows Updated :" + rowsUpdated);
		}
	}
	  public void registerSector() throws SQLException
	  {
		  printAircraftDetails();
		  System.out.println("No.of sectors needed to be added :");
			int n=Scan.getScannerInstance().nextInt();
			ArrayList<AircraftDto> sectorlist=new ArrayList<>();
			AircraftDto craftdto=new AircraftDto();
			sectorlist=setSectorDetails(n);
			for(int i=0;i<n;i++)
			{
				craftdto=sectorlist.get(i);
	            Connection con = DataConnect.getDbConnection();
			    String sql = "INSERT INTO sector VALUES(?,?,?,?,?,?)";
			    PreparedStatement pst = con.prepareStatement(sql);
			    pst.setString(1, craftdto.getsectorId());
			    pst.setString(2, craftdto.getaircraftCode());
			    pst.setString(3, craftdto.getfromStation());
			    pst.setString(4, craftdto.gettoStation());
			    pst.setString(5, craftdto.getscheduleDate());
			    pst.setInt(6, craftdto.getscheduleTime());
			    int rowsUpdated = pst.executeUpdate();
			    System.out.println("Rows Updated :" + rowsUpdated);
			}
		} 
	     public void viewSectorDetails() throws SQLException
	     {
	    	System.out.println("1.View Sector Details by Sector ID");
	 		System.out.println("2. View Sector Details by Aircraft Code");
	 		System.out.println("Enter your choice: ");
	 		int choice= Scan.getScannerInstance().nextInt();
	 		switch(choice)
	 		{
	 		case 1:
	 		{
	 			System.out.println("Enter Sector ID: ");
	 			 String sid=Scan.getScannerInstance().next();
	 			 viewSectorBySectorId(sid);
	 			 break;
	 		}
	 		case 2:
	 		{
	 			 System.out.println("Enter Aircraft ID: ");
	 			 String id=Scan.getScannerInstance().next();
	 			 viewSectorBySectorId(id);
	 			 break;
	 		}
	 		} 
	 		}
		  public void viewSectorByAircraftId(String id) throws SQLException
			 {
				 Connection con = DataConnect.getDbConnection();
				 String aQuery="SELECT sector_id,,aircraft_id,from_station,to_station,schedule_date,schedule_time FROM sector where aircraft_id=?";
				 PreparedStatement pst=con.prepareStatement(aQuery);
				 pst.setString(1,id);
				 ResultSet rs1=pst.executeQuery();
				 String aircraftCode;
				   String sectorId;
				   String fromStation;
				   String toStation;
				   String scheduleDate;
				   int scheduleTime;
				   while(rs1.next()) 
				   {
					   sectorId=rs1.getString(1);
					   System.out.println(sectorId);
					   aircraftCode=rs1.getString(2);
					   System.out.println(aircraftCode);
					   fromStation=rs1.getString(3);
					   System.out.println(fromStation);
					   toStation=rs1.getString(4);
					   System.out.println(toStation);
					   scheduleDate=rs1.getString(5);
					   System.out.println(scheduleDate);
					   scheduleTime=rs1.getInt(6);
					   System.out.println(scheduleTime);
				   }
			 }
		   public void viewSectorBySectorId(String sid1) throws SQLException
			 {
				 Connection con = DataConnect.getDbConnection();
				 String sQuery="SELECT sector_id,,aircraft_id,from_station,to_station,schedule_date,schedule_time FROM sector where sector_id=?";
				 PreparedStatement pst=con.prepareStatement(sQuery);
				 pst.setString(1,sid1);
				 ResultSet rs2=pst.executeQuery();
				 String aircraftCode;
				 String sectorId;
				 String fromStation;
				 String toStation;
				 String scheduleDate;
				 int scheduleTime;
				 while(rs2.next())
				   {
					   sectorId=rs2.getString(1);
					   System.out.println(sectorId);
					   aircraftCode=rs2.getString(2);
					   System.out.println(aircraftCode);
					   fromStation=rs2.getString(3);
					   System.out.println(fromStation);
					   toStation=rs2.getString(4);
					   System.out.println(toStation);
					   scheduleDate=rs2.getString(5);
					   System.out.println(scheduleDate);
					   scheduleTime=rs2.getInt(6);
					   System.out.println(scheduleTime);
				   }
			 }
		  
	  public void printAircraftDetails() throws SQLException
	  {
		  Connection con = DataConnect.getDbConnection();
		  String craftQuery="SELECT aircraft_id,aircraft_description from aircraft";
		  Statement st=con.createStatement();
		  ResultSet rs=st.executeQuery(craftQuery);
		  String aircraftCode;
		  String aircraftDescription;
		  while(rs.next()) 
		  {
			  aircraftCode=rs.getString(1);
			  aircraftDescription=rs.getString(2);
			  System.out.println("Aircraft code : "+aircraftCode);
			  System.out.println("Aircraft description : "+aircraftDescription);  
		  }  
	  }
	 
	  private ArrayList<AircraftDto> setAircraftDetails(int n) 
	  {
		  ArrayList<AircraftDto> craftDetails=new ArrayList<>();
		  Scanner scan=Scan.getScannerInstance();
		  for(int i=0;i<n;i++) 
		  {
			  craftDetails.add(new AircraftDto());
			  System.out.println("Enter AirCraft ID :");
			  craftDetails.get(i).setaircraftCode(scan.nextLine());
			  System.out.println("Enter description :");
 			  craftDetails.get(i).setdescription(scan.nextLine());
		  }
		  return craftDetails;
	  }
	  private ArrayList<AircraftDto> setSectorDetails(int n)
	  {
		  ArrayList<AircraftDto> sectorDetails=new ArrayList<>();
		  Scanner scan=Scan.getScannerInstance();
		  for(int i=0;i<n;i++)
		  {
			  sectorDetails.add(new AircraftDto());
			  System.out.println("Enter Sector Id :");
			  sectorDetails.get(i).setsectorId(scan.next());
			  System.out.println("Enter Aircraft Id :");
			  sectorDetails.get(i).setaircraftCode(scan.next());
			  System.out.println("Enter From Station  :");
			  sectorDetails.get(i).setfromStation(scan.next());
			  System.out.println("Enter To Station  :");
			  sectorDetails.get(i).settoStation(scan.next());
			  System.out.println("Enter Schedule Date  :");
			  sectorDetails.get(i).setscheduleDate(scan.next());
			  System.out.println("Enter Schedule Time  :");
			  sectorDetails.get(i).setscheduleTime(scan.nextInt());
		  }
		  return sectorDetails;
		  }
}
