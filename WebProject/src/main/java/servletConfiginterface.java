import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
    urlPatterns = "/servletConfiginterface",
    initParams = {
        @jakarta.servlet.annotation.WebInitParam(name="username", value="admin"),
        @jakarta.servlet.annotation.WebInitParam(name="password", value="1234")
    }
)
public class servletConfiginterface extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        ServletConfig config = getServletConfig();

        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");

        out.println("Username: " + username);
        out.println("<br>Password: " + password);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}