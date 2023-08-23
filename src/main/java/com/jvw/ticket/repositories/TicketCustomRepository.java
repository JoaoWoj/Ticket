package com.jvw.ticket.repositories;

import java.util.List;

import com.jvw.ticket.models.Ticket;

public interface TicketCustomRepository {
	
	public List<Ticket> findByMesAno(Integer mes, Integer ano);

}
