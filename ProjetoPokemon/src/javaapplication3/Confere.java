/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Confere extends TipoPokemon{
    
    static boolean ehPsiquico(String nome){
        
        ArrayList listaPsiquicos = new ArrayList(); //cria lista de pokemons psiquicos        
        
        listaPsiquicos.add("Abra");
        listaPsiquicos.add("Kadabra");
        listaPsiquicos.add("Alakazam");
        listaPsiquicos.add("Psyduck");
        listaPsiquicos.add("Golduck");     
        
        for(int i=0; i<listaPsiquicos.size(); i++){
            if(nome == listaPsiquicos.get(i))
                return true; //Pokemon esta na lista
        }        
        return false; //Pokemon não esta na lista
    }  
    
    static boolean ehFogo(String nome){
        
        ArrayList listaFogo = new ArrayList(); //cria lista de pokemons psiquicos        
        
        listaFogo.add("Charmander");
        listaFogo.add("Charmeleon");
        listaFogo.add("Charizard");
        
        for(int i=0; i<listaFogo.size(); i++){
            if(nome == listaFogo.get(i))
                return true; //Pokemon esta na lista
        }        
        return false; //Pokemon não esta na lista
    } 
   
}
