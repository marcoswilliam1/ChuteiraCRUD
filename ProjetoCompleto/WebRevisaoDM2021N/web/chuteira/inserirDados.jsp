<%-- 
    Document   : inserirDados
    Created on : 29/04/2021, 22:25:36
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
          <div class="container"/>
        <h1>INSERI</h1>
        <form name="validarInserirChuteira" action="validarInserirChuteira.jsp" method="post">
            NOME <input type="text" name="NOME" value=""> <br>
            QUANTIDADE <input type="text" name="QUANTIDADE" value=""> <br>
            VALOR <input type="text" name="VALOR" value=""> <br>
            COR <input type="text" name="COR" value=""> <br>
            MARCA <input type="text" name="MARCA" value=""> <br>
            ESTILO <input type="text" name="ESTILO" value=""> <br>
            TAMANHO <input type="text" name="TAMANHO" value=""> <br>
             
            <input type="submit" name="INSERIR" value="INSERIR"> <br>
        </form>
    </div>
    </body>
</html>
