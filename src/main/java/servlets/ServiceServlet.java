package servlets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import resources.ResourceServerI;
import resources.TestResource;
import sax.ReadXMLFileSAX;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

//@WebServlet(name = "ServiceServlet", urlPatterns = {"/resources"})
public class ServiceServlet extends HttpServlet {
    static final Logger logger = LogManager.getLogger(ServiceServlet.class.getName());
    public static final String PAGE_URL = "/resources";
//    getResource
    private final ResourceServerI resourceServer;

    public ServiceServlet(ResourceServerI resourceServer) {
        this.resourceServer = resourceServer;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Path path = Paths.get(request.getParameter("path"));
//        resourceServer.

        TestResource resource = (TestResource) ReadXMLFileSAX.readXML(request.getParameter("path"));

        resourceServer.setTestResource(resource);

        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
