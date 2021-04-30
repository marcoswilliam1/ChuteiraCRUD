<%-- 
    Document   : validarListaChuteira
    Created on : 29/04/2021, 22:32:05
    Author     : Qintess
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="revisaodm2021n.dados.Chuteira"%>
<%@page import="revisaodm2021n.controles.ControleChuteira"%>

<%
    String nome = request.getParameter("NOME");
    Chuteira uEntrada = new Chuteira(nome);
    ControleChuteira conChu = new ControleChuteira();
    List<Chuteira> uSaida = conChu.listar(uEntrada);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div class="container"/>
        <h1>LISTA</h1> <br>
            <TABLE>
                <TR>
                    <TD>ID</TD>
                    <TD>NOME</TD>
                    <TD>QUANTIDADE</TD>
                    <TD>VALOR</TD>
                    <TD>COR</TD>
                    <TD>MARCA</TD>
                    <TD>ESTILO</TD>
                    <TD>TAMANHO</TD>
                    <TD>ALTERAR</TD>
                    <TD>EXCLUIR</TD>
                       
                    
                </TR>
             <% if(!(uSaida.isEmpty())) { %>
                <% for (Chuteira chu :uSaida){ %>
                <TR>
                    <TD><%=chu.getId()%></TD>
                    <TD><%=chu.getNome()%></TD>
                    <TD><%=chu.getQuant()%></TD>
                    <TD><%=chu.getValor()%></TD>
                    <TD><%=chu.getCor()%></TD>
                    <TD><%=chu.getMarca()%></TD>
                    <TD><%=chu.getEstilo()%></TD>
                    <TD><%=chu.getTamanho()%></TD>
                    <TD><a href="../chuteira/alterarDados.jsp?ID=<%=chu.getId()%>">Altera</a></TD>
                    <TD><a href="../chuteira/validarExcluirChuteira.jsp?ID=<%=chu.getId()%>">Excluir</a></TD>
                </TR>
                <% } %>
            <% } else { %>
                <TR>
                    <TD>LISTA VAZIA</TD>
                </TR>
           <% } %>
            </table>
    </div>
    </body>
</html>
