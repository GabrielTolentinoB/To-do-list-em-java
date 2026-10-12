package com.gabrielprojetos.todolist;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa {
    String nome;
    String status;
    ArrayList<Tarefa> tarefas = new ArrayList<>();
    int sair;

    public void adicionarTarefa(Scanner scanner) {

        do{
            System.out.println("Qual o nome da tarefa?");
            String nomeRecebido = scanner.nextLine();

            Tarefa novaTarefa = new Tarefa();

            novaTarefa.nome = nomeRecebido;
            novaTarefa.status = "Pendente";

            tarefas.add(novaTarefa);

            System.out.println("Tarefa adicionada com sucesso!");
            System.out.println("Para adicionar outra tarefa, Digite '1'.");
            System.out.println("Para sair, Digite '0'.");

            sair = scanner.nextInt();
            scanner.nextLine();

            switch (sair) {

                case 1:{
                    System.out.println("");
                    break;
                }

                case 0:{
                    System.out.println("");
                    break;
                }

                default: {
                    System.out.println("Digite um número válido");
                    break;
                }
                
            }
        } while (sair != 0);
    }
    
    public void removerTarefa() {

    }

    public void renomearTarefa() {

    }

    public void marcarComoConcluido() {

    }

    public void mostrarTarefas(Scanner scanner) {

        if (tarefas.isEmpty()) {
            System.out.println("Sem conteudo");
        } else {

            for (int i = 0; i < tarefas.size(); i++) {
            System.out.println("Tarefa Nº"+ i + " " + tarefas.get(i).nome + " [" + tarefas.get(i).status + "]");
            }
        }    

        System.out.println("Pressione ENTER ou digite qualquer tecla para voltar ao menu]");
        scanner.nextLine(); //
    }


}

