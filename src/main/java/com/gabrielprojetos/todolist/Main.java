package com.gabrielprojetos.todolist;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
            Check escolha = new Check();    
            Menu menu = new Menu();
            Tarefa tarefa = new Tarefa();

        
            System.out.println("Sejam bem vindos ao to-do-list");

            int choice;

            do {

                menu.menuPrincipal(); //mostrar menu
                choice = escolha.escolhaMenu(scanner); //checar escolha

                switch (choice){

                    case 1:{
                        tarefa.adicionarTarefa(scanner);
                        break;
                    }

                    case 2:{
                        tarefa.mostrarTarefas(scanner);
                        break;
                    }                   


                    default:{
                        
                        break;
                    }


                }

            } while (choice != 5);
        }
    }    
}