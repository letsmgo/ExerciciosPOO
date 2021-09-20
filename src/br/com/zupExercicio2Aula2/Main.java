package br.com.zupExercicio2Aula2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaNova = new ContaBancaria("010203-4", "Let Marçal", 1000);

        System.out.println("Sua conta bancária possui os seguintes dados: ");
        contaNova.extrato();
        System.out.println("----------------------------------------------------------------------------------");

        //Realizando saque
        System.out.println("\nVocê realizou um saque na conta!");
        contaNova.saquerealizado(500);
        contaNova.extrato();

        //Depositando um valor
        System.out.println("\nVocê realizou um depoisto na conta!");
        contaNova.depositar(1500);
        contaNova.extrato();
        System.out.println("----------------------------------------------------------------------------------");

        //Reexibindo valores corrigidos após as transações
        System.out.println("Após os saques e depositos realizados no dia de hoje, sua conta consta com os seguintes" +
                "dados: ");
        contaNova.extrato();

    }
}
