package Main.java.com.Gerenciador_de_Finanças;
import Main.java.com.Gerenciador_de_Finanças.model.Usuarios;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean codicao = true;
        Usuarios nome1 = new Usuarios();

        while (codicao) {
            System.out.print("Opções:" +
                    "\n1 - Cadastro " +
                    "\n2 - Login" +
                    "\n3 - Consulta Cadastro" +
                    "\n0 - Sair" +
                    "\nOpção Escolhida: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando....");
                codicao = false;
            } else if (opcao > 3 || opcao < 0) {
                System.out.println("Opção Incorreta, Tente novamente!");
                continue;
            }

            scanner.nextLine();
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

                    nome1.cadastro(nome, email, senha);
                    break;
                }
                case 2:
                    System.out.println("--------------------");
                    System.out.println("  Tela de Login  ");
                    System.out.println("--------------------");

                case 3:
                    System.out.println("-----------");
                    System.out.println(" Usuário Cadastrados ");
                    System.out.println("Nome: " + nome1.getNome());
                    System.out.println("Email: " + nome1.getEmail());
                    System.out.println("Senha: " + "************");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }
        }
    }
}
