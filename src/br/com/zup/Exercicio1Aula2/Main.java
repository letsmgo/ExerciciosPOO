package br.com.zup.Exercicio1Aula2;

public class Main {
    public static void main(String[] args) {
        //Instanciando o carro no Main
        Carro modeloDoCarro = new Carro("Jetta",10,"Volkswagen","Preto",55000);

        System.out.println("\nO modelo selecionado encontra-se com os seguintes parâmetros: ");
        modeloDoCarro.mostrarDados();

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("\nApós as mudanças selecionadas o modelo encontra-se com os seguintes parâmetros: ");

        modeloDoCarro.darDesconto(5000);
        modeloDoCarro.pintar("Branco");
        modeloDoCarro.mostrarDados();
    }
}
