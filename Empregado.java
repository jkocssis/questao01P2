/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1p2;

/**
 *
 * @author joaok
 */
public abstract class Empregado {
    private final String Nome;
    private final  String Sobrenome;
    private final  String CPF;

    public Empregado(String Nome, String Sobrenome, String CPF) {
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.CPF = CPF;
    }

    
    
          

    public String getNome() {
        return Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public String toString(){
        return String.format("%s %s%nCPF: %s", getNome(), getSobrenome(), getCPF());
    }
    
    public abstract double Ganhos();
    
    
   
    
    
    
    
}
