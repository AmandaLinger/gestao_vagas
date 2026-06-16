package br.com.amandaLinger.gestao_vagas.modules.candidate;

import lombok.Data;

import java.util.UUID;

@Data  //usando o lombok para não precisar criar getters e setters
public class CandidateEntity {

    private UUID id;
    private String nome;
    private String username;
    private String email;
    private String description;
    private String curriculum;
}
