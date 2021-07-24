package br.com.dio;

import br.com.dio.model.gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        gato gato = new gato();
        System.out.println(gato);

        String nome;
        int numPags;
        Livro livro = new Livro(nome = "O problema dos 3 corpos", numPags = 300);
        System.out.println(livro);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
}

class Livro{
    private String nome;
    private Integer numPags;

    public Livro(String nome, Integer numPags) {
        this.nome = nome;
        this.numPags = numPags;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPags() {
        return numPags;
    }

    public void setNumPags(Integer numPags) {
        this.numPags = numPags;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPags=" + numPags +
                '}';
    }
}