package TechChallenge.Service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import TechChallenge.DAO.CancelSubscriptionDAO;
import TechChallenge.DAO.CreateSubscriptionDAO;
import beans.ParentBeans;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;

public class CreateSubscription implements CreateSubscriptionInterface {
	
	public void create(String eventUrl){
		System.out.println("jhfgzhzhzhzzh");
	OAuthConsumer consumer = new DefaultOAuthConsumer("techpro-152811", "fJFSqEdsY51xj2J6");
	
	System.out.println("Keys Entered");
	
	try{
		
	URL url = new URL(eventUrl);
	
	HttpURLConnection requestres = (HttpURLConnection) url.openConnection();
	
	requestres.setRequestProperty("Accept","application/json");
	
	try
	
	{
		
		System.out.println("Keys Entered Signed");
		
		consumer.sign(requestres);
		
		requestres.connect();
		
	}
	
	catch(Exception e)
	{	
		
		e.printStackTrace();
		
	}
	
	BufferedReader br = new BufferedReader(new InputStreamReader(requestres.getInputStream()));
	
	String last=br.readLine();
	
	System.out.println(last);
	
	ObjectMapper om = new ObjectMapper();
	
	 ParentBeans pb = om.readValue(last, ParentBeans.class);
 
	 CreateSubscriptionDAO csd=new CreateSubscriptionDAO();
	 
	 csd.addUsers(pb);
	 
	 //CancelSubscriptionDAO csd1= new CancelSubscriptionDAO();
	 //csd1.deleteUsers(pb);
	}
	
	catch (Exception e) {
		
		e.printStackTrace();
		
    	e.getMessage();
    	
	}	
	
}
	
}
