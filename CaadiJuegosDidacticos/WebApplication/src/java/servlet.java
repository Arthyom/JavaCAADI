
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import conexion.linkDB;


/**
 *
 * @author walter
 */
@WebServlet(name = "servlet", urlPatterns = {"/servlet"})
public class servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("txtUSER");
        String password = request.getParameter("txtPASSWORD");
        
        PrintWriter out = response.getWriter();
        out.println("¡Hola "+usuario+", bienvenido!");
        out.println("Tu contraseña es: "+password);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("txtUSER");
        String password = request.getParameter("txtPASSWORD");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Pagina de bienvenida</title>");
        out.println("<link rel=\"stylesheet\" href=\"css/into.css\"> ");
        out.println("</head>");
        out.println("<body>");
        out.println("<div>");
        out.println("<img src=\"escudo.png\" alt=\"Escudo UG\" width=\"221\" height=\"188\" title=\"Escudo de la Universidad de Guanajuato\" >");
        out.println("<h2> ¡¡ HAZ ENTRADO AL SISTEMA !!</h2>");
        out.println("<h3> Hola "+usuario+", bienvenido.  </h3>");
        out.println("<h3> Tu contraseña es: "+password+"</h3>");
        out.println("<form method=\"post\" action=\"index.html\">");
        out.println("<h1><input type=\"submit\" value=\"Log out\" name=\"btnLOGOUT\" />");
        out.println("<h5> PRIMER CONSULTA DE UNA BD EN MYSQL UTILIZANDO EL CONECTOR PARA JAVA </h5>");
        out.println("<h5> RESULTADO DE LA CONSULTA: </h5>");
        conexion.linkDB connection = new conexion.linkDB();
        out.println("<p>"+connection.conect()+"</p>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}
