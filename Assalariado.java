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
public class Assalariado extends Empregado  {
    private double salarioMensal;

    public Assalariado( String Nome, String Sobrenome, String CPF,double salarioMensal) {
        super(Nome, Sobrenome, CPF);
        if(salarioMensal < 0.0)
            throw new IllegalArgumentException(
            "Salario mensal deve ser maior ou igual a 0");
        this.salarioMensal = salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal){
        if(salarioMensal < 0.0)
            throw new IllegalArgumentException(
            "Salario mensal deve ser maior ou igual a 0");
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }
     
        
   
    @Override
    public double Ganhos(){
        return getSalarioMensal();
    }
    
   
    
    @Override
    public String toString(){
        return String.format("Salario do peao: %s%n%s: R$%,.2f", 
                super.toString(), "Salario Mensal", getSalarioMensal());
    }
    
        
    
    
    
}
