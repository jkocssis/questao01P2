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
public class Questao1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assalariado assalariado = new Assalariado("Jao", "da Silva","12325",2000.00);
        Horista horista = new Horista("Ze", "das Couves", "451214", 1.0,100.0);
        Comissionado com = new Comissionado("Aparicio" , "Torelli", "1267",5000.0, 0.5);
        BaseComissionado base = new BaseComissionado("Mirian", "da Costa","1582",
        100.0, 0.5, 1000.00);
        
        System.out.println("Empregados: ");
        
        
        System.out.println("\nAssalariado: "+ "\nNome: " + assalariado.getNome()+" " +
                assalariado.getSobrenome()+"\nCPF:"
                + assalariado.getCPF() +" \nRecebeu: R$" + assalariado.Ganhos());
        
        System.out.println("\nHorista: "+ "\nNome: " + horista.getNome() +" "+
                horista.getSobrenome()+"\nCPF:"
                + horista.getCPF() + "\nHoras trabalhadas: " +horista.gethorasTrab()
                + "\nvalor da hora: " + horista.getValorHora() +" \nRecebeu: R$" + horista.Ganhos());
        
       System.out.println("\nComissionado:" + "\nNome: "+com.getNome()+" "+com.getSobrenome()+
               "\nCPF: "+com.getCPF()+ "\nVendas: "+ com.getVendasMensal()+
               "\nComissao:"+ com.getPercComissao()+
               "\nRecebeu: R$" + com.Ganhos());
       
       System.out.println("\nBase Comissionado:" + "\nNome: "+ base.getNome()+" "+ base.getSobrenome()+
               "\nCPF: "+ base.getCPF()+ "\nVendas: "+ base.getVendasMensal()+
               "\nComissao:"+ base.getPercComissao()+ 
               "\nSalario base:"+base.getSalarioBase()+
               "\nRecebeu: R$" + base.Ganhos());
    }
    
}
