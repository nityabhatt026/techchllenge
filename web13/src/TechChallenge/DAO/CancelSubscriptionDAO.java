package TechChallenge.DAO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import beans.ParentBeans;
import ravi.util.DBConnectionManager;

public class CancelSubscriptionDAO implements CancelDaoInterface{
	public void deleteUsers(ParentBeans u_obj) throws Exception{
		try{
		
	Connection con = (Connection) DBConnectionManager.getConnection();
		String uuid = u_obj.getCreator().getUuid();
		
     String query="DELETE FROM Creator WHERE uuid = ?";
	   PreparedStatement stmt=(PreparedStatement) con.prepareStatement(query);
		stmt.setString(1,uuid);
		
		 stmt.executeUpdate();
		
		String query1="DELETE FROM Marketplace WHERE uuid = ?";
		   PreparedStatement stmt1=(PreparedStatement) con.prepareStatement(query1);
			stmt1.setString(1,uuid);
			
			 stmt1.executeUpdate();
			
			
	String query2="DELETE FROM Company WHERE uuid = ?";
	   PreparedStatement stmt2=(PreparedStatement) con.prepareStatement(query2);
		stmt2.setString(1,uuid);
		
		stmt2.executeUpdate();
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
