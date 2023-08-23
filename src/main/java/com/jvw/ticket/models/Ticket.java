package com.jvw.ticket.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ticket")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@ManyToOne
    @JoinColumn(name = "codcliente")
	private Cliente cliente;
	
	@ManyToOne
    @JoinColumn(name = "codmodulo")
	private Modulo modulo;
	
	@Column(name = "data_abertura")
	private Date dataAbertura;
	
	@Column(name = "data_encerramento")
	private Date dataEncerramento;
}
