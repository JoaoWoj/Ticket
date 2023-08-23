package com.jvw.ticket.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvw.ticket.models.Ticket;
import com.jvw.ticket.models.TicketRetorno;
import com.jvw.ticket.services.TicketService;

@RestController
@RequestMapping("/api")
public class APIController {
	
	@Autowired
	public TicketService ticketService;
	
	private Logger LOGGER = LoggerFactory.getLogger(APIController.class);
	
	@GetMapping("/")
	public String testeRequisicaoAPI() {
		return "OK!";
	}
	
	@GetMapping("/listarTickets/mes={mes}&ano={ano}")
	public TicketRetorno listarTickets(@PathVariable Integer mes, @PathVariable Integer ano) {
		try {
			TicketRetorno retorno = new TicketRetorno();
			retorno = ticketService.listarTickets(mes, ano);
			
			return retorno;
		} catch (Exception e) {
			LOGGER.error("Não foi possível Listar os tickets." + e.getMessage());
			return null;
		}
	}
	
	@PostMapping("/criarTicket")
	public String criarTicket(@RequestBody Ticket ticket) {
		try {
			String retorno = "";
			retorno = ticketService.criarTicket(ticket);
			return retorno;
		} catch (Exception e) {
			LOGGER.error("Não foi possível criar ticket." + e.getMessage());
			return "Não foi possível criar o ticket!";
		}
	}

}
