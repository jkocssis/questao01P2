/*
 João Henrique RA 2760481921003
 Gabriel RA 2760481911011
 */
package questao1p2;

import java.util.Calendar;import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;


/**
 *
 * @author joaok
 */
public class BaseComissionado extends Comissionado   {
    private double salarioBase;

    public BaseComissionado( String Nome, String Sobrenome, String CPF,LocalDate dataNasc ,
            double vendasMensal, double percComissao, double salarioBase, double adicional) {
        
        super(Nome, Sobrenome, CPF,dataNasc  , vendasMensal, percComissao, adicional);
        
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
        return String.format("%s %s; %s: R$%,.2f", 
                "Comissionado base", super.toString(),
                "salario base", getSalarioBase());
    }
    
    
    
    
    
}
