package br.com.alura.domain;

public class Pet {
    public Pet(String tipo, String nome, String raca, int idade, String cor, float peso){
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
    }

    private String tipo;
    private String nome;
    private String raca;
    private int idade;
    private String cor;
    private float peso;
}
