package com.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FAQDbUtil {
	public List<FaqDetailsClass> getFaqList(){
		ArrayList<FaqDetailsClass> list  = new ArrayList<>();
		try(Connection con = DBConnection.getConnection()) {
			Statement st = con.createStatement();
			String sql = "select * from faq";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt(1);
				String question = rs.getString(2);
				String solution = rs.getString(3);
				
				FaqDetailsClass q = new FaqDetailsClass(id, question, solution);
				list.add(q);
			}
		}catch (Exception e) {
			System.out.println("error in getFaqList method "+e.getMessage());
		}
		return list;
	}
	
	public boolean insertFaq(String question, String solution) {
		boolean isSuccess = false;
		try(Connection con = DBConnection.getConnection()){
			Statement st = con.createStatement();
			String sql = "insert into `faq`"
					+ "values(0,'"+question+"','"+solution+"')";
			int result = st.executeUpdate(sql);
			if(result > 0) {
				isSuccess = true;
			}
		}catch (Exception e) {
			System.out.println("error in insertFaq method "+e.getMessage());
		}
		return isSuccess;
	}
	
	public boolean updateFaq(String id,String question, String solution) {
		boolean isSuccess = false;
		int convertID = Integer.parseInt(id);
		try(Connection con = DBConnection.getConnection()){
			Statement st = con.createStatement();
			String sql = "update faq "
					+ "set question='"+question+"',solution='"+solution+"'"
					+ "where id='"+convertID+"'";
			int result = st.executeUpdate(sql);
			if(result > 0) {
				isSuccess = true;
			}
		}catch (Exception e) {
			System.out.println("error in  method updateFaq "+e.getMessage());
		}
		return isSuccess;
	}

}
