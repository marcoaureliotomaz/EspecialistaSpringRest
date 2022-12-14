package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class CadastroEstadoService {

    @Autowired
    EstadoRepository estadoRepository;

    public Estado salvar(Estado estado){
       return estadoRepository.save(estado);
    }

    public void excluir(Long id){
        try {
            estadoRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e) {
            throw new EntidadeNaoEncontradaException(String.format("Não existe cadastro de estado com código", id));

        }catch(DataIntegrityViolationException e){
            throw new EntidadeEmUsoException(
                    String.format("Estado de código %d não pode ser removida pois está em uso", id));
        }
    }
}
