package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cubeServlet
 */
public class cubeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cubeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int no=Integer.parseInt(request.getParameter("no"));
		
		int cube=no*no*no;
		
		
		
		int square=(Integer)request.getAttribute("square");
		PrintWriter pw= response.getWriter();
				pw.println("</br><center><h1>Calculator Servlet</h1></center>");
				pw.println("<center>");
				pw.println("</br>sum is :"+no);
				pw.println("</br>sum is :"+cube);
				pw.println("</br>sum is : "+square);
				pw.println("</center>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
