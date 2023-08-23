package com.jvw.ticket.repositories.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.jvw.ticket.models.Ticket;
import com.jvw.ticket.repositories.TicketCustomRepository;

@Repository
public class TicketCustomRepositoryImpl implements TicketCustomRepository {
	
	private final EntityManager em;
	
	public TicketCustomRepositoryImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Ticket> findByMesAno(Integer mes, Integer ano) {
		try {
			String query = "SELECT * "
					+ " FROM ticket "
					+ " WHERE EXTRACT(MONTH FROM data_abertura) = " + mes + " AND EXTRACT(YEAR FROM data_abertura) = " + ano;
			
			return em.createNativeQuery(query, Ticket.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Ticket>();
		}
	}
}
