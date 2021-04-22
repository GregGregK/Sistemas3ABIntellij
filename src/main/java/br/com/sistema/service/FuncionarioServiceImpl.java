package br.com.sistema.service;


import br.com.sistema.Repository.FuncionarioRepository;
import br.com.sistema.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{

    @Override
    public Funcionario findById(Long id){
        return null;
    }

    @Autowired
    FuncionarioRepository funcionarioRepository;
    @Override
    public List<Funcionario> findAll(){
        return funcionarioRepository.findAll();
    }

    @Override
    public boolean save(Funcionario funcionario) {
        return false;
    }

    @Override
    public boolean delete(Funcionario funcionario) {
        return false;
    }


}
