package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		writer.println( "<html>" );
		writer.println( "<head>" );
		writer.println( "<title>hello from servlet</title>" );
		writer.println( "</head>" );
		writer.println( "<body>" );
		writer.println( "<h1>hello from first servlet</h1>" );
		writer.println( "</body>" );		
		writer.println( "</html>" );
	}

}
