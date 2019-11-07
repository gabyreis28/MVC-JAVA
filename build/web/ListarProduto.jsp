<%-- 
    Document   : ListarProduto
    Created on : 01/10/2019, 21:23:02
    Author     : alunocmc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="DAO.ProdutoDAO"%>
<%@page import="java.util.List"%>
<%@page import="Model.Produto"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
        <title>Produto</title>
    </head>
    <body>
        <div class="container">
            <h1>Lista de Produto</h1>

            <table class="table">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#id</th>
                        <th scope="col">Descrição</th>
                        <th scope="col">Preço</th>
                        <th scope="col">Imagem URL</th>
                        <th scope="col">EDITAR</th>
                        <th scope="col">EXCLUIR</th>
                    </tr>
                </thead>
                <tbody>      
                   
                     <p:forEach items="${listProdutos}" var="p">
                    <tr>
                        <th scope="row">${p.id}</th>
                        <td>${p.descricao}</td>
                        <td>${p.preco}</td>
                        <td>${p.imagem}</td>

                        <td><a href="IniciarEdicao?id=${p.id}">Editar</a></td>
                        <td><a href="ExcluirProduto?id=${p.id}">Excluir</a></td>
                    </tr>
                      </p:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
