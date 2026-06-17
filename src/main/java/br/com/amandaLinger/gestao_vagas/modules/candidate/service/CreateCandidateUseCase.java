package br.com.amandaLinger.gestao_vagas.modules.candidate.service;

import br.com.amandaLinger.gestao_vagas.exceptions.UserFoundException;
import br.com.amandaLinger.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.amandaLinger.gestao_vagas.modules.candidate.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service()
public class CreateCandidateUseCase {
    @Autowired //fala para o spring que ele deve gerenciar
    private CandidateRepository candidateRepository; //camando o repositorio

    public CandidateEntity execute(CandidateEntity candidateEntity) {
        this.candidateRepository
                .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });
        return this.candidateRepository.save(candidateEntity);
    }
}
