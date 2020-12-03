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
public class Horista extends Empregado {
    private double valorHora;
    private double horasTrab;

    public Horista( String Nome, String Sobrenome, String CPF,Date dataNasc  , double valorHora, double horasTrab) {
        super(Nome, Sobrenome, CPF,dataNasc );
        if ( valorHora < 0.0)
            throw new IllegalArgumentException(
            "O valor da hora trabalhada  deve ser maior ou igual a 0");
        
        if ( horasTrab < 0.0 || (horasTrab > 168.0))
            throw new IllegalArgumentException(
            "A hora trabalhada  deve ser maior ou igual a 0.0 e menor ou igual 168.0");
        
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
    }

    
    public void setvalorHora(double valorHora){
        if ( valorHora < 0.0)
            throw new IllegalArgumentException(
            "O valor da hora trabalhada  deve ser maior ou igual a 0");
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

   
    
    
    
    public void sethorasTrab(double horas){
        if ( horasTrab < 0.0 || (horasTrab > 168.0))
            throw new IllegalArgumentException(
            "A hora trabalhada  deve ser maior ou igual a 0.0 e menor ou igual R$168,00");
        this.horasTrab = horas;
    }
    
    public double gethorasTrab(){
        return horasTrab;
    }
    
    @Override
    public double getValorPagto(){
        if(gethorasTrab() <= 40)
            return getValorHora() * gethorasTrab() ;
        else 
            return 40 * getValorHora() + (gethorasTrab() - 40 ) * getValorHora() * 1.5;
    }
    
    @Override
    public String toString(){
        return String.format("Horista: %s%n%s: R$%,.2f; %s: %,.2f", 
                super.toString(), "valor da hora:", getValorHora(),
                "horas trabalhadas:", gethorasTrab() );
    }
    
    
}
