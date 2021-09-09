package com.um21.aircraft.dto;

public class AircraftDto
{
   private String aircraftCode;
   private String description;
   private String sectorId;
   private String fromStation;
   private String toStation;
   private String scheduleDate;
   private int scheduleTime;
   public String getaircraftCode()
   {
	   return aircraftCode;
   }
   public void setaircraftCode(String aircraftCode)
   {
	   this.aircraftCode=aircraftCode;
   }
   public String getdescription()
   {
	   return description;
   }
   public void setdescription(String description)
   {
	   this.description=description;
   }
   public String getsectorId() {
	   return sectorId;
   }
   public void setsectorId(String sectorId)
   {
	   this.sectorId=sectorId;
   }
   public String getfromStation() {
	   return fromStation;
   }
   public void setfromStation(String fromStation) {
	   this.fromStation=fromStation;
   }
   public String gettoStation() {
	   return toStation;
   }
   public void settoStation(String toStation) {
	   this.toStation=toStation;
   }
   public String getscheduleDate() {
	   return scheduleDate;
   }
   public void setscheduleDate(String scheduleDate) {
	   this.scheduleDate=scheduleDate;	 
   }
   public int getscheduleTime() {
		return scheduleTime;
	}
	public void setscheduleTime(int scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
}
