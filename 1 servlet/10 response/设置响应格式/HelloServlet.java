import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class HelloServlet extends HttpServlet {
 
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
 
        try {
            PrintWriter pw = response.getWriter();
            pw.println("<h1>Hello Servlet</h1>");
 
            response.setContentType("text/lol");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
}