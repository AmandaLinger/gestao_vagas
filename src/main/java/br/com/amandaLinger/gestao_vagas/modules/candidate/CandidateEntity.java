package br.com.amandaLinger.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data  //usando o lombok para não precisar criar getters e setters
public class CandidateEntity {

    private UUID id;
    private String name;

    @NotBlank
    @Pattern(regexp = "\\$+" , message = "O campo [username] não deve conter espaços")
    private String username;

    @Email(message="O campo [email] deve conter um e-mail válido") //faz a validação para verificar se realmente está sendo digitado um email válido
    private String email;

    @Length(min=8, max=100) //aplicando regra para o tamanho da senha
    private String password;
    private String description;
    private String curriculum;
}
