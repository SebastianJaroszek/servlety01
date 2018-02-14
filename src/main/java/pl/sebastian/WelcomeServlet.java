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

    private String company;
    private String year;

    @Override
    public void init(ServletConfig config) throws ServletException {
        company = config.getInitParameter("company");
        year = config.getInitParameter("year");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Welcome!</h1>");
        out.println("Zasadnicza część strony");

        printFooter(out);
    }

    private void printFooter(PrintWriter out) {
        if (company != null && year != null){
            out.println("<br><hr>");
            out.println(company + " " + year);
        }
    }
}
