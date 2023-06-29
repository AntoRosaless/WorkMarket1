package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarse_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Grid</title>\n");
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
      out.write("                  <li><a href=\"registrarse.jsp\">Registrarse</a></li>\n");
      out.write("                  <li><a href=\"login.html\">Login</a></li>\n");
      out.write("                  <li><a href=\"publicaciones.html\">Publicaciones Laborales</a></li>\n");
      out.write("                  <li><a href=\"empresas.html\">Listado de Empresas</a></li>\n");
      out.write("                  <li><a href=\"profesionales.html\">Listados de Profesionales</a></li>\n");
      out.write("                  <li><a href=\"preguntas.html\">Preguntas Frecuentes</a></li>\n");
      out.write("                  <li><a href=\"quienessomos.html\">Quienes somos</a></li>\n");
      out.write("              </ul>\n");
      out.write("  </nav>\n");
      out.write("  <aside class=\"sidebar\">\n");
      out.write("      SIDEBAR\n");
      out.write("     <p>\n");
      out.write("      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed provident explicabo corporis ad consequatur possimus at recusandae, minus nostrum a laudantium doloremque voluptates, pariatur officiis deleniti molestiae. Quas, quae, minima!\n");
      out.write("      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Soluta ipsam consectetur consequatur, natus unde, deserunt sit voluptate a nesciunt vero in inventore quidem! Voluptate, saepe, veritatis laborum mollitia assumenda placeat.\n");
      out.write("    </p>\n");
      out.write("    <p>\n");
      out.write("      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Id, rem, aut. Mollitia quasi, rem vero delectus iusto optio dolorum alias assumenda commodi quod, cum incidunt dolore pariatur ad minus voluptatem.\n");
      out.write("      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Tempora laudantium accusamus unde provident possimus rem nemo officiis, quam perferendis, optio repudiandae nulla rerum doloremque culpa, dignissimos veniam aliquid aliquam ratione?\n");
      out.write("    </p>\n");
      out.write("    <p>\n");
      out.write("      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eos quos hic rerum, ipsum similique nostrum quis cum repellat eum veritatis magnam vero tempore sequi facere alias, laudantium esse. Nihil, impedit.\n");
      out.write("      Lorem ipsum dolor sit amet, consectetur adipisicing elit. Modi, at in! Velit placeat incidunt quidem perspiciatis officiis consequuntur! Tempora nihil nam nemo harum quia adipisci aut, omnis, magni totam quae! hola\n");
      out.write("    </p>\n");
      out.write("      \n");
      out.write("  </aside>\n");
      out.write("  <article class=\"main\">   \n");
      out.write("      <section class=\"form-register\">\n");
      out.write("          <span>hola </span>>\n");
      out.write("        ");
if (mensaje!=null){
      out.write("\n");
      out.write("        <mark> ");
      out.print(mensaje);
      out.write(" </mark>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <h4>Formulario Registro</h4>\n");
      out.write("        <h5>Para registrarse como profesional complete el siguiente formulario, recuerde que los campos con * son obligatorios.</h5>\n");
      out.write("        <form name=\"registroProfesional\" action=\"ControlRegistroProfesional\" method=\"POST\">\n");
      out.write("            <input class=\"controls\" type=\"text\" name=\"usuario\" id=\"usuario\" placeholder=\"Ingrese su Usuario *\">\n");
      out.write("            <input class=\"controls\" type=\"password\" name=\"contrasenia\" id=\"contrasenia\" placeholder=\"Ingrese su Contraseña *\" required=\"required\">\n");
      out.write("            <input class=\"controls\" type=\"text\" name=\"nombre\" id=\"nombre\" placeholder=\"Ingrese su Nombre *\" required=\"required\">\n");
      out.write("            <input class=\"controls\" type=\"text\" name=\"apellido\" id=\"apellido\" placeholder=\"Ingrese su Apellido *\" required=\"required\">\n");
      out.write("            <input class=\"controls\" type=\"text\" name=\"localidad\" id=\"localidad\" placeholder=\"Ingrese su Localidad *\" required=\"required\">\n");
      out.write("            <input class=\"controls\" type=\"text\" name=\"telefono\" id=\"telefono\" placeholder=\"Ingrese su Telefono *\" required=\"required\">\n");
      out.write("            <input class=\"controls\" type=\"email\" name=\"email\" id=\"email\" placeholder=\"Ingrese su Email *\" required=\"required\">\n");
      out.write("            \n");
      out.write("            <input class=\"controls\" type=\"text\" name=\"titulo\" id=\"titulo\" placeholder=\"Ingrese su Título *\" required=\"required\">\n");
      out.write("            <input class=\"botons\" type=\"reset\" value=\"Limpiar\" name=\"limpiar\" /><input class=\"botons\" type=\"submit\" value=\"Registrar\" name=\"registrar\" />\n");
      out.write("        </form>\n");
      out.write("      </section>    \n");
      out.write("  </article>\n");
      out.write("  <footer class=\"footer\">\n");
      out.write("      FOOTER\n");
      out.write("  </footer>\n");
      out.write("</body>\n");
      out.write("</html>");
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
