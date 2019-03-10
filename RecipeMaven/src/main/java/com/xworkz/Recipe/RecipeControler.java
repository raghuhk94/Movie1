package com.xworkz.Recipe;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecipeControler
 */
public class RecipeControler extends HttpServlet {



	public RecipeControler() {
		super();

		System.out.println("created:\t"+this.getClass().getSimpleName());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		RecipeDTO dto=new RecipeDTO();
		dto.setName(request.getParameter("name"));
		dto.setPrice(Integer.parseInt(request.getParameter("price")));
		dto.setType(request.getParameter("type"));
		
		RecipeDAO dao=new RecipeDAO();
		boolean b=dao.insert(dto);

		if(b==true)
      request.setAttribute("dto", dto);
     RequestDispatcher dispatcher=request.getRequestDispatcher("output.jsp");
     dispatcher.forward(request, response);
     
	}


}


