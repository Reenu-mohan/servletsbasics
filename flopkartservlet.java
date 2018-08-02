package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class flopkartservlet
 */
public class flopkartservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public flopkartservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		Cookie allCookie[]=request.getCookies();
		PrintWriter pw=response.getWriter();
		pw.println("<h1><center>WELCOME TO FLOPKART ,INDIA'S WORST SHOPPING EXPERIENCE</center></h1>");
		if (allCookie==null)
		{
			Cookie c=new Cookie("location", "banglore");
			c.setMaxAge(24*60*60);
			response.addCookie(c);
			pw.println("<h3>welcome to the first time</h3>");
			pw.println("<h1>for sure, you will like my online </h1>");
			
		}
		else
		{
			pw.println("<h3>welcome </h3>");
			pw.println("<h4>please write your review </h4>");
			String str1="<body bgcolor=pink>";
			pw.println(str1);
			for(int i=0;i<allCookie.length;i++)
			{
				Cookie cc=allCookie[i];
				System.out.println(cc.getName()+" and "+cc.getValue());
				String name=cc.getName();
				String value=cc.getValue();
				if(name.equals("banglore")&&value.equals("location"))
				{
					pw.println("Welcome back to my store");
					pw.println("since you liked my store");
					pw.println("now you are my regular customer");}
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
