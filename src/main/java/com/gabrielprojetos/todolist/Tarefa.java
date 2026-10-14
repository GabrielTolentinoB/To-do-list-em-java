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
    
    public void removerTarefa(Scanner scanner) {

        do{
            if (!tarefas.isEmpty()) {
        
                mostrarTarefas(scanner);
                System.out.println("Qual tarefa deseja deletar?");
                
                int deletar = scanner.nextInt();
                scanner.nextLine();
                
                if (deletar > 0 && deletar <= tarefas.size()){
                    tarefas.remove(deletar);
                    System.out.println("Tarefa removida com sucesso");
                    System.out.println("");
                    System.out.println("Para continuar nessa seção, Digite '1'.");
                } else {
                    System.out.println("Valor inserido não válido");
                }

            } else {
            System.out.println("Sem nenhum valor inserido");
            }

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

    public void renomearTarefa(Scanner scanner) {

        do {

            System.out.println("Qual das tarefas abaixo deseja Renomear?");
            mostrarTarefas(scanner);

            int selecionado = scanner.nextInt();
            scanner.nextLine();

            if (selecionado > 0 && selecionado <= tarefas.size()) {

                System.out.println();
                String novaMensagem = scanner.nextLine();
                
                tarefas.get(selecionado).nome= novaMensagem;
                System.out.println("Tarefa renomeada com sucesso");
                System.out.println("");
                System.out.println("Para renomear outra tarefa, Digite '1'.");

            } else {
                System.out.println("Tarefa não encontrada");
                System.out.println("");
                System.out.println("Para tentar novamente, Digite '1'.");
            }
                    
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

    public void marcarComoConcluido(Scanner scanner) {

        do {

            System.out.println("Qual das tarefas abaixo deseja marcar como concluido?");
            mostrarTarefas(scanner);

            int selecionado = scanner.nextInt();
            scanner.nextLine();

            if (selecionado > 0 && selecionado <= tarefas.size()) {
                
                tarefas.get(selecionado).status= "concluido";
                System.out.println("Tarefa alterada com sucesso");
                System.out.println("");
                System.out.println("Para marcar outra tarefa, Digite '1'.");

            } else {
                System.out.println("Tarefa não encontrada");
                System.out.println("");
                System.out.println("Para tentar novamente, Digite '1'.");
            }
                    
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

    public void mostrarTarefas(Scanner scanner) {

        if (tarefas.isEmpty()) {
            System.out.println("Sem conteudo");
        } else {

            for (int i = 0; i < tarefas.size(); i++) {
            System.out.println("Tarefa Nº"+ i + " " + tarefas.get(i).nome + " [" + tarefas.get(i).status + "]");
            }
        }    
    }
}

