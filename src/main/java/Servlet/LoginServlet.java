package Servlet;

import Model.GuideMeTo;
import Model.Localizacao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        try {
            GuideMeTo gtm = new GuideMeTo();
            getServletContext().setAttribute("GTM",gtm);

            String email = request.getParameter("email");
            String password = request.getParameter("password");


            if (email.isEmpty() || password.isEmpty()) {
                request.setAttribute("error", "Uma das caixas está vazia");
                doGet(request, response);
            }
            if (gtm.logIn(email, password)) {
                System.out.println("Válido");

                //getServletContext().getRequestDispatcher("/map.jsp").forward(request,response);
                getServletContext().setAttribute("Email",email);
                response.sendRedirect("/map");
            }
            else{
                System.out.println("Inválido");
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
    }

}
