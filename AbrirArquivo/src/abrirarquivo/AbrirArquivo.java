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
public class AbrirArquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arquivo arquivo = new Arquivo();
        try{
            arquivo.abrirArquivo();
        }
        catch(FileNotFoundException e){
        }
        
        Aluno al = new Aluno();
        al.chegarNaAula(20);
        
        
    }    
}