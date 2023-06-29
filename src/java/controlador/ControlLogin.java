
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

@WebServlet(name = "ControlLogin", urlPatterns = {"/ControlLogin"})
public class ControlLogin extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");    
        String tipo = request.getParameter("tipo");
        String mensaje = "";
        String color = "";
        int i = 0;
        Empresa e = new Empresa();
        GestionarEmpresa ge = new GestionarEmpresa();
        Profesional p = new Profesional();
        GestionarProfesional gp = new GestionarProfesional();
        if(tipo.equals("Empresa")){
            e = ge.buscarEmpresa(usuario, contrasenia);
            if (e.getUsuario()==null){
                mensaje = "El Usuario o la Contraseña son incorrectos";
                color = "red";
                request.setAttribute("mensaje", mensaje);
                request.setAttribute("color", color);
            }else{                
                request.setAttribute("razonSocial", e.getRazonSocial());
                i = 1;
            }
        }else if(tipo.equals("Profesional")){
            p = gp.buscarProfesional(usuario, contrasenia);
             if (p.getUsuario()==null){
                mensaje = "El Usuario o la Contraseña son incorrectos";
                color = "red";
                request.setAttribute("mensaje", mensaje);
                request.setAttribute("color", color);
            }else{
                request.setAttribute("nombre", p.getNombre());
                request.setAttribute("apellido", p.getApellido());
                i = 2;
            }
        }else{
            mensaje = "Debe seleccionar Empresa o Profesional";
            color = "red";
            request.setAttribute("mensaje", mensaje);
            request.setAttribute("color", color);
        }
        try (PrintWriter out = response.getWriter()) {
            RequestDispatcher a;    
            if (i==0){
                a = request.getRequestDispatcher("login.jsp");
                a.forward(request, response);
            }else if(i==1){
                a = request.getRequestDispatcher("panelControlE.jsp");
                a.forward(request, response);
            }else{
                a = request.getRequestDispatcher("panelControlP.jsp");
                a.forward(request, response);
            }
            
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
