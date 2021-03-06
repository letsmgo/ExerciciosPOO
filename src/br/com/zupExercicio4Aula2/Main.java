package br.com.zupExercicio4Aula2;

public class Main {
    public static void main(String[] args) {
        CartaoDeCredito cartao = new CartaoDeCredito(3000,0,"Let Marçal Matias",0);

        //Aumentando o limite do cartão
        System.out.println("Limite atual: ");
        System.out.println(cartao.limite);
        cartao.aumentaLimite(200);
        System.out.println("Limite após o aumento: ");
        System.out.println(cartao.limite);

        //Diminuindo o limite do cartão
        System.out.println("\nLimite atual: ");
        System.out.println(cartao.limite);
        cartao.diminuiLimite(150);
        System.out.println("Limite após a redução: ");
        System.out.println(cartao.limite);

        //Realizando uma compra
        cartao.realizaCompras(100);
        System.out.println("Seu limite atual após esta compra é: ");
        System.out.println(cartao.limite);

        //Realizando uma compra
        cartao.realizaCompras(300);
        System.out.println("Seu limite atual após esta compra é: ");
        System.out.println(cartao.limite);

    }
}
