package model;

public class Conta {
    protected final int numero;
    protected double saldo;
    protected Cliente cliente;
    private boolean ativo;

   public Conta(int numero, Cliente cliente, double saldo) {
       Conta c = new Conta(numero, cliente, saldo);
        this.numero = numero;
        this.cliente = cliente;
        this.ativo = true;
        this.saldo = saldo;


    }
    double getSaldo(){
       return saldo;}
    int getNumero() {
       return numero; }
    Cliente getCliente() {
       return cliente; }
    boolean isAtivo() {
       return ativo; }

    public void depositar(double valor) {
        this.saldo += valor;
    }
    //mettodo sacar da classe pai
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    public void transferir(Conta conta, double valor) {
        this.saldo -= valor;
        conta.saldo += valor;
    }
    public void consultarSaldo () {
        this.saldo = getSaldo();
    }
}
