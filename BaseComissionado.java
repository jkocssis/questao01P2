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
public class BaseComissionado extends Comissionado   {
    private double salarioBase;

    public BaseComissionado( String Nome, String Sobrenome, String CPF,
            double vendasMensal, double percComissao, double salarioBase) {
        
        super(Nome, Sobrenome, CPF, vendasMensal, percComissao);
        
        if (salarioBase < 0.0)
            throw new IllegalArgumentException(
            "Salario base deve ser maior ou igual a 0");
        
        this.salarioBase = salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0)
            throw new IllegalArgumentException(
            "Salario base deve ser maior ou igual a 0");
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    @Override
    public double Ganhos(){
        return getSalarioBase() + super.Ganhos();
    }
    
    @Override
    public String toString(){
        return String.format("%s %s; %s: R$%,..2f", 
                "Comissionado base", super.toString(),
                "salario base", getSalarioBase());
    }
    
    
    
    
    
}
