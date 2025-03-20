package ma.ensa.examjee;

import java.io.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("exam");
        EntityManager entityManager=entityManagerFactory.createEntityManager();


    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "connected" + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}