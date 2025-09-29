package Main.java.com.Gerenciador_de_Finanças.model;
import java.util.List;
public class Usuarios {

    private String nome;
    private int idade;
    private String email;
    private String senha;
    private List<Conta> contas;

    /*public Usuarios(String nome, String email, String senha, List<Conta> contas) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.contas = contas;
    }*/

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void cadastro(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", contas=" + contas +
                '}';
    }
}

