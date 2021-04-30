<%-- 
    Document   : opcao
    Created on : 30/04/2021, 14:49:22
    Author     : Qintess
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="INSERIR" action="../chuteira/inserirDados.jsp" method="post">
            <input type="submit" name="INSERIR" value="INSERIR">
        </form>
        <form name="ALTERAR" action="../chuteira/alterarDados.jsp" method="post">
            <input type="submit" name="ALTERAR" value="ALTERAR">
        </form>
        <form name="LISTA" action="../chuteira/listaDados.jsp" method="post">
            <input type="submit" name="LISTA" value="LISTA">
        </form>
        <form name="BUSCAR" action="../chuteira/buscarDados.jsp" method="post">
            <input type="submit" name="BUSCAR" value="BUSCAR">
        </form>
        
    </body>
</html>
