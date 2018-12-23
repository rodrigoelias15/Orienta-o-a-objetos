/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abrirarquivo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ice
 */
public class Aluno {
    
    public void chegarNaAula (int horario){
        if(horario > 19){
            try {
                throw new ChegarAtrasadoException("Tomô pau!");
            } 
            catch (ChegarAtrasadoException ex) {
                System.out.println(ex);
            }
        }
    }
}
