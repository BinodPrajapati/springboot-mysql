package com.example.springbootwithmysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootwithmysql.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
