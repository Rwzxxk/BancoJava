package model;

public class ContaCorrente extends Conta {
    int limite = 500;
    public ContaCorrente(int numero, Cliente cliente, double saldo) {
        super(numero, cliente, saldo);
    }
    //mettodo da classe filha usando override
    @Override
    public void sacar (double valor) {
        this.saldo = valor + limite;
    }
    @Override
    public void depositar (double valor) {
        this.saldo += valor + limite;
    }




}
