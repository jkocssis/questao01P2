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
                + assalariado.getCPF() +" \nRecebeu: R$" + assalariado.getValorPagto());
        
        System.out.println("\nHorista: "+ "\nNome: " + horista.getNome() +" "+
                horista.getSobrenome()+"\nCPF:"
                + horista.getCPF() + "\nHoras trabalhadas: " +horista.gethorasTrab()
                + "\nvalor da hora: " + horista.getValorHora() +" \nRecebeu: R$" + horista.getValorPagto());
        
       System.out.println("\nComissionado:" + "\nNome: "+com.getNome()+" "+com.getSobrenome()+
               "\nCPF: "+com.getCPF()+ "\nVendas: "+ com.getVendasMensal()+
               "\nComissao:"+ com.getPercComissao()+
               "\nRecebeu: R$" + com.getValorPagto());
       
       System.out.println("\nBase Comissionado:" + "\nNome: "+ base.getNome()+" "+ base.getSobrenome()+
               "\nCPF: "+ base.getCPF()+ "\nVendas: "+ base.getVendasMensal()+
               "\nComissao:"+ base.getPercComissao()+ 
               "\nSalario base:"+base.getSalarioBase()+
               "\nRecebeu: R$" + base.getValorPagto());
       
       Empregado[] empregados = new Empregado[4];
       
       empregados[0] = assalariado;
       empregados[1] = horista;
       empregados[2] = com;
       empregados[3] = base;
       
        System.out.println("\nLista de empregados: ");
        for(Empregado corrente:empregados){
            /*System.out.println(corrente.getNome()+" "+ corrente.getSobrenome()+
                   "\nCPF"+ corrente.getCPF()+"\n");*/
            System.out.println("\n"+corrente);
            
            if(corrente instanceof BaseComissionado){
                BaseComissionado empregado = (BaseComissionado) corrente;
            empregado.setSalarioBase(1.10 * empregado.getSalarioBase());
            
                System.out.println("O novo salario do Base Comissionado, acrescido de 10% e: R$"
                        + empregado.getSalarioBase());
        }
            System.out.println("\nGanhos por mes: R$" +corrente.getValorPagto());
            System.out.println("Ganhos em 12 meses: R$" +corrente.getValorPagto() * 12);
            System.out.println("*************************************");
            
           Pagavel[] fatura = new Pagavel[6];
           
           fatura[0] = new Fatura("123", "Cadeira", 100, 200.00);
           fatura[1] = new Assalariado("Paula", "dos Santos", "1258", 1000.00);
           fatura[2] = new Fatura("124", "PC", 10, 1000.00);
           fatura[3] = new Fatura("125", "Armario", 2, 500.00);
           fatura[4] = new Fatura("126", "Cafe", 100, 20);
           fatura[5] = new Horista("Marcia", "Valadares", "14558", 25, 110);
           
            System.out.println("Faturas: ");
            
            for(Pagavel faturaAtual: fatura ){
                System.out.println("\n"+faturaAtual.toString()+"\nTotal: R$"+faturaAtual.getValorPagto());
            }
            
            
        }
        
                
    }
    
}
