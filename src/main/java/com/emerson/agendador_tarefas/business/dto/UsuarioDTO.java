package com.emerson.agendador_tarefas.business.dto; // Define o pacote onde essa classe está localizada

// Importação das anotações do Lombok para reduzir código repetitivo

import lombok.*;

import java.util.List;

@Getter // Gera automaticamente os métodos "get" para todos os atributos da classe
@Setter // Gera automaticamente os métodos "set" para todos os atributos da classe
@AllArgsConstructor // Gera automaticamente um construtor com todos os atributos
@NoArgsConstructor // Gera automaticamente um construtor sem parâmetros
@Builder // Permite usar o padrão Builder para criar objetos dessa classe

public class UsuarioDTO { // Declaração da classe UsuarioDTO (Data Transfer Object)


    private String email; // Armazena o e-mail do usuário
    private String senha; // Armazena a senha do usuário

}
