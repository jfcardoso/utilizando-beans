package com.dio.springbeans.utilizandobeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppLivraria {

    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppLivrariaConfig.class);

        Livro livro = factory.getBean(Livro.class);
        Autor autor = factory.getBean(Autor.class);

        autor.setNomeAutor("Sylvio Lago Júnior");
        livro.setNome("A Arte da Regência");
        livro.setCodigo("F32D45");

        livro.exibirLivro();
        //autor.exibirAutor();

        

    }
}
