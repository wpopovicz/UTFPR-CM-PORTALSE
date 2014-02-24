<%-- 
    Document   : TesteBanco
    Created on : 21/02/2014, 22:29:05
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form role="form" action="ServletTest" method="POST">
            <div class="form-group">
                <label for="exampleInputEmail1">Email address</label>
                <input type="email" class="form-control" name="email" id="exampleInputEmail1" placeholder="Enter email">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input type="text" class="form-control" name="name" id="exampleInputPassword1" placeholder="Password">
            </div>            
            <button type="submit" class="btn btn-default">Submit</button>
        </form>

    </body>
</html>
