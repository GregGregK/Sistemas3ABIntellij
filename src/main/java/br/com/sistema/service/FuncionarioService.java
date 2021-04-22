package br.com.sistema.service;


import br.com.sistema.model.Funcionario;

import java.util.List;

//Camada de serviço
//Nessa interface criamos as assinaturas dos métodos
public interface FuncionarioService {

    public Funcionario findById(Long id);
    public List<Funcionario> findAll();

    //Metodos save e delete
    public boolean save(Funcionario funcionario);
    public boolean delete(Funcionario funcionario);
}

