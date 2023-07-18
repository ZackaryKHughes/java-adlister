import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResetCounterServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PageViewCounter counter = (PageViewCounter) getServletContext().getAttribute("counter");
        counter.resetCount();
        response.sendRedirect("/count");
    }
}
