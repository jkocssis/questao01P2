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
public class Comissionado extends Empregado  {
    private double vendasMensal;
    private double percComissao;

    public Comissionado( String Nome, String Sobrenome, String CPF,double vendasMensal, double percComissao) {
        super(Nome, Sobrenome, CPF);
        
        if (percComissao <= 0.0 || percComissao >= 1.0)
            throw new IllegalArgumentException(
            "A comissao  deve ser maior que 0  e menor que 1.0");
        
        if (vendasMensal < 0.0)
            throw new IllegalArgumentException(
            "A venda mensal  deve ser maior ou igual  0");
        
        this.vendasMensal = vendasMensal;
        this.percComissao = percComissao;
    }
    public void setvendasMensal(double vendasMensal){
         if (vendasMensal < 0.0)
            throw new IllegalArgumentException(
            "A venda mensal  deve ser maior ou igual  0");
         this.vendasMensal = vendasMensal;
    }

    public double getVendasMensal() {
        return vendasMensal;
    }

    public void setPercComissao(double percComissao) {
        if (percComissao <= 0.0 || percComissao >= 1.0)
            throw new IllegalArgumentException(
            "A comissao  deve ser maior que 0  e menor que 1.0");
        this.percComissao = percComissao;
    }

    public double getPercComissao() {
        return percComissao;
    }
    
    @Override
    public double Ganhos(){
        return getPercComissao() * getVendasMensal();
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: R$%,..2f; %s: %.2f", 
                "Comissionado", super.toString(),
                "Vendas do mes", getVendasMensal(),
                "Comisa0", getPercComissao());
    }
    
    
    
    
    
    
}
