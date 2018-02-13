package pl.sebastian;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        LocalDate localDate = LocalDate.now();
        out.println("<h1>Dzisiaj jest: " + localDate + "</h1>");
        out.println("<h1>Godzina: " + LocalTime.now() + "</h1>");

        if (localDate.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
            out.println("piątek!");
        }
    }
}
