/*
 João Henrique RA 2760481921003
 Gabriel RA 2760481911011
 */
package questao1p2;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author joaok
 */
public class SalarioAniversario {
    public static void main(String[] args) {
        
        
        
        System.out.println("\nSALARIOS ALTERADOS SE O ANIVERSARIO COINCIDE COM DATA ATUAL");
        System.out.println("\n");
        //cria um objeto com a data atual
        LocalDate hoje = LocalDate.now();
        
        //cria objetos com a data de aniversario
        LocalDate AssaNascim =  LocalDate.of(1979,12,04);
        LocalDate HoristaNascim = LocalDate.of(1980,12,04);
        LocalDate ComNascim = LocalDate.of(1990,12,04);
        LocalDate BaseNascim = LocalDate.of(2001,12,04);
        
        //cria os objetos das subclasses
        Assalariado assalariado = new Assalariado("Jao", "da Silva","12325",AssaNascim,2000.00);
        Horista horista = new Horista("Ze", "das Couves", "451214", HoristaNascim ,10.0,100.0,0.0);
        Comissionado com = new Comissionado("Aparicio" , "Torelli", "1267",ComNascim,5000.0, 0.5,0.0);
        BaseComissionado base = new BaseComissionado("Mirian", "da Costa","1582",BaseNascim,
        100.0, 0.5, 1000.00,0.0);
        
        System.out.println("Empregados: ");
        
        
        
        //cria uma array com os empregados
       
       Empregado[] empregados = new Empregado[4];
       
       empregados[0] = assalariado;
       empregados[1] = horista;
       empregados[2] = com;
       empregados[3] = base;
       
       //array é processado
       //verifica se o aniversario de cada empregado coincide com a data atual, se sim adiciona R$200 ao salario
       for(Empregado atual: empregados){
           if(atual instanceof Assalariado){
               Assalariado empregado = (Assalariado) atual;
               if(empregado.getDataNasc().getDayOfMonth()==hoje.getDayOfMonth() ||
                       empregado.getDataNasc().getMonthValue()==hoje.getMonthValue()){
                   empregado.setSalarioMensal(230+empregado.getValorPagto());
               }//fim do segundo if
               
           }else //fim do if
               if(atual instanceof Horista){
               Horista empregado = (Horista) atual;
                if(empregado.getDataNasc().getDayOfMonth()==hoje.getDayOfMonth() ||
                       empregado.getDataNasc().getMonthValue()==hoje.getMonthValue()){
                       empregado.setAdic(230+ empregado.getValorPagto());
                    
               }
                   }else
                        if(atual instanceof Comissionado){
                            Comissionado empregado = (Comissionado) atual;
                                if(empregado.getDataNasc().getDayOfMonth()==hoje.getDayOfMonth() ||
                       empregado.getDataNasc().getMonthValue()==hoje.getMonthValue()){
                                    empregado.setAdicional(0 + empregado.getValorPagto());
               }
                   }
                        if(atual instanceof BaseComissionado){
                                BaseComissionado empregado = (BaseComissionado) atual;
                                    if(empregado.getDataNasc().getDayOfMonth()==hoje.getDayOfMonth() ||
                       empregado.getDataNasc().getMonthValue()==hoje.getMonthValue()){
                                empregado.setSalarioBase(210+empregado.getValorPagto());
               }
                   }
                            
           
           //mostra ganhos por mes e ganhos anuais
           System.out.println("\n"+atual);
            System.out.println("\nGanhos por mes: R$" +atual.getValorPagto());
            System.out.println("Ganhos em 12 meses: R$" +atual.getValorPagto() * 12);
            System.out.println("*************************************");
       }//fim do for
       
    }   
    
}
