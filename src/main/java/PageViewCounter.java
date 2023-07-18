import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class PageViewCounter implements ServletContextListener {
    private int count = 0;

    public void contextInitialized(ServletContextEvent event) {
        event.getServletContext().setAttribute("count", count);
    }

    public void contextDestroyed(ServletContextEvent event) {
    }

    public void incrementCount() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void resetCount() {
    }
}
