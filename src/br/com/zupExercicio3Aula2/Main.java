package br.com.zupExercicio3Aula2;

public class Main {
    public static void main(String[] args) {
        Elevador elevadorShopping = new Elevador(0,8,10,0);

        System.out.println(elevadorShopping.qtdpessoasPresentes);
        elevadorShopping.entra(5);
        System.out.println(elevadorShopping.qtdpessoasPresentes);
        elevadorShopping.sai(5);

        elevadorShopping.sobe(7);
        System.out.println(elevadorShopping.andarAtual);

        elevadorShopping.desce(5);
        System.out.println(elevadorShopping.andarAtual);
    }
}
