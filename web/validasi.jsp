<%-- 
    Document   : validasi
    Created on : May 23, 2022, 10:35:56 PM
    Author     : Kei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Authenticating...</title>
    </head>
    <body>
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            Cookie cookie;
            if ((username != null) && username.equalsIgnoreCase("ADMIN")) {
                java.text.SimpleDateFormat waktu = new java.text.SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
                java.util.Date waktuLogin = new java.util.Date();

                session.setAttribute("userLogin", "Administrator");
                session.setAttribute("waktuLogin", waktu.format(waktuLogin));
                session.setMaxInactiveInterval(20);

                cookie = new Cookie("nama", "Administrator");
                cookie.setMaxAge(15);
                response.addCookie(cookie);
                
                cookie = new Cookie("waktuLogin", waktu.format(waktuLogin));
                cookie.setMaxAge(15);
                response.addCookie(cookie);
            } else {
                cookie = new Cookie("keterangan", "Username atau password salah cuy");
                cookie.setMaxAge(15);
                response.addCookie(cookie);
            }
            response.sendRedirect("index.jsp");
        %>
    </body>
</html>
