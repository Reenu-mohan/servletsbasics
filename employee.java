package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class employee
 */
@WebServlet("/employee")
public class employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw= response.getWriter();
		pw.println("......CALCULATE......");
		String name=request.getParameter("name");
		double n=Double.parseDouble(request.getParameter("num"));
		String grade=request.getParameter("grade");
		 
		double tax,bonus=0.0;
		if((n>=100000) && (grade.equals("A")))
		
			bonus=.05*n;
			
		else if((n>=50000) && (n<100000) && (grade.equals("B")))
			bonus=.07*n;
		
		else if((n<50000)  && (grade.equals("C")))
		
			bonus=.20*n;
		else
			pw.println("</br> you dont have any bonus");
		tax=.25*n;
		double net_sal=n+bonus-tax;
		
		String st1="<table border=1>"+
		"<tr><th>name</th>"+
				"<th>basic salary</th>"+
		"<th>bonus</th>"+
				"<th>tax</th>"+
				"<th>net salary</th>"+
				"</tr>";
		String st2="<table border=1>"+
				"<tr><th>"+name+"</th>"+
				"<th>"+n+"</th>"+
				"<th>"+bonus+"</th>"+
				"<th>"+tax+"</th>"+
				"<th>"+net_sal+"</th>"+
				"</tr>";
		pw.println(st1);
		pw.println(st2);
		//pw.println("</br>Employee Name: "+name);
	//	pw.println("</br>Employee Basic salary:Rs "+n);
	//	pw.println("</br>Employee Bonus: Rs"+bonus);
		//pw.println("</br>Employee Tax: Rs"+tax);
		//pw.println("</br>Employee Net Salary: Rs "+net_sal);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
