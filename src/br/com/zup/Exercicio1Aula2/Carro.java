package br.com.zup.Exercicio1Aula2;

public class Carro {
    String nomeDoCarro;
    double pesoDoCarro;
    String fabricanteDoCarro;
    String corDoCarro;
    double valorDoCarro;

    //Método construtor do carro
    public Carro(String nomeDoCarro, double pesoDoCarro, String fabricanteDoCarro, String corDoCarro, double valorDoCarro) {
        this.nomeDoCarro = nomeDoCarro;
        this.pesoDoCarro = pesoDoCarro;
        this.fabricanteDoCarro = fabricanteDoCarro;
        this.corDoCarro = corDoCarro;
        this.valorDoCarro = valorDoCarro;
    }

    //Método de visualização de dados do carro
    public void mostrarDados() {
        System.out.println("Fabricante do carro: " + fabricanteDoCarro);
        System.out.println("Modelo do carro selecionado: " + nomeDoCarro);
        System.out.println("Valor do carro selecionado: " + valorDoCarro);
        System.out.println("Cor do carro selecionado: " + corDoCarro);
    }

    //Aplicando valor de desconto no preço do carro
    public void darDesconto(double valorDesconto) {
        valorDoCarro = valorDoCarro - valorDesconto;
    }

    //Alterando a cor do carro
    public void pintar(String corNova) {
        corDoCarro = corNova;
    }

}
