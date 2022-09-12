package com.algaworks.algafood.di.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void clienteAtivadolistener(ClienteAtivadoEvent event){
        System.out.println("Emitindo NF para o cliente" + event.getCliente().getNome());


    }
}
