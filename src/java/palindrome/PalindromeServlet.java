
package palindrome;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "PalindromeServlet", urlPatterns = {"/PalindromeServlet"})
public class PalindromeServlet extends HttpServlet {

    
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String word = request.getParameter("word");
        String reverse = new StringBuilder(word).reverse().toString();
        
        out.println("<html><body>");
        out.println("<h2>Word: "+word+"</h2>");
        if(word.equalsIgnoreCase(reverse)){
            out.println("<h3 style='color:green;'>It is a Palindrome!</h3>");
        } else {
            out.println("<h3 style='color:red;'>Not a Palindrome!</h3>");
        }
        out.println("</body></html>");
    }
}
