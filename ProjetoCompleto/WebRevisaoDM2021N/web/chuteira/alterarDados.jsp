<%-- 
    Document   : inserirDados
    Created on : 29/04/2021, 21:41:54
    Author     : Qintess
--%>
<%@page import="revisaodm2021n.controles.ControleChuteira"%>
<%@page import="revisaodm2021n.dados.Chuteira"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Chuteira ChuteiraEntrada = new Chuteira(id);
    ControleChuteira controleChuteira = new ControleChuteira();
   Chuteira chuteiraSaida = controleChuteira.buscar(ChuteiraEntrada);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ALTERA</h1>
        <form name="validarAlterarChuteira" action="validarAlterarChuteira.jsp" method="post">
            ID <%=chuteiraSaida.getId()%> <br>
            NOME <input type="text" name="NOME" value="<%=chuteiraSaida.getNome()%>"> <br>
            QUANTIDADE <input type="text" name="DATA" value="<%=chuteiraSaida.getQuant()%>"> <br>
            VALOR <input type="text" name="CPF" value="<%=chuteiraSaida.getValor()%>"> <br>
            COR <input type="text" name="TELEFONE" value="<%=chuteiraSaida.getCor()%>"> <br>
            MARCA <input type="text" name="GENERO" value="<%=chuteiraSaida.getMarca()%>"> <br>
            ESTILO <input type="text" name="ENDERECO" value="<%=chuteiraSaida.getEstilo()%>"> <br>
            TAMANHO <input type="text" name="ENDERECO" value="<%=chuteiraSaida.getTamanho()%>"> <br>
            
            <input type="hidden" name="ID" value="<%=chuteiraSaida.getId()%>"> <br>
            <input type="submit" name="ALTERAR" value="ALTERAR"> <br>
        </form>
    </div>
    </body>
</html>
