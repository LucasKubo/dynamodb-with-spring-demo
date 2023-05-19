package br.com.ifsp.dynamodbdemowithspring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table("pessoa")
public class Pessoa implements Persistable<String> {

    @Id
    private String cpf;
    private String nome;
    private int idade;
    private String endereco;

    @Transient
    private boolean isNew = true;

    @Override
    public String getId() {
        return cpf;
    }

    @Override
    public boolean isNew() {
        return isNew;
    }

    public void setNotNew() {
        isNew = false;
    }
}