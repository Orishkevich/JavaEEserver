

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SampleServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html"); // Content-Type: text/html

        PrintWriter pw = resp.getWriter();
        pw.println("<html><head><title>Orishkevich </title></head>");
        pw.println("<body>Hello, world :)</body></html>");
	}
}
