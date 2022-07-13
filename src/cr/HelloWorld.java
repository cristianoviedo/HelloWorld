package cr;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Simple Hello servlet.
 */

public final class HelloWorld extends HttpServlet {
    
    
    /**
     * Respond to a GET request for the content produced by
     * this servlet.
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are producing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
    throws IOException, ServletException {
        
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Ejemplo Application Servlet Page</title>");
        writer.println("</head>");
        writer.println("<body bgcolor=white>");
        
        writer.println("<table border=\"0\" cellpadding=\"10\">");
        writer.println("<tr>");
        writer.println("<td>");
        writer.println("<img src=\"images/3htp.png\">");
        writer.println("</td>");
        writer.println("<td>");
        writer.println("<h1>GRACIAS</h1>");
        writer.println("<h1>Preguntas .. Dudas ....Sugerencias..????</h1>");
        writer.println("</td>");
        writer.println("</tr>");
        writer.println("</table>");
        
        writer.println("ESTA ES LA SALIDA PARA MI APLICACION");
        writer.println("the Hello, World application.");
        
        writer.println("</body>");
        writer.println("</html>");
    }
}