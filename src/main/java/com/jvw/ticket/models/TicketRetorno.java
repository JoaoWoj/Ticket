package com.jvw.ticket.models;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketRetorno {
	
	private List<Ticket> ticketsRetorno;
	private Map<Object, Long> quantidadePorCliente;
	private List<List<Ticket>> ticketsPorCliente;
	private Map<Object, Long> quantidadePorModulo;
	private List<List<Ticket>> ticketsPorModulo;
	
}
