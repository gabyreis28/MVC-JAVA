<%-- 
    Document   : EditarProduto
    Created on : 16/10/2019, 21:57:30
    Author     : gabri
--%>

<%@page import="Model.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="objProduto"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Produto</title>
    </head>
    
  <body>
        <div class="container container-alt" style="margin-top: 2%;">
                  <h1>Editar Produto</h1>

                  <form action="EditarProduto" method="get">
                      <div class="form-row align-items-center">
                          
                           <div class="input-group mb-3  col-md-1" >
                                <div class="input-group-prepend"> 
                                    <span class="input-group-text">ID:</span>
                                </div>
                                    <input type="text"  name="id" value="${objProduto.id}" class="form-control" required />
                            </div>
                            
                            <div class="form-group mb-3  col-md-10">
                                     <input  type="file" class="form-control-file" name="imagem" required />
                                     
                            </div>

                            <div class="input-group mb-3  col-md-4">
                                <div class="input-group-prepend">
                                     <span class="input-group-text">Descrição:</span>
                                </div>
                                      <input type="text" name="descricao" value="${objProduto.descricao}" class="form-control" required /><br>
                            </div>
                            
                            <div class="input-group mb-3  col-md-3">
                                <div class="input-group-prepend">
                                     <span class="input-group-text">R$:</span>
                                </div>
                                      <input type="text" name="preco" value="${objProduto.preco}" class="form-control" required />
                            </div> 
       
                            <div class="col-sm-7 my-3">
                                    <input type="submit" value="Alterar" name="btnAlterar" class="btn btn-secondary btn-lg btn-block" />
                            </div>
                        </div>
                  </form>
               </div>
   </body>
</html>


