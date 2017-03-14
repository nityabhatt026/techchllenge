package TechChallenge.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import TechChallenge.Service.CreateSubscription;
import ravi.model.ResponseSuccess;

@WebServlet("/CreateSubscriptionRead")
public class CreateSubscriptionRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
response.setContentType("application/json");
		
		PrintWriter out=response.getWriter();
		
		String eventUrl=(String)request.getParameter("eventUrl");
		
		ObjectMapper mapper=new ObjectMapper();
		
		response.setStatus(200);
		
		ResponseSuccess responseObject = new ResponseSuccess(true,"new-account-modifier");
		
		String json=mapper.writeValueAsString(responseObject);
		
		out.print(json);
		
		System.out.println(eventUrl);
		
		CreateSubscription cs =new CreateSubscription();
		
		cs.create(eventUrl);
		
		
	}

}
