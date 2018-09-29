/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaapp;


import static agenciaapp.Agencia.apagarProjeto;
import static agenciaapp.Agencia.atualisarnotaProjeto;
import static agenciaapp.Agencia.criarProjeto;
import static agenciaapp.Agencia.encerrarProjeto;
import static agenciaapp.Agencia.listarProjeto;
import static agenciaapp.Agencia.listarProjetoNumero;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Stella Assução
 */
public class AgenciaApp {

    static ArrayList<Projeto> listaProjeto = new ArrayList <Projeto>();
    public static void main(String[] args) {
        
        menuProjeto();
        
        
    }

    private static void menuProjeto() {
            
        int numero;
        
        do{
            System.out.println("");
            System.out.println("O que você deseja fazer:");
            System.out.println("[1]Inserir um novo projeto");
            System.out.println("[2]Listar todos os projetos");
            System.out.println("[3]Atualizar a avaliação do projeto");
            System.out.println("[4]Excluir um projeto");
            System.out.println("[5]Listar um projeto pelo número");
            System.out.println("[6]Sair");
            Scanner teclado = new Scanner(System.in);
            numero = teclado.nextInt();

                
            switch (numero) {
                case 1:
                    listaProjeto.add(criarProjeto()) ;
                    break;
                case 2:
                    listarProjeto();
                    break;
                    
                case 3:
                    atualisarnotaProjeto();
                   break;

                case 4:
                    apagarProjeto();
                    break;

                case 5:
                    listarProjetoNumero();
                    break;
                    
                default:
                    encerrarProjeto();
                    break;
                                        
            }
        }while(numero != 6);
        
       
    }

    

    

    

    

    

    
    
}
