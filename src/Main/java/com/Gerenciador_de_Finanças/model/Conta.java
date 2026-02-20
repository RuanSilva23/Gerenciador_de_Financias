package Main.java.com.Gerenciador_de_Finanças.model;

public class Conta {

    private final int ID;
    private final String nome;
    private double saldo;
    private String tipo;
    private double deposito;
    private double saque;

    public Conta(int ID, String nome, double saldo, String tipo, double deposito, double saque) {
        this.ID = ID;
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
        this.deposito = deposito;
        this.saque = saque;
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

    public double getDeposito() {
        return deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void saque(double valor){
        this.saldo -= valor;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }
}
