package br.com.zupExercicio3Aula2;

public class Elevador {
    int andarAtual = 0;
    int totalDeAndares;
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

    public void sai() {

    }

    public void sobe() {

    }

    public void desce() {

    }
}
