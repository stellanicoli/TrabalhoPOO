/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaapp;



import static agenciaapp.AgenciaApp.listaProjeto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stella Assuncao
 */
public class Agencia {
    
    static ArrayList projeto;
    
    public static Projeto criarProjeto() {
        Scanner sc = new Scanner( System.in );
        Projeto projeto = new Projeto(); 
        System.out.println("---------------------------------------------");
        System.out.println("Digite o código interno(Somente NUMEROS): ");
        projeto.codigo_interno = sc.nextInt();
        System.out.println("Digite o titulo: ");
        projeto.titulo = sc.next();
        System.out.println("Digite a Duração(Dias): ");
        projeto.duracao = sc.nextInt();
        System.out.println("Digite o orçamento(Em reais): ");
        projeto.orcamento = sc.nextFloat();
        System.out.println("Digite a Instituição: ");
        projeto.instituicao = sc.next();
        /**System.out.println("Digite a avaliação: ");
        projeto.avaliacao  = sc.next();*/
        System.out.println("---------------------------------------------");
        return projeto;
    
    }
    
    public static void listarProjeto() {
        
        Projeto auxiliar = new Projeto();
        
        for (int i = 0; i < listaProjeto.size(); i++) {
            auxiliar = listaProjeto.get(i);
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("Código do projeto: " + auxiliar.codigo_interno);
            System.out.printf(" titulo do projeto projeto: " + auxiliar.titulo);
            System.out.printf(" Dias de duração: " + auxiliar.duracao);
            System.out.printf(" Orçamento: R$ " + auxiliar.orcamento);
            System.out.println("Instituição: "+ auxiliar.instituicao);
            System.out.println(" Avaliação: " + auxiliar.avaliacao);
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        }
       
    }
    
    public static void apagarProjeto() {
        
        Scanner sc = new Scanner( System.in );
        Projeto objetoAuxiliar = new Projeto();
        System.out.println("---------------------------------------------");
        System.out.println("digite o codigo que deseja APAGAR?");
        int projetoApagado = sc.nextInt();
        
        for (int i = 0; i < listaProjeto.size(); i++) {
            
            objetoAuxiliar = listaProjeto.get(i);
            
            if(objetoAuxiliar.codigo_interno == projetoApagado){
               listaProjeto.remove(i);
                System.out.println("Projeto apagado com sucesso");
        System.out.println("---------------------------------------------");        
            }
            
            
        }
        
    }
    
    public static void listarProjetoNumero() {
        
        Scanner sc = new Scanner( System.in );
        Projeto objetoAuxiliar = new Projeto();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("digite o codigo do projeto que deseja mostrar?");
        int projetoLocalizado = sc.nextInt();
        
        
        
        for (int i = 0; i < listaProjeto.size(); i++) {
            
            objetoAuxiliar = listaProjeto.get(i);
            
            if(objetoAuxiliar.codigo_interno == projetoLocalizado){
                System.out.println("Projeto encontrado com sucesso");
                System.out.printf("Código do projeto: " + objetoAuxiliar.codigo_interno);
                System.out.printf(" titulo do projeto projeto: " + objetoAuxiliar.titulo);
                System.out.printf(" Dias de duração: " + objetoAuxiliar.duracao);
                System.out.printf(" Orçamento: R$ " + objetoAuxiliar.orcamento);
                System.out.println(" Avaliação: " + objetoAuxiliar.avaliacao);
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            }
            
        }
        
    }
    
    public static void atualisarnotaProjeto() {
        
        Scanner sc = new Scanner( System.in );
        Projeto objetoAuxiliar = new Projeto();
        System.out.println("---------------------------------------------");
        System.out.println("digite o codigo que deseja avaliar?");
        int projetoLocalizado =  sc.nextInt();
        
        for (int i = 0; i < listaProjeto.size(); i++) {
            
            objetoAuxiliar = listaProjeto.get(i);
            
            if(objetoAuxiliar.codigo_interno == projetoLocalizado){
                System.out.println("Projeto encontrado com sucesso");
                System.out.println("Qual o resultado da analise? [APROVADO/REPROVADO]");
                
                objetoAuxiliar.avaliacao = sc.next();
                System.out.println("Avaliação incluida com sucesso");
                System.out.println("---------------------------------------------");
                
            }
            
        }
        
    }
    
    
    public static void encerrarProjeto() {
        System.out.println("---------------------------------------------");
        System.out.println("Programa finalizado com sucesso!");
        System.out.println("---------------------------------------------");
    }
    
    
    
}
