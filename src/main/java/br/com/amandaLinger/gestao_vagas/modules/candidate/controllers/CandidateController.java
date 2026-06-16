package br.com.amandaLinger.gestao_vagas.modules.candidate.controllers;

import br.com.amandaLinger.gestao_vagas.modules.candidate.CandidateEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create( @RequestBody CandidateEntity candidate ) {
        System.out.println(candidate);
        System.out.println(candidate.getEmail());
    }
}
