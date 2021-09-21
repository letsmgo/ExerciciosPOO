package br.com.zupExercicio4Aula2;

public class CartaoDeCredito {
    //Dados do cartão
    double limite;
    double saldoDaFatura;
    double valorDasCompras;
    String nomeDoCliente;

    //Método construtor
    public CartaoDeCredito(double limite, double saldoDaFatura, String nomeDoCliente, double valorDasCompras) {
        this.limite = limite;
        this.saldoDaFatura = saldoDaFatura;
        this.nomeDoCliente = nomeDoCliente;
        this.valorDasCompras = valorDasCompras;
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

        if (valorDaCompra < limite) {
            valorDasCompras = limite - valorDaCompra;
        } else {
            System.out.println("Você não tem limite para realizar esta compra. ");
        }
    }
}


