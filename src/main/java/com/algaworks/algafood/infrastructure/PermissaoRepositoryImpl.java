package com.algaworks.algafood.infrastructure;

import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class PermissaoRepositoryImpl implements PermissaoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Permissao> listar(){
        return  manager.createQuery(" from FormaPagamento", Permissao.class).getResultList();
    }

    @Transactional
    @Override
    public Permissao salvar(Permissao permissao){
        return manager.merge(permissao);
    }

    @Transactional
    @Override
    public void remover(Permissao permissao){
        permissao = buscar(permissao.getId());
        manager.remove(permissao);
    }

    @Override
    public Permissao buscar(Long id){
        return manager.find(Permissao.class, id);
    }
}
