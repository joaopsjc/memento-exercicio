<%-- 
    Document   : index.jsp
    Created on : 24/09/2019, 22:14:54
    Author     : ice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="FrontController?action=SalvarEstado" method="POST">
            <select name="alunoEstado">
                <option value="Ativo"</option>
                <option value="Formado"</option>
                <option value="Trancado"</option>    
             </select>    
        </form>
    </body>
</html>
