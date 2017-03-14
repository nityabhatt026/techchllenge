package TechChallenge.DAO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import beans.Creator;
import beans.ParentBeans;
import ravi.util.DBConnectionManager;

public class CreateSubscriptionDAO implements CreateDaoInterface{
	
	public void addUsers(ParentBeans u_obj) throws Exception{
		
	try{ 

	   Connection con = (Connection) DBConnectionManager.getConnection();
PreparedStatement pst=(PreparedStatement) con.prepareStatement("insert into Creator (uuid,firstName,lastName,email)values(?,?,?,?)");
	pst.setString(1,u_obj.getCreator().getUuid());
	pst.setString(2,u_obj.getCreator().getFirstName());
	pst.setString(3,u_obj.getCreator().getLastName());
	pst.setString(4,u_obj.getCreator().getEmail());
	//System.out.println("*******************jhyjuyju");
	//System.out.println(pst);
	pst.executeUpdate();
	//System.out.println(pst);
	//pst.close();
	
PreparedStatement pst1=(PreparedStatement) con.prepareStatement("insert into Marketplace (baseUrl,partner,uuid)values(?,?,?)");
    pst1.setString(1,u_obj.getMarketplace().getBaseUrl());
    pst1.setString(2,u_obj.getMarketplace().getPartner());
    pst1.setString(3,u_obj.getCreator().getUuid());
	pst1.executeUpdate();
	//System.out.println("***********hiiiiiiiiiii********jhyjuyju");
	//pst1.close();
	//con.close();
	
PreparedStatement pst2=(PreparedStatement) con.prepareStatement("insert into Company (uuid,name,email,phoneNumber,website)values(?,?,?,?,?)");	
    pst2.setString(1, u_obj.getCreator().getUuid());
    pst2.setString(2, u_obj.getPayload().getCompany().getName());
    pst2.setString(3, u_obj.getPayload().getCompany().getEmail());
    pst2.setString(4, u_obj.getPayload().getCompany().getPhoneNumber());
    pst2.setString(5, u_obj.getPayload().getCompany().getWebsite());
   
    pst2.executeUpdate();
 
/*PreparedStatement pst3=(PreparedStatement) con.prepareStatement("insert into Accounts (AccountIdentifier)values(?)");	
    pst3.setString(1, u_obj.getAccounts().getAccountIdentifier());
    
	}*/
}
catch(Exception e){
		e.printStackTrace();
	}	
}
}
