package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
//	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
//	@Autowired
//	private Notificador notificador;

	@Autowired
	private ApplicationEventPublisher eventPublisher;



	public void ativar(Cliente cliente) {
		cliente.ativar();
//			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		eventPublisher.publishEvent( new ClienteAtivadoEvent(cliente));
		
	}

}
