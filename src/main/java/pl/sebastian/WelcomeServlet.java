package pl.sebastian;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/welcome", "/hello", "/hi"},
        initParams = {
                @WebInitParam(name = "company", value = "Software Development Academy"),
                @WebInitParam(name = "year", value = "2018")
        })
public class WelcomeServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        //TODO odczytać parametry
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Welcome!</h1>");
    }
}
