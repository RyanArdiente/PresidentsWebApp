package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PresidentServlet
 */
@WebServlet("/PresidentServlet")
public class PresidentServlet extends HttpServlet
{

	@Override
	public void init() throws ServletException
	{
		// Rather than do this through a Servlet init,
		// it would be better to use a WebListener
		ServletContext context = getServletContext();
		PresidentsDAO presDAO = new PresidentsFileDAO(context);
		context.setAttribute("presidentDAO", presDAO);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/select.jsp").forward(request, response);
	}

	// Talking Point 1
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		ServletContext context = getServletContext();
		PresidentsDAO presDAO = (PresidentsDAO) context.getAttribute("presidentDAO");
		HttpSession session = request.getSession();

		// Talking Point 2
		if (session.getAttribute("presidents") == null)
		{
			session.setAttribute("presidents", presDAO);
		} // Talking Point 3
		if (request.getParameter("previous") != null)
		{
			Integer i = (Integer) request.getAttribute("rotationNumber");

			request.removeAttribute("rotationNumber");

			List<President> l = presDAO.getPresList();
			if (presDAO.getPresListNum() == 0)
			{
				presDAO.setPresListNum(43);
			} else
			{
				presDAO.setPresListNumMinus();
			}
			request.setAttribute("rotationNumber", presDAO.getPresListNum());
			request.getRequestDispatcher("/select.jsp").forward(request, response);
		} else if (request.getParameter("next") != null) // Talking Point 4
		{
			Integer i = (Integer) request.getAttribute("rotationNumber");

			request.removeAttribute("rotationNumber");

			if (presDAO.getPresListNum() == 43)
			{
				presDAO.setPresListNum(0);
			} else
			{
				presDAO.setPresListNumAddition();
			}
			request.setAttribute("rotationNumber", presDAO.getPresListNum());
			request.getRequestDispatcher("/select.jsp").forward(request, response);
		} else if (request.getParameter("submit") != null) // Talking Point 5
		{

			String symbol = request.getParameter("tn");
			int presnumber = 0;
			try
			{
				presnumber = Integer.parseInt(symbol);
				presnumber -= 1;
				request.removeAttribute("rotationNumber");
				presDAO.setPresListNum(presnumber);
				request.setAttribute("rotationNumber", presDAO.getPresListNum());
				request.getRequestDispatcher("/select.jsp").forward(request, response);
			} catch (Exception e)
			{
				// TODO: handle exception
			}

		}

		request.setAttribute("rotationNumber", presDAO.getPresListNum());
		request.getRequestDispatcher("/select.jsp").forward(request, response);

	}
}
