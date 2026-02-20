package Main.java.com.Gerenciador_de_Finanças;

import Main.java.com.Gerenciador_de_Finanças.model.Usuarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condicao = true;
        Usuarios usuarios = null;

        while (condicao) {
            System.out.print("Opções:" +
                    "\n1 - Cadastro " +
                    "\n2 - Login" +
                    "\n3 - Consulta Cadastro" +
                    "\n0 - Sair" +
                    "\nOpção Escolhida: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) {
                System.out.println("Encerrando....");
                condicao = false;
            } else if (opcao > 3 || opcao < 0) {
                System.out.println("Opção Incorreta, Tente novamente!");
                continue;
            }

            switch (opcao) {
                case 1: {
                    System.out.println("--------------------");
                    System.out.println("  Tela de Cadastro  ");
                    System.out.println("--------------------");
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    /*usuarios.adicionarConta(nome, email, senha);*/
                    break;
                }
                case 2:
                    System.out.println("--------------------");
                    System.out.println("  Tela de Login  ");
                    System.out.println("--------------------");

                case 3:
                    System.out.println("-----------");
                    System.out.println(" Usuário Cadastrados ");
                    System.out.println("Nome: " + usuarios.getNome());
                    System.out.println("Email: " + usuarios.getEmail());
                    System.out.println("Senha: " + "************");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }
        }
    }
}
