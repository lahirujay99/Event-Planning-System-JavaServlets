package com.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class EventDButil {
	
	public boolean insertEvent(String etype,String eguest,String edate,String evenue,String emsg,String username) {
		boolean isSuccess = false;
		try (Connection con = DBConnection.getConnection()){
			Statement st = con.createStatement();
			String sql = "insert into `eformdb`"
					+ "values(0,'"+etype+"','"+eguest+"','"+edate+"','"+evenue+"','"+emsg+"','"+username+"')";
			int result = st.executeUpdate(sql);
			if(result > 0) {
				isSuccess = true;
				System.out.println("event form data insertion success");
			}
		}catch (Exception e) {
			System.out.println("Error in insert event phase!! "+e.getMessage());
		}
		return isSuccess;
	}
	
	public boolean acceptEvent(String etype,String eguest,String edate,String evenue,String emsg,String username) {
		boolean isSuccess = false;
		try (Connection con = DBConnection.getConnection()){
			Statement st = con.createStatement();
			String sql = "insert into `acceptedevents`"
					+ "values(0,'"+etype+"','"+eguest+"','"+edate+"','"+evenue+"','"+emsg+"','"+username+"')";
			int result = st.executeUpdate(sql);
			if(result > 0) {
				isSuccess = true;
				System.out.println("event accept success");
			}
		}catch (Exception e) {
			System.out.println("Error in accept event phase!! "+e.getMessage());
		}
		return isSuccess;
	}
	
	public List<EventDetailsClass> getSingleEvent(String username){
		ArrayList<EventDetailsClass> event = new ArrayList<>();
		try(Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "select * from eformdb where username = '"+username+"'";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int uid = rs.getInt(1);
				String etype = rs.getString(2);
				String eguest = rs.getString(3);
				String edate = rs.getString(4);
				String evenue = rs.getString(5);
				String emsg = rs.getString(6);
				String uname = rs.getString(7);
				EventDetailsClass e = new EventDetailsClass(uid, etype, eguest, edate, evenue, emsg, uname);
				event.add(e);
			}
		}catch (Exception e) {
			System.out.println("getting event information failed "+e.getMessage());
		}
		return event;
	}
	
	public List<EventDetailsClass> getAllEvents(){
		ArrayList<EventDetailsClass> event = new ArrayList<>();
		try(Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "select * from eformdb";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int uid = rs.getInt(1);
				String etype = rs.getString(2);
				String eguest = rs.getString(3);
				String edate = rs.getString(4);
				String evenue = rs.getString(5);
				String emsg = rs.getString(6);
				String uname = rs.getString(7);
				EventDetailsClass e = new EventDetailsClass(uid, etype, eguest, edate, evenue, emsg, uname);
				event.add(e);
			}
		}catch (Exception e) {
			System.out.println("getting event information failed "+e.getMessage());
		}
		return event;
	}
	
	public boolean updateEventDetails(String id,String etype, String eguest,String edate,String evenue,String emsg,String uid) {
		boolean isSuccess = false;
		int eId = Integer.parseInt(id);
		try(	Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "update eformdb "
					+ "set etype='"+etype+"',eguest='"+eguest+"',edate='"+edate+"',evenue='"+evenue+"',emsg='"+emsg+"'"
					+ "where id='"+eId+"'";
			int rs = st.executeUpdate(sql);
			if(rs>0) {
				isSuccess = true;
			}
		}catch (Exception e) {
			System.out.println("error in update event form method "+e.getMessage());
		}
		return isSuccess;
	}
	
	public boolean deleteEvent(String id,String uid) {
		boolean isSuccess = false;
		try(Connection con = DBConnection.getConnection()){
			Statement st = con.createStatement();
			String sql = "delete from eformdb where id = '"+id+"' and username = '"+uid+"'";
			int result = st.executeUpdate(sql);
			if(result>0){
				isSuccess = true;
			}
		}catch (Exception e) {
			System.out.println("Error in delete event phase "+e.getMessage());
		}
		return isSuccess;
	}
	
	public List<EventDetailsClass> viewAcceptEvents(){
		ArrayList<EventDetailsClass> event = new ArrayList<>();
		try(Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "select * from acceptedevents";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int uid = rs.getInt(1);
				String etype = rs.getString(2);
				String eguest = rs.getString(3);
				String edate = rs.getString(4);
				String evenue = rs.getString(5);
				String emsg = rs.getString(6);
				String uname = rs.getString(7);
				EventDetailsClass e = new EventDetailsClass(uid, etype, eguest, edate, evenue, emsg, uname);
				event.add(e);
			}
		}catch (Exception e) {
			System.out.println("error in viewAcceptEvents method "+e.getMessage());
		}
		return event;
	}
	
	public boolean rejectEvent(String id,String uid) {
		boolean isSuccess = false;
		try(Connection con = DBConnection.getConnection()){
			Statement st = con.createStatement();
			String sql = "delete from eformdb where id = '"+id+"' and username = '"+uid+"'";
			int result = st.executeUpdate(sql);
			if(result>0){
				isSuccess = true;
			}
		}catch (Exception e) {
			System.out.println("Error in reject event phase "+e.getMessage());
		}
		return isSuccess;
	}
	
	public boolean setBudget(String etype,String eguest,String edate,String evenue,String emsg,String username,String budget) {
		boolean isSuccess = false;
		try (Connection con = DBConnection.getConnection()){
			Statement st = con.createStatement();
			String sql = "insert into `budget`"
					+ "values(0,'"+etype+"','"+eguest+"','"+edate+"','"+evenue+"','"+emsg+"','"+username+"','"+budget+"')";
			int result = st.executeUpdate(sql);
			if(result > 0) {
				isSuccess = true;
				System.out.println("budget form data insertion success");
			}
		}catch (Exception e) {
			System.out.println("Error in insert budget method!! "+e.getMessage());
		}
		return isSuccess;
	}
	
	public List<BudgetDetailsClass> getAllBudgetList(){
		ArrayList<BudgetDetailsClass> budgetlist = new ArrayList<>();
		try(Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "select * from budget";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int uid = rs.getInt(1);
				String etype = rs.getString(2);
				String eguest = rs.getString(3);
				String edate = rs.getString(4);
				String evenue = rs.getString(5);
				String emsg = rs.getString(6);
				String uname = rs.getString(7);
				String budget = rs.getString(8);
				BudgetDetailsClass b = new BudgetDetailsClass(uid, etype, eguest, edate, evenue, emsg, uname, budget);
				budgetlist.add(b);
			}
		}catch (Exception e) {
			System.out.println("getting event information failed "+e.getMessage());
		}
		return budgetlist;
	}
	
	public boolean updateBudgetDetails(String id,String etype, String eguest,String edate,String evenue,String emsg,String uid,String budget) {
		boolean isSuccess = false;
		int eId = Integer.parseInt(id);
		try(	Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "update budget "
					+ "set etype='"+etype+"',eguest='"+eguest+"',edate='"+edate+"',evenue='"+evenue+"',emsg='"+emsg+"',budget = '"+budget+"'"
					+ "where id='"+eId+"'";
			int rs = st.executeUpdate(sql);
			if(rs>0) {
				isSuccess = true;
			}
		}catch (Exception e) {
			System.out.println("error in update budget form method "+e.getMessage());
		}
		return isSuccess;
	}
	
	
	public boolean deleteBudget(String id,String uid) {
		boolean isSuccess = false;
		int convertId = Integer.parseInt(id);
		try(Connection con = DBConnection.getConnection()){
			Statement st = con.createStatement();
			String sql = "delete from budget where id = '"+convertId+"' and username = '"+uid+"'";
			int result = st.executeUpdate(sql);
			if(result>0){
				isSuccess = true;
			}
		}catch (Exception e) {
			System.out.println("Error in delete budget phase "+e.getMessage());
		}
		return isSuccess;
	}
	

}
