
package by.java;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/submit")
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var name = request.getParameter("name");
        var method = request.getMethod();

        request.setAttribute("pageTitle", "Form Result");
        response.setContentType("text/html;charset=UTF-8");

        var out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");

        request.getRequestDispatcher("/head")
                .include(request, response);

        out.println("<body>");
        out.println("<h1>Hello, " + name + "!</h1>");
        out.println("<p>HTTP method: " + method + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
