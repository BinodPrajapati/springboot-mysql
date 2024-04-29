package com.example.springbootwithmysql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootwithmysql.model.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
