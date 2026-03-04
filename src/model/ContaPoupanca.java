package model;

public class ContaPoupanca extends Conta {
    double TRendimento = 0.085;
    public ContaPoupanca (int numero, Cliente cliente, double saldo) {
        super(numero, cliente, saldo);
    }
    void aplicarRendimento(int saldo, double TRendimento){
        this.saldo += this.saldo * TRendimento;
    }

}
