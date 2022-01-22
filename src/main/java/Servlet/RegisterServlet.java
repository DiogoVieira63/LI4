package Servlet;

import Model.GuideMeTo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "RegisterServlet", value = "/register")
public class RegisterServlet extends HttpServlet {
    //private GuideMeTo gtm = new GuideMeTo();
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        try {
            GuideMeTo guideMeTo = new GuideMeTo();

            String email = request.getParameter("email");
            String name = request.getParameter("name");
            String phone = request.getParameter("phone");
            String password = request.getParameter("password");
            String confirmPassword = request.getParameter("confirmPassword");

            if (email.isEmpty() || name.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                request.setAttribute("error", "You are missing one of the inputs");
                doGet(request, response);
            } else {
                if (!password.equals(confirmPassword)) {
                    request.setAttribute("error", "Passwords don't match");

                    doGet(request, response);
                } else {
                    if (phone.isEmpty())guideMeTo.registarUtilizador(name,password,email);
                    else guideMeTo.registarUtilizador(name,password,email,phone);
                    System.out.println("The account was been created");
                }
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        //String name = request.getParameter("name");
        //String num = request.getParameter("num");
        //Person p = new Person(name,password);
        //Person o = new Person("Bob","123");

        //if (gtm.login(Integer.parseInt(num))){ getServletContext().getRequestDispatcher("/register.html").forward(request,response); }
        //else { getServletContext().getRequestDispatcher("/hellon.html").forward(request, response); }

        getServletContext().getRequestDispatcher("/register.jsp").forward(request,response);
    }

}
