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
                <%if(!keterangan.equals("")){
                    %>
                    <div id="error-alert" class="flex p-4 mb-4 bg-red-100 rounded-lg dark:bg-red-200" role="alert">
  <svg class="flex-shrink-0 w-5 h-5 text-red-700 dark:text-red-800" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M18 10a8 8 0 11-16 0 8 8 0 0116 0zm-7-4a1 1 0 11-2 0 1 1 0 012 0zM9 9a1 1 0 000 2v3a1 1 0 001 1h1a1 1 0 100-2v-3a1 1 0 00-1-1H9z" clip-rule="evenodd"></path></svg>
  <div class="ml-3 text-sm font-medium text-red-700 dark:text-red-800">
  <%= keterangan%>
  </div>
  <button type="button" class="ml-auto -mx-1.5 -my-1.5 bg-red-100 text-red-500 rounded-lg focus:ring-2 focus:ring-red-400 p-1.5 hover:bg-red-200 inline-flex h-8 w-8 dark:bg-red-200 dark:text-red-600 dark:hover:bg-red-300" data-dismiss-target="#error-alert" aria-label="Close">
    <span class="sr-only">Close</span>
    <svg class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
  </button>
</div>
                <%
                    }
                %>
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
