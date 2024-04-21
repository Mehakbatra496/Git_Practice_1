import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servletPractice")
public class A1_servlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		System.out.println("Hello, See the output on the browser");
		
		PrintWriter out = resp.getWriter();
		
		System.out.println(out);

		Enumeration<String> headerName= req.getHeaderNames();
		System.out.println(headerName);

		while(headerName.hasMoreElements())
		{
			String hname=headerName.nextElement();  // get the name of the header
		    String hvalue=req.getHeader(hname); //get the value of the header name
//		    out.print(hname);
//		    out.print("       :       ");
//		    out.println(hvalue);
		    		
		}
		
		String email1=req.getParameter("email1");	//will get the email from the index.html page
		String pass1=req.getParameter("pass1");
		
		out.println("Entered Email is - " +email1);
		out.println("Entered Password is - " +pass1);
		
	}
}





