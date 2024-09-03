package Conta;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int numeroConta, int numeroCartao, Cliente cliente, int senha, double saldo) {
        super(numeroConta, numeroCartao, cliente, senha, saldo);
    }

    @Override
    public double calculaTributos() {
        return getSaldo() * 0.01;
    }

    private double getSaldo() {
        return super.verificaSaldo(super.getSenha());
    }
}

