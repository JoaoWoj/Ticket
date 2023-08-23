package com.jvw.ticket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jvw.ticket.models.Ticket;

@EnableJpaRepositories
public interface TicketRepository extends JpaRepository<Ticket, Long> {
	
}
