package ex_002_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        proccessRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        proccessRequest(req, resp);
    }

    /**
     * Вызывается в любом случае, при любом запросе
     * 
     * @param req
     * @param resp
     * @throws IOException
     */
    private void proccessRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // Указываем кодировку
    	resp.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = resp.getWriter();

        try {
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>");
            writer.println("second servlet");
            writer.println("</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h2>");
            writer.println("Second servlet from: " + req.getContextPath());
            writer.println("</h2>");
            writer.println("</body");
            writer.println("</html>");
        } 
        finally {
            writer.close();
        }

    }
}
