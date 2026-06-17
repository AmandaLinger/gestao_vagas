package br.com.amandaLinger.gestao_vagas.modules.candidate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import lombok.Data;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Data  //usando o lombok para não precisar criar getters e setters
@Entity(name="candidate")
public class CandidateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    @NotBlank() //garante que o username não seja nulo ou uma string vazia ou contenha espaços
    @Pattern(regexp = "^\\S+$" , message = "O campo [username] não deve conter espaços")
    private String username;

    @Email(message="O campo [email] deve conter um e-mail válido") //faz a validação para verificar se realmente está sendo digitado um email válido
    private String email;

    @Length(min=8, max=100, message = "O campo deve conter de [8] a [100] caracteres") //aplicando regra para o tamanho da senha
    private String password;
    private String description;
    private String curriculum;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
