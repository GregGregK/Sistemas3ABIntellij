package br.com.sistema.Repository;

import br.com.sistema.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

//Classe que irá gerenciar o objeto funcionario no banco de dados
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
