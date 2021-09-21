package br.com.zupExercicio3Aula2;

public class Elevador {
    int andarAtual;
    int totalDeAndares = 8;
    int capacidade;
    int qtdpessoasPresentes;

    public Elevador(int andarAtual, int totalDeAndares, int capacidade, int qtdpessoasPresentes) {
        this.andarAtual = andarAtual;
        this.totalDeAndares = totalDeAndares;
        this.capacidade = capacidade;
        this.qtdpessoasPresentes = qtdpessoasPresentes;
    }

    public void entra(int qtdPessoas) {
        int totalViajantes = qtdPessoas + qtdpessoasPresentes;

        if (totalViajantes > capacidade) {
            System.out.println("O elevador não comporta tal quantidade.");
            System.out.println("Quantidade de pessoas que excedeu: " + (totalViajantes - capacidade));

        } else {
            qtdpessoasPresentes = totalViajantes;
        }
    }

    public void sai(int qtdPessoas) {
        int totalViajantes = qtdpessoasPresentes - qtdPessoas;

        if (totalViajantes < 0) {
            System.out.println("O elevador está vázio, não há pessoas para sair. ");
        } else {
            qtdpessoasPresentes = totalViajantes;
        }
    }
    public void sobe(int andarDesejado) {

        if (andarDesejado <= totalDeAndares){
            andarAtual = andarDesejado;
        } else {
            System.out.println("Digite um valor válido de andar.");
        }
    }

    public void desce(int andarDesejado) {

        if (andarDesejado >= andarAtual){
            System.out.println("Para descer, digite um andar abaixo do qual se encontra");
        } else {
            andarAtual = andarDesejado;
        }

    }
}
