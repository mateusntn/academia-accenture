package br.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.contacts.model.Contact;

public interface ContactsRepository extends JpaRepository<Contact, Long> {
    
}
