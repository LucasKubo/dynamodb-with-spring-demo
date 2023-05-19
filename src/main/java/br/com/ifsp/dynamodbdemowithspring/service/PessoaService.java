package br.com.ifsp.dynamodbdemowithspring.service;

import br.com.ifsp.dynamodbdemowithspring.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

}


