package Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AuthenticationServlet", value = "/authentication")
public class AuthenticationServlet extends HttpServlet {
        //private GuideMeTo gtm = new GuideMeTo();

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
            //String name = request.getParameter("name");
            //String num = request.getParameter("num");
            //Person p = new Person(name,password);
            //Person o = new Person("Bob","123");

            //if (gtm.login(Integer.parseInt(num))){ getServletContext().getRequestDispatcher("/hellop.html").forward(request,response); }
            //else { getServletContext().getRequestDispatcher("/hellon.html").forward(request, response); }
        }

}
