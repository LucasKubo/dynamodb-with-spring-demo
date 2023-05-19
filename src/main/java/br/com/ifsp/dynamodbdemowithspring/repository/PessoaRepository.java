package br.com.ifsp.dynamodbdemowithspring.repository;

import br.com.ifsp.dynamodbdemowithspring.model.Pessoa;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, String> {
}