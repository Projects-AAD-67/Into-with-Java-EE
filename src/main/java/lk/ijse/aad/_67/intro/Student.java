package lk.ijse.aad._67.intro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(value = "/*")
public class Student extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Student Servlet");
        System.out.println("HTTP method: " + req.getMethod());
        System.out.println("Context Path: "+req.getContextPath());
        System.out.println("Servlet Path: "+req.getServletPath());
        System.out.println("Path info: "+req.getPathInfo());
        System.out.println("Path translated: "+req.getPathTranslated());
        System.out.println("Query String : "+req.getQueryString());
        System.out.println("Request URI : "+req.getRequestURI());
        System.out.println("Request URL : "+req.getRequestURL());
        System.out.println("Get Protocol : "+req.getProtocol());
        System.out.println("Get Scheme : "+req.getScheme());

        System.out.println(req.getParameter("name"));

    }
}
