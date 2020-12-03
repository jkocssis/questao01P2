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
public class Fatura implements Pagavel {
    private String Numero;
    private String Descricao;
    private int Quantidade;
    private double Preco;

    public Fatura(String Numero, String Descricao, int Quantidade, double Preco) {
        
        if(Quantidade < 0)
            throw new IllegalArgumentException("A quantidade deve ser maior que 0");
        
        if(Preco < 0.0)
            throw new IllegalArgumentException("O preco do item deve ser maior que 0");
        
        
        this.Numero = Numero;
        this.Descricao = Descricao;
        this.Quantidade = Quantidade;
        this.Preco = Preco;
        
        
    }

    public String getNumero() {
        return Numero;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setQuantidade(int Quantidade) {
        if(Quantidade < 0)
            throw new IllegalArgumentException("A quantidade deve ser maior que 0");
               
        this.Quantidade = Quantidade;
    }
    
    

    public int getQuantidade() {
        return Quantidade;
    }

    public void setPreco(double Preco) {
        if(Preco < 0.0)
            throw new IllegalArgumentException("O preco do item deve ser maior que 0");
        this.Preco = Preco;
    }
    
    
    public double getPreco() {
        return Preco;
    }
    @Override
    public String toString(){
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: R$%,.2f",
                "Fatura", "Numero",getNumero(),  getDescricao(),"quantidade",
                getQuantidade(),"preco do item",getPreco() );
    }
    @Override
    public double getValorPagto(){
        return getQuantidade() * getPreco();
    }
    
    
    
    
}
