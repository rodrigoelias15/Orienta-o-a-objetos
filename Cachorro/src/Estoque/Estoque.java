/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estoque;

/**
 *
 * @author ice
 */
public class Estoque {
    String nome;
    int quantidadeAtual;
    int quantidadeMinima;

    public Estoque(String nome, int quantidadeAtual, int quantidadeMinima) {
        this.nome = nome;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }
    
    void reporEstoque(int x){
        setQuantidadeAtual(quantidadeAtual + x);
    }
    
    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }
    
    void baixaEstoque(int x){
        setQuantidadeAtual(quantidadeAtual-x);        
    }
    
    boolean precisaRepor(){
        if(getQuantidadeAtual() < getQuantidadeMinima())
            return true;
        else
            return false;
    }

    
}
