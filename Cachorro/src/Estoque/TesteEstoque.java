package Estoque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ice
 */
public class TesteEstoque {
    
    public static void main (String [] args){
        Estoque produto1 = new Estoque("Impressora Jato de tinta", 13, 6);
        Estoque produto2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
        Estoque produto3 = new Estoque("Mouse optico", 6, 2);
        Estoque produto4 = new Estoque("PlayStation", 20, 14);
        
        produto1.baixaEstoque(5);
        System.out.println(produto1.getQuantidadeAtual());
        produto2.reporEstoque(7);
        System.out.println(produto2.getQuantidadeAtual());
        produto3.baixaEstoque(4);
        System.out.println(produto3.getQuantidadeAtual());
        if(produto1.precisaRepor())
            System.out.println("Precisa repor " + produto1.nome);
        else
            System.out.println("Nao precisa repor " + produto1.nome);
    }
    
}
