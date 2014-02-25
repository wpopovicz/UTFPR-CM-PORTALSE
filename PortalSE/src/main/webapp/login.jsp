
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="assets/ico/favicon.ico">

        <title>Home</title>

        <!-- Bootstrap core CSS -->
        <link href="dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="jumbotron.css" rel="stylesheet">
        

    </head>

    <body background="img.png">

        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Portal Secretaria da Educação</a>
                </div>
                <div class="navbar-collapse collapse">
                    <form class="navbar-form navbar-right" role="form">
                        <div class="form-group">
                            <input type="text" placeholder="CPF" name="cpf" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="password" placeholder="senha" name="senha" class="form-control">
                        </div>
                        <button type="submit" class="btn btn-success">Entrar</button>
                    </form>
                </div><!--/.navbar-collapse -->
            </div>
        </div>        
        <div class="container theme-showcase" role="main" >

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron" >
                <h1>Bem Vindo!</h1>
                <p>Está é a pagina do portal da Secretaria da Educação - SECED</p>
            </div>

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <form class="form-horizontal col-lg-offset-7" role="form" action="Login" method="POST">
                <div class="form-group">
                    <label for="inputName" class="col-sm-2 control-label">Nome</label>
                    <div class="col-xs-6">
                        <input type="text" class="form-control" name="nome" id="inputName" placeholder="Nome">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputCpf" class="col-xs-2 control-label">CPF</label>
                    <div class="col-xs-6">
                        <input type="text" class="form-control" name="cpf" id="inputEmail3" placeholder="CPF">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputEmail" class="col-sm-2 control-label">Email</label>
                    <div class="col-xs-6">
                        <input type="email" class="form-control" name="email" id="inputEmail3" placeholder="Email">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword" class="col-sm-2 control-label">Senha</label>
                    <div class="col-xs-6">
                        <input type="password" class="form-control" name="senha" id="inputPassword" placeholder="Senha">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword" class="col-sm-2 control-label">Senha</label>
                    <div class="col-xs-6">
                        <input type="password" class="form-control " name="senha2" id="inputPassword2" placeholder="Insira Sua Senha Novamente">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">

                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Cadastrar</button>
                    </div>
                </div>
            </form>


          

                <footer>
                    <p>&copy; Company 2014</p>
                </footer>
            </div> <!-- /container -->


            <!-- Bootstrap core JavaScript
            ================================================== -->
            <!-- Placed at the end of the document so the pages load faster -->
            <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
            <script src="dist/js/bootstrap.min.js"></script>
    </body>
</html>
