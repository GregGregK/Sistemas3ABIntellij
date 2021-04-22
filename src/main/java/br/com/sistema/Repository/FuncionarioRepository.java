package br.com.sistema.Repository;

import br.com.sistema.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

//Classe que irá gerenciar o objeto Funcionário no Banco de Dados
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}