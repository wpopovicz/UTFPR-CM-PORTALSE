<%-- 
    Document   : historico
    Created on : 10/02/2014, 21:16:13
    Author     : willian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="includes/head.jsp" />
    </head>
    <body>
        <jsp:include page="includes/menu.jsp" />
        <table class="table table-bordered">
            <c:forEach items="${listaOficinaJaFeita}" var="obj">
                <th>Data</th>
                <th>Oficinas</th>
                <tr>
                    <td><p>${obj.dataRealizacao}</p></td>
                    <td>
                        <p>Nome da Palestra : ${obj.nome} curso : ${obj.nome}</p> </br>
                        <p>Palestrante : ${obj.palestrante}</p> </br>
                        <p>Local : ${obj.localDoCurso}</p> </br>
                        <p>Hora: ${obj.horario} </p> </br>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <jsp:include page="includes/foot.jsp" />
    </body>
</html>
