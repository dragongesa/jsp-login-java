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
            String keterangan = "";
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
                if(cookies[i].getName().equalsIgnoreCase("keterangan")){
                keterangan = cookies[i].getValue();
            }
        
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
      out.write("\n");
      out.write("        ");

                }
            }
            if (!userLogin.equals("")) {
        
      out.write("\n");
      out.write("        <div class=\"w-full max-w-xs m-auto flex h-screen\">\n");
      out.write("            <div class=\"m-auto\">\n");
      out.write("                <div class=\" bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4\">\n");
      out.write("        <h1>Dashboard</h1>\n");
      out.write("        <p>Selamat datang, <strong>");
      out.print(userLogin);
      out.write("</strong></p>\n");
      out.write("        <p>Anda login terakhir kali pada <strong>");
      out.print(waktuLogin);
      out.write("</strong></p>        \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"w-full max-w-xs m-auto h-screen flex\">\n");
      out.write("            <div class=\"m-auto\">\n");
      out.write("            <form class=\"bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4\" action=\"validasi.jsp\" method=\"post\">\n");
      out.write("                <h1 class=\"text-3xl font-bold text-clifford mb-6\">Login page</h1>\n");
      out.write("                ");
if(!keterangan.equals("")){
                    
      out.write("\n");
      out.write("                    <div id=\"error-alert\" class=\"flex p-4 mb-4 bg-red-100 rounded-lg dark:bg-red-200\" role=\"alert\">\n");
      out.write("  <svg class=\"flex-shrink-0 w-5 h-5 text-red-700 dark:text-red-800\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M18 10a8 8 0 11-16 0 8 8 0 0116 0zm-7-4a1 1 0 11-2 0 1 1 0 012 0zM9 9a1 1 0 000 2v3a1 1 0 001 1h1a1 1 0 100-2v-3a1 1 0 00-1-1H9z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("  <div class=\"ml-3 text-sm font-medium text-red-700 dark:text-red-800\">\n");
      out.write("  ");
      out.print( keterangan);
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <button type=\"button\" class=\"ml-auto -mx-1.5 -my-1.5 bg-red-100 text-red-500 rounded-lg focus:ring-2 focus:ring-red-400 p-1.5 hover:bg-red-200 inline-flex h-8 w-8 dark:bg-red-200 dark:text-red-600 dark:hover:bg-red-300\" data-dismiss-target=\"#error-alert\" aria-label=\"Close\">\n");
      out.write("    <span class=\"sr-only\">Close</span>\n");
      out.write("    <svg class=\"w-5 h-5\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z\" clip-rule=\"evenodd\"></path></svg>\n");
      out.write("  </button>\n");
      out.write("</div>\n");
      out.write("                ");

                    }
                
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
