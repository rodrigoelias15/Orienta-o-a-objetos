/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author RODRIGO
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario worker = new Funcionario();        
        System.out.println(worker.getSalario());
        Funcionario worker2 = new Funcionario("Godofredo", 35);
        System.out.println(worker2.getIdade());
        System.out.println(worker2.getNome());
        Funcionario worker3 = new Funcionario("201866988A", "Zé", 1200);
        System.out.println(worker3.getMatricula());
        System.out.println(worker3.getNome());
        System.out.println(worker3.getSalario());
        System.out.println(Funcionario.numeroFuncionarios);       
    }    
}
