package com.components;
import java.sql.*;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection ct = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:test1","scott","362908227");
			
			CallableStatement cs = ct.prepareCall("{call pagination(?,?,?,?,?,?)}");
			//table name
			cs.setString(1, "emp");
			//page size
			cs.setInt(2, 3);
			//page now
			cs.setInt(3, 1);
			//register the row count
			cs.registerOutParameter(4, oracle.jdbc.OracleTypes.INTEGER);
			//register the page count
			cs.registerOutParameter(5, oracle.jdbc.OracleTypes.INTEGER);
			//register the result set
			cs.registerOutParameter(6, oracle.jdbc.OracleTypes.CURSOR);
			//execute
			cs.execute();
			//get the result
			int rowCount=cs.getInt(4);
			int pageCount=cs.getInt(5);
			ResultSet rs = (ResultSet) cs.getObject(6);
			System.out.println("row count=" + rowCount);
			System.out.println("page count=" + pageCount);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
