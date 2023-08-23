package com.jvw.ticket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvw.ticket.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
