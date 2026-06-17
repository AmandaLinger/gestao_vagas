package br.com.amandaLinger.gestao_vagas.modules.company.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //cria um contrutor sem precisar escrever
public class AuthCompanyDTO {
    private String password;
    private String username;
}
