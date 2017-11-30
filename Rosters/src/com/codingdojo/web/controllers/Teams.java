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

import com.codingdojo.web.models.Team;

/**
 * Servlet implementation class Teams
 */
@WebServlet("/Teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		if (request.getParameter("id")!= null) {
			System.out.println("anything");
			int teamID = Integer.parseInt(request.getParameter("id"));
			ArrayList<Team> teams = (ArrayList<Team>) session.getAttribute("teams");
			Team thisTeam = teams.get(teamID);
			request.setAttribute("teamID", teamID);
			request.setAttribute("thisTeam", thisTeam);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/details.jsp");
	        view.forward(request, response);
		}
		
		else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/team.jsp");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String teamName = request.getParameter("team_name");
		Team team1 = new Team(teamName);
		ArrayList<Team> teams = (ArrayList<Team>) session.getAttribute("teams");
		teams.add(team1);
		session.setAttribute("teams", teams);
		response.sendRedirect("/Rosters/Home");
	}

}
