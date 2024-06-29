package lk.ijse.aad._67.intro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/customer",
initParams = {
        @WebInitParam(name="vl1",value = "20")
}
)
public class Customer extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        var param1 = req.getParameter("incomingValue1");
        int paramInt1 = Integer.parseInt(param1);
        var paramInt2 = Integer.parseInt(getServletConfig().getInitParameter("vl1"));
        out.write(calcData(paramInt1,paramInt2));
        out.close();
    }

    private String calcData(int param1, int initValue1) {
        int calc = param1 + initValue1;
        return calc % 2 == 0 ? "Even" : "Odd";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("Hello Customer");
    }
}
