package com.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class userDBUtil implements IRegister{

	@Override
	public boolean register(String name, String email, String phone, String username, String password) {
		boolean result = false;

		try (Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "insert into `userdb` " + "values(0,'" + name + "','" + email + "','" + phone + "','"
					+ username + "','" + password + "','USER')";
			int recievedVal = st.executeUpdate(sql);
			if (recievedVal > 0) {
				result = true;
			}
		} catch (Exception e) {
			System.out.println("Error Occur in Registration method " + e.getMessage());
		}
		return result;
	}
	
	public boolean register(String name, String email, String phone, String username, String password,String role) {
		boolean result = false;

		try (Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "insert into `userdb` " + "values(0,'" + name + "','" + email + "','" + phone + "','"
					+ username + "','" + password + "','"+role+"')";
			int recievedVal = st.executeUpdate(sql);
			if (recievedVal > 0) {
				result = true;
			}
		} catch (Exception e) {
			System.out.println("Error Occur in Event Cordinator Registration method " + e.getMessage());
		}
		return result;
	}

	public String getRole(String username) {
		String role = null;
		try (Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "select role from userdb where username = '" + username + "'";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				role = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println("error in getRole method " + e.getMessage());
		}
		return role;
	}

	public boolean validate(String username, String password) {
		boolean isSuccess = false;
		try (Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "select * from userdb where username = '" + username + "' and password = '" + password + "'";
			ResultSet rs = st.executeQuery(sql);
			if (rs.next())
				isSuccess = true;
		} catch (Exception e) {
			System.out.println("error in validation phase" + e.getMessage());
		}

		return isSuccess;
	}

	public List<UserDetailsClass> getUserData(String username) {
		ArrayList<UserDetailsClass> user = new ArrayList<>();

		try (Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "select  * from userdb where username = '" + username + "'";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String uid = rs.getString(5);
				String password = rs.getString(6);
				UserDetailsClass data = new UserDetailsClass(id, name, email, phone, uid, password);
				user.add(data);
			}
		} catch (Exception e) {
			System.out.println("error in getUserData method " + e.getMessage());
		}
		return user;
	}

	public List<UserDetailsClass> getEventCordinatorS() {
		ArrayList<UserDetailsClass> user = new ArrayList<>();

		try (Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "select  * from userdb where role ='EC'";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String uid = rs.getString(5);
				String password = rs.getString(6);
				UserDetailsClass data = new UserDetailsClass(id, name, email, phone, uid, password);
				user.add(data);
			}
		} catch (Exception e) {
			System.out.println("error in getEventCordinator method " + e.getMessage());
		}
		return user;
	}

	public boolean removeEventCordi(String id, String uid) {
		boolean isSuccess = false;
		try (Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "delete from userdb where id = '" + id + "' and username = '" + uid + "'";
			int result = st.executeUpdate(sql);
			if (result > 0) {
				isSuccess = true;
			}
		} catch (Exception e) {
			System.out.println("error in romove event cordi method " + e.getMessage());
		}
		return isSuccess;
	}
	
	public boolean updateEventCordiDetails(String id,String name, String email,String phone,String uname) {
		boolean isSuccess = false;
		int eId = Integer.parseInt(id);
		try(Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "update userdb "
					+ "set name='"+name+"',email='"+email+"',phone='"+phone+"'where id='"+eId+"' and username = '"+uname+"'";
			int rs = st.executeUpdate(sql);
			if(rs>0) {
				isSuccess = true;
			}
		}catch (Exception e) {
			System.out.println("error in update Event cordi method "+e.getMessage());
		}
		return isSuccess;
	}
	
}
