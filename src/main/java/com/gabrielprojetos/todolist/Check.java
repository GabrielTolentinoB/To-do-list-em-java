package com.gabrielprojetos.todolist;
import java.util.Scanner;

public class Check {

    public int escolhaMenu(Scanner scanner) {
        int choice;


        do {
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Adicionar tarefa selecionado");
            
                    break;
                case 2:
                    System.out.println("ver todas as tarefas selecionado");
                    break;
                case 3:
                    System.out.println("Renomear tarefa selecionado");
                    break;
            
                case 4:
                    System.out.println("Marcar tarefa como comcluida selecionado");
                    break;

                case 5:
                    System.out.println("Remover tarefa selecionado");
                    break;
            
                case 6:
                    System.out.println("saindo...");
                    break;                
    
                default:
                    System.out.println("Número não válido");
                    break;
            }
        } while (choice < 1 || choice > 6);
         return choice;
    }
}