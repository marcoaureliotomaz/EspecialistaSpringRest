package com.algaworks.algafood.infrastructure;

import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<FormaPagamento> listar(){
        return  manager.createQuery(" from FormaPagamento", FormaPagamento.class).getResultList();
    }

    @Transactional
    @Override
    public FormaPagamento salvar(FormaPagamento formaPagamento){
        return manager.merge(formaPagamento);
    }

    @Transactional
    @Override
    public void remover(FormaPagamento formaPagamento){
        formaPagamento = buscar(formaPagamento.getId());
        manager.remove(formaPagamento);
    }

    @Override
    public FormaPagamento buscar(Long id){
        return manager.find(FormaPagamento.class, id);
    }
}
