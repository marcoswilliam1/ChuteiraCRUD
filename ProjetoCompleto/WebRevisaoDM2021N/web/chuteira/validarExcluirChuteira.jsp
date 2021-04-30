<%-- 
    Document   : validarAlterarExcluir
    Created on : 29/04/2021, 22:31:20
    Author     : Qintess
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Chuteira"%>
<%@page import="revisaodm2021n.controles.ControleChuteira"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Chuteira uEntrada = new Chuteira(id);
    ControleChuteira chuCont = new ControleChuteira();
    Chuteira uSaida = chuCont.excluir(uEntrada);
%>

<!DOCTYPE html>
<html>
   
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>VALIDA EXCLUSÃO</h1>
         ID = <%=uSaida.getId()%> <br>
        NOME = <%=uSaida.getNome()%> <br>
        QUANTIDADE = <%=uSaida.getQuant()%> <br>
        VALOR = <%=uSaida.getValor()%> <br>
        COR = <%=uSaida.getCor()%> <br>
        MARCA = <%=uSaida.getMarca()%> <br>
        ESTILO = <%=uSaida.getEstilo()%> <br>
        TAMANHO = <%=uSaida.getTamanho()%> <br>
    </div>
    </body>
</html>
