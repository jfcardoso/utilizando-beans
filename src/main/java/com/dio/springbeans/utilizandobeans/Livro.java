package com.dio.springbeans.utilizandobeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {

    private String nome;
    private  String codigo;

    @Autowired
    private Autor autor;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //a ideia aqui é somente exibir o nome e o código do livro
    public void exibirLivro(){
        System.out.println("Livro: " + this.nome + " - código: " + this.codigo);
        autor.exibirAutor();
    }


}
