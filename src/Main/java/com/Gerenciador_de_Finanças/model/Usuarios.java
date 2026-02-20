package Main.java.com.Gerenciador_de_Finanças.model;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class Usuarios {

    private String nome;
    private String email;
    /*private String senha;*/
    private String senhaHash;
    private List<Conta> contas;

    public Usuarios(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senhaHash = hashSenha(senha);
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public List<Conta> getContas() {
        return new ArrayList<>(contas);
    }

   public void adicionarConta(Conta conta) {
        if (conta != null) {
            this.contas.add(conta);
       }
   }

    private String hashSenha(String senha) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(senha.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hashBytes);

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar hash da senha", e);
        }
    }

    public boolean verificarSenha(String senhaParaVerificar) {
        String hashParaVerificar = hashSenha(senhaParaVerificar);
        return this.senhaHash.equals(hashParaVerificar);
    }

    public void alterarSenha(String novaSenha) {
        this.senhaHash = hashSenha(novaSenha);
    }

    @Override
    public String toString() {
        return "Usuarios: "+
                "\nnome='" + nome + '\'' +
                ", \nemail='" + email + '\'' +
                ", \ncontas=" + contas +
                '}';
    }
}

