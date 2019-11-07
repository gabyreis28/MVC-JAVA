/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunocmc
 */
public class Produto {
    private int id;
    private String descricao;
    private double preco;
    private String imagem;
        
    
    public Produto() {
    }

    public Produto(int id, String descricao, double preco, String imagem) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
    }

    public Produto(int id){
        this.id=id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
}
