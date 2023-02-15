package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prodao.Patientdao;
@WebServlet("/yfn2")
public class Servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String a=req.getParameter("id");
		int id=Integer.parseInt(a);
		String blood_grp=req.getParameter("blood_grp");
		
		Patientdao patientdao=new Patientdao();
		patientdao.update(id, blood_grp);
	}
	
	

}
