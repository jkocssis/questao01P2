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
public class Comissionado extends Empregado implements Pagavel {
    private double vendasMensal;
    private double percComissao;

    public Comissionado(double vendasMensal, double percComissao, String Nome, String Sobrenome, String CPF) {
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
    public double getValorPagto(){
        return getPercComissao() * getVendasMensal();
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,..2f; %s: %.2f", 
                "Comissionado", super.toString(),
                "Vendas do mes", getVendasMensal(),
                "Comisa0", getPercComissao());
    }
    
    
    
    
    
    
}
