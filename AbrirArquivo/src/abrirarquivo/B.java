/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abrirarquivo;

import java.io.FileNotFoundException;

/**
 *
 * @author ice
 */
public class B {
       
    public void m2() throws FileNotFoundException{
        C aux = new C();
        try {
            aux.m3();
        } catch(ChegarAtrasadoException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void m3() throws FileNotFoundException{
        Arquivo.abrirArquivo();
    }
}
