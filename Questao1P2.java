/*
 João Henrique RA 2760481921003
 Gabriel RA 2760481911011
 */
package questao1p2;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author joaok
 */
public class Questao1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cria um objeto com a data de hoje
        LocalDate hoje = LocalDate.now();
        
        //cria objetos com o aniversario dos empregados
        LocalDate AssaNascim =  LocalDate.of(2000,12,03);
        LocalDate HoristaNascim = LocalDate.of(2001,12,04);
        LocalDate ComNascim = LocalDate.of(1995,12,3);
        LocalDate BaseNascim = LocalDate.of(1999,12,04);
        
        
        //instancia os empregados
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
       
        System.out.println("\nLista de empregados: ");
        
        
        
        for(Empregado atual: empregados){
            
            if(atual instanceof BaseComissionado){
                BaseComissionado empregado = (BaseComissionado) atual;
            empregado.setSalarioBase(1.10 * empregado.getSalarioBase());
            
                System.out.println("O novo salario do Base Comissionado, acrescido de 10% e: R$"
                        + empregado.getSalarioBase());
            }
            System.out.println("\n"+atual);
            System.out.println("\nGanhos por mes: R$" +atual.getValorPagto());
            System.out.println("Ganhos em 12 meses: R$" +atual.getValorPagto() * 12);
            System.out.println("*************************************");
            
        }
            //cria faturas 
           Pagavel[] fatura = new Pagavel[4];
           
           fatura[0] = new Fatura("123", "Cadeira", 100, 200.00);
           fatura[1] = new Fatura("124", "PC", 10, 1000.00);
           fatura[2] = new Fatura("125", "Armario", 2, 500.00);
           fatura[3] = new Fatura("126", "Cafe", 100, 20);
           
           
            System.out.println("\nFaturas: ");
            //processa as faturas e imprime
            for(Pagavel faturaAtual: fatura ){
                System.out.println("\n"+faturaAtual.toString()+"\nTotal: R$"+faturaAtual.getValorPagto());
                
                
                
            }
            }
          
            }  
            
            
        
              
    

