package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


String mensaje = (String) request.getAttribute("mensaje");
String color = (String) request.getAttribute("color");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Work Market</title>\n");
      out.write("  \n");
      out.write("  <link href=\"css/styles_2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  <link href=\"css/stylesform.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body class=\"grid-container\">\n");
      out.write("  <header class=\"header\">\n");
      out.write("       <a href=\"index.html\">\n");
      out.write("                <img width=\"170\" src=\"ima/logo.jpg\" alt=\"Logo Empresa\"/>\n");
      out.write("            </a>\n");
      out.write("  </header>\n");
      out.write("  <nav class=\"navbar\">\n");
      out.write("             <ul>\n");
      out.write("                  <li><a href=\"registrarProfesional.jsp\">Registrar Profesional</a></li>\n");
      out.write("                  <li><a href=\"registrarEmpresa.jsp\">Registrar Empresa</a></li>\n");
      out.write("                  <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                  <li><a href=\"publicaciones.html\">Publicaciones Laborales</a></li>\n");
      out.write("                  <li><a href=\"empresas.html\">Listado de Empresas</a></li>\n");
      out.write("                  <li><a href=\"profesionales.html\">Listados de Profesionales</a></li>\n");
      out.write("                  <li><a href=\"preguntas.html\">Preguntas Frecuentes</a></li>\n");
      out.write("                  <li><a href=\"quienessomos.html\">Quienes Somos</a></li>\n");
      out.write("                  <li><a href=\"mapa.html\">Mapa del Sitio</a></li>\n");
      out.write("              </ul>\n");
      out.write("  </nav>\n");
      out.write("  <aside class=\"sidebar\">\n");
      out.write("     <p>\n");
      out.write("      <h3>Work Market</h3>\n");
      out.write("      </p>\n");
      out.write("     <p>\n");
      out.write("      --Espacio Publicitario--\n");
      out.write("    </p>\n");
      out.write("   <p>\n");
      out.write("      --En construcción--\n");
      out.write("    </p>\n");
      out.write("    <p>\n");
      out.write("       \"Sin dudas no hay progreso\"</br> Charles Darwin.\n");
      out.write("       </p>\n");
      out.write("      \n");
      out.write("  </aside>\n");
      out.write("  <article class=\"main\">   \n");
      out.write("      <section class=\"form-register\">\n");
      out.write("        ");
if (mensaje!=null){
      out.write("\n");
      out.write("        <center><h5 style=\"background: ");
      out.print(color);
      out.write('"');
      out.write('>');
      out.print(mensaje);
      out.write(" </h5></center>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <h4>Inicio de sesión</h4>\n");
      out.write("        <h5>Para iniciar complete el siguiente formulario, recuerde que debe estar previamente registrado\n");
      out.write("            y los campos con * son obligatorios.</h5>\n");
      out.write("        <form name=\"registroProfesional\" action=\"ControlLogin\" method=\"POST\">\n");
      out.write("            <input class=\"controls\" type=\"text\" name=\"usuario\" id=\"usuario\" placeholder=\"Ingrese su Usuario *\" required=\"required\">\n");
      out.write("            <input class=\"controls\" type=\"password\" name=\"contrasenia\" id=\"contrasenia\" placeholder=\"Ingrese su Contraseña *\" required=\"required\">\n");
      out.write("            <select class=\"controls\" name=\"tipo\" id=\"tipo\" required=\"required\">\n");
      out.write("                <option>Seleccione Empresa o Profesional *</option>\n");
      out.write("                <option>Empresa</option>\n");
      out.write("                <option>Profesional</option>\n");
      out.write("            </select>\n");
      out.write("            <input class=\"botons\" type=\"reset\" value=\"Limpiar\" name=\"limpiar\" /><input class=\"botons\" type=\"submit\" value=\"Iniciar Sesion\" name=\"iniciarSesion\" />\n");
      out.write("        </form>\n");
      out.write("      </section>    \n");
      out.write("  </article>\n");
      out.write("  <footer class=\"footer\">\n");
      out.write("      <div class=\"contenedorf\">\n");
      out.write("      <div class=\"f1\">\n");
      out.write("          Seguinos en todas las Redes Sociales\n");
      out.write("      </div>\n");
      out.write("      <div class=\"f2\">\n");
      out.write("          <a href=\"\"><img src=\"ima/icono1.jpg\" alt=\"\"/></a>\n");
      out.write("          <a href=\"\"><img src=\"ima/icono2.jpg\" alt=\"\"/></a>\n");
      out.write("          <a href=\"\"><img src=\"ima/icono3.jpg\" alt=\"\"/></a>\n");
      out.write("          <a href=\"\"><img src=\"ima/icono4.jpg\" alt=\"\"/></a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"f3\">\n");
      out.write("          Somos alumnos de la Escuela PRo-A Laboulaye, todos los derechos reservados.\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("  </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
