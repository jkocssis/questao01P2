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
public class BaseComissionado extends Comissionado implements Pagavel  {
    private double salarioBase;

    public BaseComissionado(double salarioBase, double vendasMensal, double percComissao, String Nome, String Sobrenome, String CPF) {
        super(vendasMensal, percComissao, Nome, Sobrenome, CPF);
        
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
    public double getValorPagto(){
        return getSalarioBase() + super.getValorPagto();
    }
    
    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,..2f", 
                "Comissionado base", super.toString(),
                "salario base", getSalarioBase());
    }
    
    
    
    
    
}
