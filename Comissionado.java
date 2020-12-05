/*
 João Henrique RA 2760481921003
 Gabriel RA 2760481911011
 */
package questao1p2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;


/**
 *
 * @author joaok
 */
public class Comissionado extends Empregado  {
    private double vendasMensal;
    private double percComissao;
    private double adicional;

    public Comissionado( String Nome, String Sobrenome, String CPF,
            LocalDate dataNasc ,double vendasMensal, double percComissao, double adicional) {
        super(Nome, Sobrenome, CPF,dataNasc );
        
        if (percComissao <= 0.0 || percComissao >= 1.0)
            throw new IllegalArgumentException(
            "A comissao  deve ser maior que 0  e menor que 1.0");
        
        if (vendasMensal < 0.0)
            throw new IllegalArgumentException(
            "A venda mensal  deve ser maior ou igual  0");
        
        this.vendasMensal = vendasMensal;
        this.percComissao = percComissao;
        this.adicional = adicional;
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

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    
    @Override
    public double getValorPagto(){
        return (getPercComissao() * getVendasMensal()) + getAdicional() ;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %,.2f; %s: %,.2f", 
                "Comissionado", super.toString(),
                "Vendas do mes", getVendasMensal(),
                "Comisao", getPercComissao());
    }
    
    
    
    
    
    
}
