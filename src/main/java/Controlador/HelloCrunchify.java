package Controlador;
 
import BD.Obra_de_ArteDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import javax.servlet.RequestDispatcher;
 
/**
 * @author Crunchify.com
 */
 
public class HelloCrunchify extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
        
        String nombre = request.getParameter("nombre");
        String des= request.getParameter("descripcion");
        String estilo =request.getParameter("estilo");
        double valor =Integer.parseInt(request.getParameter("valor"));
        String artista = request.getParameter("user");
        
        
        }
}
