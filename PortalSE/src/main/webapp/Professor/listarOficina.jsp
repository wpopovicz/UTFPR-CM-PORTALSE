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
            <c:forEach items="${lista}" var="obj">
                <tr>
                    <td>${obj.dataDeEncerramentoInscricao}</td>
                </tr>
            </c:forEach>
        </table>
        <jsp:include page="includes/foot.jsp" />
    </body>
</html>
