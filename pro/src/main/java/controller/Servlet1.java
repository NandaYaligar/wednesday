package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prodao.Patientdao;

@WebServlet("/yfn1")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a=req.getParameter("id");
		int id=Integer.parseInt(a);
		
		Patientdao patientdao=new Patientdao();
		patientdao.remove(id);
	}	
}
