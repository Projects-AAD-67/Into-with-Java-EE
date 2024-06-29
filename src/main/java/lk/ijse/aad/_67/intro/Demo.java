package lk.ijse.aad._67.intro;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(value = "/health")
public class Demo extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Init called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("Health Test  GET");
//        System.out.println(req.getMethod());
//        PrintWriter writer = resp.getWriter();
//        writer.println("Hello get");
        var initParam1 = getServletContext().getInitParameter("aad");
        var initParam2 = getServletContext().getInitParameter("home");
        System.out.println(initParam1);
        System.out.println(initParam2);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Health Test - POST");
        System.out.println(req.getMethod());
    }

    @Override
    public void destroy() {
        System.out.println("Man yanooooooo");
    }
}
