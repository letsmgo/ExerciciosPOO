package br.com.zupExercicio2Aula2;

public class ContaBancaria {
    String numeroDaConta;
    String nomeDoCorrentista;
    double saldoDaConta = 0;

    //Método construtor da Conta bancária
    public ContaBancaria(String numeroDaConta, String nomeDoCorrentista, double saldoDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldoDaConta = saldoDaConta;
    }

    //Método para realizar saques na conta
    public void saquerealizado(double vlrDoSaque) {
        saldoDaConta = saldoDaConta - vlrDoSaque;
    }

    //Método para realizar depósitos na conta
    public void depositar(double vlrDepositado) {
        saldoDaConta = saldoDaConta + vlrDepositado;
    }

    //Método de visualização dos dados
    public void extrato() {
        System.out.println("O número da conta é: " + numeroDaConta);
        System.out.println("O nome do correntista é: " + nomeDoCorrentista);
        System.out.println("O saldo é: R$" + saldoDaConta);
    }
}
