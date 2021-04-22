package br.com.sistema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "funcionario")
public class Funcionario {


    //Define o id como chave primária
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Atributo para o nome, não nulo
    @Size(max = 80)
    @NotNull
    private Long nome;


    //Atributo para o e-mail, não nulo
    @Size(max = 100)
    @NotNull
    private Long email;


    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNome() {
        return nome;
    }

    public void setNome(Long nome) {
        this.nome = nome;
    }

    public Long getEmail() {
        return email;
    }

    public void setEmail(Long email) {
        this.email = email;
    }
    //ToString para imprimir o objeto funcionario

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome=" + nome +
                ", email=" + email +
                '}';
    }
}
