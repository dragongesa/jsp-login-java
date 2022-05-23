package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Materi session dan cookies</title>\n");
      out.write("        <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String userLogin = "";
            Cookie[] cookies = request.getCookies();
            String waktuLogin = "";
            java.util.Date saatIni = new java.util.Date();
            java.text.SimpleDateFormat waktu = new java.text.SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
            if (!session.isNew()) {
                try {
                    userLogin = session.getAttribute("userLogin").toString();
                    waktuLogin = session.getAttribute("waktuLogin").toString();
                } catch (Exception ex) {

                }
            }
            if ((cookies != null) && (cookies.length > 0)) {
                for (int i = 0; i < cookies.length; i++) {
        
      out.write("\n");
      out.write("<!--        Data cookie ke-");
      out.print(i);
      out.write(" nama: ");
      out.print(cookies[i].getName());
      out.write("<br>    \n");
      out.write("        Data cookie ke-");
      out.print(i);
      out.write(" data: ");
      out.print(cookies[i].getValue());
      out.write("<br>    -->\n");
      out.write("        ");

                }
            }
            if (!userLogin.equals("")) {
        
      out.write("\n");
      out.write("        <h1>Dashboard</h1>\n");
      out.write("        <p>Selamat datang, <strong>");
      out.print(userLogin);
      out.write("</strong></p>\n");
      out.write("        <p>Anda login terakhir kali pada <strong>");
      out.print(waktuLogin);
      out.write("</strong></p>\n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"w-full max-w-xs m-auto h-screen flex\">\n");
      out.write("            <div class=\"m-auto\">\n");
      out.write("            <form class=\"bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4\" action=\"validasi.jsp\" method=\"post\">\n");
      out.write("                <h1 class=\"text-3xl font-bold text-clifford mb-6\">Login page</h1>\n");
      out.write("\n");
      out.write("                <div class=\"mb-4\">\n");
      out.write("                    <label class=\"block text-gray-700 text-sm font-bold mb-2\" for=\"username\">\n");
      out.write("                        Username\n");
      out.write("                    </label>\n");
      out.write("                    <input class=\"shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline\" id=\"username\" name=\"username\" type=\"text\" placeholder=\"Username\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-6\">\n");
      out.write("                    <label class=\"block text-gray-700 text-sm font-bold mb-2\" for=\"password\">\n");
      out.write("                        Password\n");
      out.write("                    </label>\n");
      out.write("                    <input class=\"shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 mb-3 leading-tight focus:outline-none focus:shadow-outline\" id=\"password\" name=\"password\" type=\"password\" placeholder=\"******************\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"flex items-center justify-between\">\n");
      out.write("                    <button class=\"bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline\" type=\"submit\">\n");
      out.write("                        Sign In\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <p class=\"text-center text-gray-500 text-xs\">\n");
      out.write("                &copy;2022 Bojew Be90 Corp.\n");
      out.write("            </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    </body>\n");
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
