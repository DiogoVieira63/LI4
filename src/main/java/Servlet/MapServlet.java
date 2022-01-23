package Servlet;

import Model.CentroHistorico;
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
            String email = (String) getServletContext().getAttribute("Email");
            System.out.println(email);
            String nome = gtm.getNome(email);
            String centro = request.getParameter("key");
            Gson gson = new Gson();
            if ( centro != null){
                CentroHistorico centroHistorico =  gtm.getCentro(centro);
                String centroJSON = gson.toJson(centroHistorico);
                request.setAttribute("Centro",centroJSON);
                System.out.println(centroJSON);
            }
            request.setAttribute("Nome",nome);
            request.setAttribute("Email",email);
            Map<String, Localizacao> mapLocais = gtm.getLocalizacoes();
            String local = gson.toJson(mapLocais);
            System.out.println("Locais is" + local);
            request.setAttribute("Locais",local);
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