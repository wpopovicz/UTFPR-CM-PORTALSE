<%-- 
    Document   : testcarrosel
    Created on : 01/03/2014, 00:26:49
    Author     : willian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="../../assets/ico/favicon.ico">
        <script type="text/javascript" src="../dist/js/imsky/holder.js"></script>
        <title>Carousel Template for Bootstrap</title>

        <!-- Bootstrap core CSS -->
        <link href="../dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- Just for debugging purposes. Don't actually copy this line! -->
        <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Custom styles for this template -->
        <link href="carousel.css" rel="stylesheet">
    </head>
    <!-- NAVBAR
    ================================================== -->
    <body>
        <jsp:include page="includes/menu.jsp" />
        <!-- Carousel
        ================================================== -->
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="item active">
                    <img data-src="holder.js/1400x300/auto/#777:#7a7a7a/text:First slide" alt="First slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <c:forEach items="${Oficinaencerrando1}" var="obj">
                                <h3>Nome da Palestra : ${obj.nome} curso : ${obj.nome}</h3> </br>
                                <p>Palestrante : ${obj.palestrante} 
                                <p>Local : ${obj.localDoCurso}</p> </br>
                                <p>Data: ${obj.dataRealizacao}  Hora: ${obj.horario} </p> </br>
                                <p><a class="btn btn-lg btn-primary" href="oficinaCadastrada.jsp" role="button">Garanta sua Inscrição</a></p>
                            </c:forEach>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img data-src="holder.js/1400x300/auto/#666:#6a6a6a/text:Second slide" alt="Second slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <c:forEach items="${Oficinaencerrando2}" var="obj">
                                <h3>Nome da Palestra : ${obj.nome} curso : ${obj.nome}</h3> </br>
                                <p>Palestrante : ${obj.palestrante} 
                                <p>Local : ${obj.localDoCurso}</p> </br>
                                <p>Data: ${obj.dataRealizacao}  Hora: ${obj.horario} </p> </br>
                                <p><a class="btn btn-lg btn-primary" href="oficinasCadastrada.jsp" role="button">Garanta sua Inscrição</a></p>
                            </c:forEach>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img data-src="holder.js/1400x300/auto/#555:#5a5a5a/text:Third slide" alt="Third slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <c:forEach items="${Oficinaencerrando3}" var="obj">
                                <h3>Nome da Palestra : ${obj.nome} curso : ${obj.nome}</h3> </br>
                                <p>Palestrante : ${obj.palestrante} 
                                <p>Local : ${obj.localDoCurso}</p> </br>
                                <p>Data: ${obj.dataRealizacao}  Hora: ${obj.horario} </p> </br>
                                <p><a class="btn btn-lg btn-primary" href="oficinasCadastrada.jsp" role="button">Garanta sua Inscrição</a></p>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
        </div><!-- /.carousel -->



        <!-- Marketing messaging and featurettes
        ================================================== -->
        <!-- Wrap the rest of the page in another container to center all the content. -->

        <div class="container marketing">
            <!-- Three columns of text below the carousel -->
            <div class="row">
                <div class="col-lg-4">
                    <img class="img-circle" data-src="holder.js/140x140" alt="Generic placeholder image">
                    <h2>SECED</h2>
                    <p>Av. Comendador Noberto Marcondes</p>
                    <p>Nº1643 - Campo Mourão - PR</p>
                </div><!-- /.col-lg-4 -->
                <div class="col-lg-4">
                    <img class="img-circle" data-src="holder.js/140x140" alt="Generic placeholder image">
                    <h2>IMAPE</h2>
                    <p>Rua das Samambaias</p>
                    <p>Nº115 - Campo Mourão - PR</p>
                </div><!-- /.col-lg-4 -->
                <div class="col-lg-4">
                    <img class="img-circle" data-src="holder.js/140x140" alt="Generic placeholder image">
                    <h2>SESC</h2>
                    <p>Av. João Bento</p>
                    <p>Nº2020 - Campo Mourão - PR</p>
                </div><!-- /.col-lg-4 -->
            </div><!-- /.row -->
            <div id="footer">
                <div class="container">
                    <p class="text-muted">Layout com bootstrap e jsp. Editado por <strong><a href="https://www.facebook.com/willian.popovicz">Willian L. Popovicz</a> & <a href="https://www.facebook.com/CarlosHSanches?fref=ts">Carlos H.S.D. Barboza</a></strong>.</p>
                </div>
            </div>

            <!-- Bootstrap core JavaScript
            ================================================== -->
            <!-- Placed at the end of the document so the pages load faster -->
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
            <script src="../dist/js/bootstrap.min.js"></script>
            <script src="../assets/js/docs.min.js"></script>
            <script src="../../js/holder"></script>
    </body>
</html>

