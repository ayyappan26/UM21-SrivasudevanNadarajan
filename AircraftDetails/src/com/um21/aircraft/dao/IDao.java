package com.um21.aircraft.dao;
import java.sql.SQLException;
public interface IDao 
{
  public void registerAircraft() throws SQLException;
  public void registerSector() throws SQLException;
  public void viewSectorDetails() throws SQLException;
}
