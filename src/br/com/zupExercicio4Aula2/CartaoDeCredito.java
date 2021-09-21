package br.com.zupExercicio4Aula2;

public class CartaoDeCredito {
    //Dados do cartão
    double limite;
    double saldoDaFatura;
    String nomeDoCliente;

    //Método construtor
    public CartaoDeCredito(double limite, double saldoDaFatura, String nomeDoCliente) {
        this.limite = limite;
        this.saldoDaFatura = saldoDaFatura;
        this.nomeDoCliente = nomeDoCliente;
    }

    //Método para aumentar o limite do cartão
    public void aumentaLimite(double valorDesejadoDeAumento) {
        limite = limite + valorDesejadoDeAumento;
    }

    //Método para diminuir o limite
    public void diminuiLimite(double valorDesejadoDeReducao) {
        limite = limite - valorDesejadoDeReducao;
    }

    //Método para compras
    public void realizaCompras(double valorDaCompra) {

    }
}


