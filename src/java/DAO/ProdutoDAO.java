/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunocmc
 */
public class ProdutoDAO {
     public void cadastrar (Produto produto){
         
        try {
            Connection conexao = FabricaConexao.getConexao();
            
            String sql = "INSERT INTO produto (descricao, preco, imagem) VALUES (?,?,?)";
            PreparedStatement psmt = conexao.prepareStatement(sql);
            psmt.setString(1, produto.getDescricao());
            psmt.setDouble(2, produto.getPreco());
            psmt.setString(3, produto.getImagem());
            psmt.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public List<Produto> Listar(){
        
        List<Produto> produtos = new ArrayList<>();
        
        try{
            
            Connection conexao = FabricaConexao.getConexao();
            
            String sql="SELECT * FROM produto order  by id";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setDescricao(rs.getString("descricao"));
                p.setPreco(rs.getDouble("preco"));
                p.setImagem(rs.getString("imagem"));
               

                produtos.add(p);
            }
            
            
        } catch(Exception e){
            e.printStackTrace();
        }
        return produtos;
    }
     public void editar (Produto produto){
         try {
             
              Connection conexao = FabricaConexao.getConexao();
              
            String sql = "UPDATE produto SET descricao=?, preco=? WHERE id=?"; 
            PreparedStatement psmt = conexao.prepareStatement(sql);
            psmt.setString(1, produto.getDescricao());
            psmt.setDouble(2, produto.getPreco());
            psmt.setInt(3, produto.getId());
            psmt.execute();
            
         } catch (Exception e) {
             e.printStackTrace();
         }
         
     }
     
        public void excluir (Produto produto){
         try {
             
              Connection conexao = FabricaConexao.getConexao();
              
            String sql = "DELETE FROM produto WHERE id=?"; 
            PreparedStatement psmt = conexao.prepareStatement(sql);
            psmt.setInt(1, produto.getId());
            psmt.execute();
            
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
     
          public Produto listarId(Produto produto){
    
        try{
            
            Connection conexao = FabricaConexao.getConexao();
            
            String sql="SELECT id, descricao, preco, imagem FROM produto WHERE id=?";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setInt(1, produto.getId());
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setImagem(rs.getString("imagem"));
            }    
        } catch(Exception e){
            e.printStackTrace();
        }
        return produto;
    }
    
}
