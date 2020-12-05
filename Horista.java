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
public class Horista extends Empregado {
    private double valorHora;
    private double horasTrab;
    private double adic;

    public Horista( String Nome, String Sobrenome, String CPF,
            LocalDate dataNasc  , double valorHora, double horasTrab, double adic) {
        super(Nome, Sobrenome, CPF,dataNasc );
        if ( valorHora < 0.0)
            throw new IllegalArgumentException(
            "O valor da hora trabalhada  deve ser maior ou igual a 0");
        
        if ( horasTrab < 0.0 )
            throw new IllegalArgumentException(
            "A hora trabalhada  deve ser maior ou igual a 0.00");
        
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
        this.adic = adic;
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

    public void setAdic(double adic) {
        this.adic = adic;
    }

    public double getAdic() {
        return adic;
    }

   
    
    
    
    public void sethorasTrab(double horas){
        if ( horasTrab < 0.0 )
            throw new IllegalArgumentException(
            "A hora trabalhada  deve ser maior ou igual a 0.0 e menor ou igual 160.00");
        this.horasTrab = horas;
    }
    
    public double gethorasTrab(){
        return horasTrab;
    }
    
    @Override
    public double getValorPagto(){
        if(gethorasTrab() <= 160)
            return (getValorHora() * gethorasTrab()) + getAdic() ;
        else 
            return 160 * getValorHora() + (gethorasTrab() - 160 ) * getValorHora() * 1.5 + getAdic();
    }
    
    @Override
    public String toString(){
        return String.format("Horista: %s%n%s: R$%,.2f; %s: %,.2f", 
                super.toString(), "valor da hora", getValorHora(),
                "horas trabalhadas", gethorasTrab() );
    }
    
    
}
