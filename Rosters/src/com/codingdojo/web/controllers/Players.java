package com.codingdojo.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.web.models.Player;
import com.codingdojo.web.models.Team;

/**
 * Servlet implementation class Players
 */
@WebServlet("/Players")
public class Players extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Players() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		ArrayList<Team> teams = (ArrayList<Team>) session.getAttribute("teams");
		int id = Integer.parseInt(request.getParameter("id"));
		Team thisTeam = teams.get(id);
		request.setAttribute("id", id);
		request.setAttribute("teamName", thisTeam.getName());
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/newplayer.jsp");
        view.forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		ArrayList<Team> teams = (ArrayList<Team>) session.getAttribute("teams");
		int id = Integer.parseInt(request.getParameter("id"));
		Team thisTeam = teams.get(id);
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String age = request.getParameter("age");
		Player newPlayer = new Player(firstName, lastName, age);
		thisTeam.players.add(newPlayer);
		session.setAttribute("teams", teams);
		response.sendRedirect("/Rosters/Teams?id="+id);
	
	}

}
