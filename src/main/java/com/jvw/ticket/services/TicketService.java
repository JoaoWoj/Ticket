package com.jvw.ticket.services;

import org.springframework.stereotype.Service;

import com.jvw.ticket.models.Ticket;
import com.jvw.ticket.models.TicketRetorno;

@Service
public interface TicketService {
	
	public TicketRetorno listarTickets(Integer mes, Integer ano);
	
	public String criarTicket(Ticket ticket);

}
