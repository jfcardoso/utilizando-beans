package com.dio.springbeans.utilizandobeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppLivrariaConfig {

    //<bean id="livro" class="com.dio.springbeans.utilizandobeans.Livro" /> versão XML
    @Bean
    public Livro getLivro(){
        return new Livro();
    }

    @Bean
    public Autor getAutor(){
        return new Autor();
    }
}
