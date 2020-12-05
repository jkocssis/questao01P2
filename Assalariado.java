/*
 * João Henrique RA 2760481921003
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
public class Assalariado extends Empregado  {
    private double salarioMensal;

    public Assalariado( String Nome, String Sobrenome, String CPF, LocalDate dataNasc ,double salarioMensal) {
        super(Nome, Sobrenome, CPF, dataNasc );
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
    public double getValorPagto(){
        return getSalarioMensal();
    }
    
   
    
    @Override
    public String toString(){
        return String.format("Assalariado: %s%n%s: R$%,.2f", 
                super.toString(), "Salario Mensal", getSalarioMensal());
    }
    
        
    
    
    
}
