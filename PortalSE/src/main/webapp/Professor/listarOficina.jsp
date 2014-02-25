<%-- 
    Document   : cadastrarNaOficina
    Created on : 10/02/2014, 21:10:16
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
            <c:forEach items="${listaOficina}" var="obj">
                <th>Data</th>
                <th>Oficinas</th>
                <tr>
                    <td><p>${obj.dataDeEncerramentoInscricao}</p></td>
                    <td>
                        <p>Nome da Palestra : ${obj.nome} curso : ${obj.nome}</p> </br>
                        <p>Palestrante : ${obj.palestrante}  <a href="controlador?acao=incluir">Inscrever</a></p> </br>
                        <p>Local : ${obj.localDoCurso}</p> </br>
                        <p>Dia : ${obj.dataRealizacao}  Hora: ${obj.horario} </p> </br>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <jsp:include page="includes/foot.jsp" />
    </body>
</html>
