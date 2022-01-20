package HTTP;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import src.GuideMeTo;

public class HTTPAutentication extends HttpServlet{

    private GuideMeTo gtm = new GuideMeTo();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{ 
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        if (gtm.logIn(name, password)){ getServletContext().getRequestDispatcher("/p.hmtl").forward(request,response); }
        else { getServletContext().getRequestDispatcher("/r.html").forward(request, response); }
    }
}