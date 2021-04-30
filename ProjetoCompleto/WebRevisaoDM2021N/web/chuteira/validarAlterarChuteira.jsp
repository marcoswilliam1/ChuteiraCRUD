<%-- 
    Document   : validarAlterarChuteira
    Created on : 29/04/2021, 22:30:42
    Author     : Qintess
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Chuteira"%>
<%@page import="revisaodm2021n.controles.ControleChuteira"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    String nome = request.getParameter("NOME");
    String quant = request.getParameter("QUANTIDADE");
    String valor = request.getParameter("VALOR");
     String cor = request.getParameter("COR");
    String marca = request.getParameter("MARCA");
    String estilo = request.getParameter("ESTILO");
    String tamanho = request.getParameter("TAMANHO");
    
        Chuteira uEntrada = new Chuteira(id,nome,quant,valor,cor,marca,estilo,tamanho);
    ControleChuteira chuCont = new ControleChuteira();
    Chuteira uSaida = chuCont.alterar(uEntrada);
%>

<!DOCTYPE html>
<html>
    
    <title>JSP Page</title>
    <body>
    <div class="container"/>
        <h1>ALTERAÇÃO CONCLUIDA</h1>
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
