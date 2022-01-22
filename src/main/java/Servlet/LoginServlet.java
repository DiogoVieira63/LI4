package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
        //private GuideMeTo gtm = new GuideMeTo();
        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

            String email = request.getParameter("email");
            String password = request.getParameter("password");


            if (email.isEmpty() || password.isEmpty()) {
                request.setAttribute("error", "You are missing one of the inputs");
                doGet(request, response);
            }
            //if(gmt.login(email,password))
            System.out.println("The login was successful");

        }

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
            //String name = request.getParameter("name");
            //String num = request.getParameter("num");
            //Person p = new Person(name,password);
            //Person o = new Person("Bob","123");

            //if (gtm.login(Integer.parseInt(num))){ getServletContext().getRequestDispatcher("/register.html").forward(request,response); }
            //else { getServletContext().getRequestDispatcher("/hellon.html").forward(request, response); }

            getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
        }

}
