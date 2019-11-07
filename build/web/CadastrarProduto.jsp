<%-- 
    Document   : CadastrarProduto
    Created on : 01/10/2019, 21:22:16
    Author     : alunocmc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
         <title>Produto</title>
     </head>
    <body>
        <div class="container  container-alt" style="margin-top: 2%;">
                 <h1>Novo Produto</h1>
            <form action="cadastrarProduto" method="get">
               
          <div class="form-row align-items-center">
                <div class="input-group mb-3 col-md-4">
                    <div class="input-group-prepend">
                        <span class="input-group-text">Descrição:</span>
                    </div>
                     <input type="text" name="descricao" class="form-control">
                </div>
                
                <div class="input-group mb-3 col-md-2 ">
                    <div class="input-group-prepend">
                        <span class="input-group-text">R$:</span>
                    </div>
                    <input type="text" name="preco" class="form-control">
                </div>
                
                <div   class="input-group mb-3 col-md-12">
                     <input type="file" name="imagem"  class="form-control-file ">
                </div>
                
                 <div class="col-sm-6 my-3">
                         <input type="submit" value="Cadastrar" name="btnCadastrar" class="btn btn-secondary btn-lg btn-block" />
                </div>    
            </form>
        </div>
    </body>
</html>