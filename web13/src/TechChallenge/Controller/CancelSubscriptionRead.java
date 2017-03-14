package TechChallenge.Controller;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import TechChallenge.DAO.CancelSubscriptionDAO;
import beans.ParentBeans;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import ravi.model.ResponseSuccess;
import TechChallenge.Service.*;
@WebServlet("/CancelSubscriptionRead")
public class CancelSubscriptionRead extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("application/json");
		
		PrintWriter out=response.getWriter();
		
		String eventUrl=(String)request.getParameter("eventUrl");
		
		ObjectMapper mapper=new ObjectMapper();
		
		response.setStatus(200);
		
		ResponseSuccess responseObject = new ResponseSuccess(true,"new-account-modifier");
		
		String json=mapper.writeValueAsString(responseObject);
		
		System.out.println(eventUrl);
		
		CancelSubscription cs=new CancelSubscription();
		
		cs.cancel(eventUrl);
		
		out.print(json);
}
}
