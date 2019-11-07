/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.ProdutoDAO;
import Model.Produto;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alunocmc
 */
@WebServlet(name = "/ServletProduto", urlPatterns = {"/ServletProduto","/cadastrarProduto","/ListarProduto","/EditarProduto","/IniciarEdicao", "/ExcluirProduto"})
public class ServletProduto extends HttpServlet {

   

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String uri = request.getRequestURI();
            
            if(uri.equals (request.getContextPath() + "/cadastrarProduto")){
                  cadastrar (request,response);
            } else if(uri.equals (request.getContextPath() + "/ListarProduto")){
                listarTodos(request,response);
            } else if(uri.equals (request.getContextPath() + "/EditarProduto")){
                editar(request,response);
            }else if(uri.equals (request.getContextPath() + "/IniciarEdicao")){
                listarId(request,response);
            }else if(uri.equals (request.getContextPath() + "/ExcluirProduto")){
               excluir(request,response);
            }
                
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }

     private void cadastrar (HttpServletRequest request, HttpServletResponse response) throws IOException{
        Produto produto = new Produto();
        produto.setDescricao(request.getParameter("descricao"));
        produto.setPreco(Double.parseDouble(request.getParameter("preco")));
        produto.setImagem(request.getParameter("imagem"));
        
        ProdutoDAO dao = new ProdutoDAO();
        dao.cadastrar(produto);

        response.sendRedirect("sucesso.jsp");
    }
     

    private void listarTodos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista = dao.Listar();
       
          request.setAttribute("listProdutos", lista);
          request.getRequestDispatcher("ListarProduto.jsp").forward(request, response);
        
    }
    
    private void excluir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
         int id = Integer.parseInt(request.getParameter("id")); 
         
        Produto produto = new Produto(id);
        ProdutoDAO dao = new ProdutoDAO();
        dao.excluir(produto);
        
        listarTodos(request,response);
        
        
    }

      private void listarId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id")); 
                
        Produto produto = new Produto(id); 
        ProdutoDAO dao = new ProdutoDAO();
        produto = dao.listarId(produto);
       
          request.setAttribute("objProduto", produto);
          request.getRequestDispatcher("EditarProduto.jsp").forward(request, response);
        
    }

    private void editar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
            
        Produto p = new Produto();
        p.setId(Integer.parseInt(request.getParameter("id")));
        p.setDescricao(request.getParameter("descricao"));
        p.setPreco(Double.parseDouble(request.getParameter("preco")));
        p.setImagem(request.getParameter("imagem"));
       
        ProdutoDAO dao = new ProdutoDAO();
        dao.editar(p);
        
        response.sendRedirect("sucesso.jsp");
    
    
    }
}
 



 
    