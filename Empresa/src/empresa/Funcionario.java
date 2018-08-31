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
public class Funcionario {
    private String matricula;
    private String nome;
    private String cargo;
    private int idade;
    private float salario;
    static int numeroFuncionarios = 0;

    public Funcionario(){
        Funcionario.numeroFuncionarios++;
        this.salario = 1500;        
    }

    public Funcionario(String matricula, String nome, float salario) {
        Funcionario.numeroFuncionarios++;
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;        
    }

    public Funcionario(String nome, int idade) {
        Funcionario.numeroFuncionarios++;
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
         this.salario = salario;
    }
}
