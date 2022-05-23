<%-- 
    Document   : index
    Created on : May 23, 2022, 9:47:26 PM
    Author     : Kei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Materi session dan cookies</title>
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body>
        <%
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
        %>
<!--        Data cookie ke-<%=i%> nama: <%=cookies[i].getName()%><br>    
        Data cookie ke-<%=i%> data: <%=cookies[i].getValue()%><br>    -->
        <%
                }
            }
            if (!userLogin.equals("")) {
        %>
        <div class="w-full max-w-xs m-auto flex h-screen">
            <div class="m-auto">
                <div class=" bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4">
        <h1>Dashboard</h1>
        <p>Selamat datang, <strong><%=userLogin%></strong></p>
        <p>Anda login terakhir kali pada <strong><%=waktuLogin%></strong></p>        
                    
                </div>
            </div>
        </div>
        
        <%
        } else {
        %>

        <div class="w-full max-w-xs m-auto h-screen flex">
            <div class="m-auto">
            <form class="bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4" action="validasi.jsp" method="post">
                <h1 class="text-3xl font-bold text-clifford mb-6">Login page</h1>

                <div class="mb-4">
                    <label class="block text-gray-700 text-sm font-bold mb-2" for="username">
                        Username
                    </label>
                    <input class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline" id="username" name="username" type="text" placeholder="Username">
                </div>
                <div class="mb-6">
                    <label class="block text-gray-700 text-sm font-bold mb-2" for="password">
                        Password
                    </label>
                    <input class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 mb-3 leading-tight focus:outline-none focus:shadow-outline" id="password" name="password" type="password" placeholder="******************">
                </div>
                <div class="flex items-center justify-between">
                    <button class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline" type="submit">
                        Sign In
                    </button>

                </div>
            </form>
            <p class="text-center text-gray-500 text-xs">
                &copy;2022 Bojew Be90 Corp.
            </p>
            </div>
        </div>
        <%
            }
        %>
    </body>
</html>
