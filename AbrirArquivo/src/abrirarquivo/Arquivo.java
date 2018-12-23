/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abrirarquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.imageio.stream.FileImageInputStream;

/**
 *
 * @author ice
 */
public class Arquivo {
    
    static public void abrirArquivo() throws FileNotFoundException {
        File arq = new File("Qualquer coisa.txt");
        FileInputStream fi = new FileInputStream(arq);
    }
}
