<%-- 
    Document   : newjspvalidarBuscarChuteira
    Created on : 29/04/2021, 22:30:54
    Author     : Qintess
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Chuteira"%>
<%@page import="revisaodm2021n.controles.ControleChuteira"%>

<%
    int id = Integer.parseInt(request.getParameter("ID"));
    Chuteira uEntrada = new Chuteira(id);
    ControleChuteira contChu = new ControleChuteira();
    Chuteira uSaida = contChu.buscar(uEntrada);
%>

<!DOCTYPE html>
<html>
   
    <title>JSP Page</title>
    <body>
    <div class="container"/>
    <h1>VALIDA BUSCA</h1>
        <% if(uSaida != null) { %>
        Chuteira = <%=uSaida.getId()%> | <%=uSaida.getNome()%> | <%=uSaida.getQuant()%> | <%=uSaida.getValor()%> | <%=uSaida.getCor()%> | <%=uSaida.getMarca()%>| <%=uSaida.getEstilo()%>| <%=uSaida.getTamanho()%><br>   
        <% } else { %>
           busca Chuteira Inválida
        <% } %>
    </div>
    </body>
</html>
