package learnjava;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloServlet") //HelloServlet is url pattern
public class servlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("Hello World");
		out.println("<font face=\"arial\" size=\"5\" color=\"red\">Good Moring</font>");
	}
}
//http://localhost:8080/WebProject/servlet/HelloServlet - error
//Use the annotation above the class @WebServlet("/HelloServlet")


