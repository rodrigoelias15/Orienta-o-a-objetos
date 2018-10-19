/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

/**
 *
 * @author User
 */
public class TipoPokemon extends Atributos implements Fogo, Psiquico{
    
    @Override
    public void fogo(int nivel){
    
        //atributos para o pokemon nivel 1
        hp = 70;    
        meele = 50;
        mana = 70;         
        //atributos aumentam conforme o nivel
        if(nivel != 1)
        {
            hp += 8*nivel;
            meele += 5*nivel;
            mana += 8*nivel;
        }
    }
    
    @Override
    public void psiquico(int nivel){
            
        //atributos para o pokemon nivel 1
        hp = 50;    
        meele = 20;
        mana = 100;         
        //atributos aumentam conforme o nivel
        if(nivel != 1)
        {
            hp += 5*nivel;
            meele += 2*nivel;
            mana += 10*nivel;
        }
    }
}
