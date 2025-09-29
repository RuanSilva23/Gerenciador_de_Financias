package Main.java.com.Gerenciador_de_Finanças.model;

public class Conta {

    private int ID;
    private String nome;
    private double saldo;
    private String tipo;

    public Conta(int ID, String nome, double saldo, String tipo) {
        this.ID = ID;
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }


}
