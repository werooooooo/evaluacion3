   <%@ page language="java" 
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
         import="bean.PersonaBean"
   %> 
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
   "http://www.w3.org/TR/html4/loose.dtd">
   <html>
      <head>
         <meta http-equiv="Content-Type" 
            content="text/html; charset=windows-1256">
         <title>   Usaario Logeado  </title>
      </head>
	<body>
         <center>
            <% PersonaBean currentUser = (PersonaBean)session.getAttribute("currentSessionUser"); %>
			
            <h1> Hola <%= currentUser.getNombre() + " " + currentUser.getApellido() %> </h1>
         </center>
      </body>	
   </html>