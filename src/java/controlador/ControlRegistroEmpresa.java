
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Empresa;
import modelo.GestionarEmpresa;
import modelo.GestionarProfesional;
import modelo.Profesional;


@WebServlet(name = "ControlRegistroEmpresa", urlPatterns = {"/ControlRegistroEmpresa"})
public class ControlRegistroEmpresa extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");    
        String razonSocial = request.getParameter("razonSocial");
        int telefono = Integer.parseInt(request.getParameter("telefono"));   
        String email = request.getParameter("email");    
        String direccion = request.getParameter("direccion");
        String localidad = request.getParameter("localidad");   
        String provincia = request.getParameter("provincia");
        String rubro = request.getParameter("rubro");
        Empresa p = new Empresa();
        GestionarEmpresa gp = new GestionarEmpresa();
        String mensaje = "";
        String color = "";
        if (gp.existeUsuarioEmail(usuario, email)){
            mensaje = "El Usuario o el Email ya se encuentran registrados.";
            color = "red";
        }else{
            p.setUsuario(usuario);
            p.setContrasenia(contrasenia);
            p.setRazonSocial(razonSocial);
            p.setTel(telefono);
            p.setEmail(email);
            p.setDireccion(direccion);
            p.setLocalidad(localidad);
            p.setProvincia(provincia);
            p.setRubro(rubro);         
            gp.insertarEmpresa(p);
            mensaje ="El registro se realizó exitosamente ahora puede loguearse.";
            color = "green";
        }
        request.setAttribute("mensaje", mensaje);
        request.setAttribute("color", color);
        try (PrintWriter out = response.getWriter()) {
            RequestDispatcher a;     
            a = request.getRequestDispatcher("registrarEmpresa.jsp");
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
