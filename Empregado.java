/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1p2;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author joaok
 */
public abstract class Empregado implements Pagavel {
    private final String Nome;
    private final  String Sobrenome;
    private final  String CPF;
    private final Date dataNasc;
    
    

    public Empregado(String Nome, String Sobrenome, String CPF, Date dataNasc ) {
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.CPF = CPF;
        this.dataNasc = dataNasc;
        
    }
    
       
    
          

    public String getNome() {
        return Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public Date getDataNasc() {
        return dataNasc;
    }
    

    
    

    @Override
    public String toString(){
        return String.format("%s %s%nCPF: %s%s", getNome(), getSobrenome(), getCPF(), getDataNasc());
    }
    
    //public abstract double Ganhos();
    
    
   
    
    
    
    
}
