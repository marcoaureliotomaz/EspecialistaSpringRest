package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {

	@Autowired
	private NotificadorProperties notificadorProperties;

	public  NotificadorEmail() {
		System.out.println("Notificador Email REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("host:" + notificadorProperties.getHostServidor() );
		System.out.println("porta:" +  notificadorProperties.getPortaServidor());
		System.out.printf("Notificando %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
