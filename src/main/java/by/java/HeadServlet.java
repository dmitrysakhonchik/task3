
package by.java;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/head")
public class HeadServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        var title = (String) request.getAttribute("pageTitle");
        var out = response.getWriter();

        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>" + title + "</title>");
        out.println("<style>");
        out.println("</style>");
        out.println("</head>");
    }
}
