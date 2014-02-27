<%-- 
    Document   : menu
    Created on : 10/02/2014, 22:12:22
    Author     : willian
--%>


<div class="navbar-wrapper">
    <div class="container">
        <div class="navbar navbar-inverse navbar-static-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="home.jsp">Portal SE</a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="home.jsp">Home</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Oficina <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Listar</a></li>
                                <li><a href="#">Criar</a></li>
                                <li class="divider"></li>
                                <li><a href="#">Chamada da Oficina</a></li>
                            </ul>
                        </li>                             
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="login.jsp">sair</a></li>  
                    </ul>
                </div>
            </div>
        </div>

    </div>
</div>