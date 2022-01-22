package Servlet;

import Model.GuideMeTo;
import Model.Localizacao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.sql.SQLException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "MapServlet", value = "/map")
public class MapServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        try {
            GuideMeTo gtm = new GuideMeTo();
            request.setAttribute("GTM",gtm);
            Map<String, Localizacao> mapLocais = gtm.getLocalizacoes();
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();
            String local = gson.toJson(mapLocais);
            System.out.println("Local is" + local);
            request.setAttribute("Locais",gson);
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

        getServletContext().getRequestDispatcher("/map.jsp").forward(request,response);
        /*response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");*/
    }

    public void destroy() {
    }
}