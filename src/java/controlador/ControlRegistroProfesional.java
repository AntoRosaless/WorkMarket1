
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.GestionarEmpresa;
import modelo.GestionarProfesional;
import modelo.Profesional;

@WebServlet(name = "ControlRegistroProfesional", urlPatterns = {"/ControlRegistroProfesional"})
public class ControlRegistroProfesional extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");    
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");   
        String localidad = request.getParameter("localidad");    
        String tel = request.getParameter("telefono");
        String email = request.getParameter("email");   
        String titulo = request.getParameter("titulo");  
        Profesional p = new Profesional();
        GestionarProfesional gp = new GestionarProfesional();
        
        String mensaje = "";
        String color = "";
        if (gp.existeUsuarioEmail(usuario, email)){
            
            mensaje = "El Usuario o el Email ya se encuentran registrados.";
            color = "red";
        }else{
            p.setUsuario(usuario);
            p.setContrasenia(contrasenia);
            p.setNombre(nombre);
            p.setApellido(apellido);
            p.setLocalidad(localidad);
            p.setTel(tel);
            p.setEmail(email);
            p.setTitulo(titulo);
            gp.insertarProfesional(p);
            mensaje ="El registro se realizó exitosamente ahora puede loguearse.";
            color = "green";
        }
        request.setAttribute("mensaje", mensaje);
        request.setAttribute("color", color);
        try (PrintWriter out = response.getWriter()) {
            RequestDispatcher a;     
            a = request.getRequestDispatcher("registrarProfesional.jsp");
            a.forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
