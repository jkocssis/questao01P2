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
public abstract class Empregado implements Pagavel {
    private final String Nome;
    private final  String Sobrenome;
    private final  String CPF;
    private final LocalDate dataNasc;
    
    

    public Empregado(String Nome, String Sobrenome, String CPF, LocalDate dataNasc ) {
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.CPF = CPF;
        this.dataNasc = dataNasc;
        
    }
    
       
    
          
//retorna o nome
    public String getNome() {
        return Nome;
    }
    
    //retorna o sobrenome
    public String getSobrenome() {
        return Sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    
    

    
    

    @Override
    public String toString(){
        return String.format("%s %s%nCPF: %s%nAniversario: %s", getNome(), getSobrenome(), getCPF(), getDataNasc());
    }
    
    //public abstract double Ganhos();
    
    
   
    
    
    
    
}
