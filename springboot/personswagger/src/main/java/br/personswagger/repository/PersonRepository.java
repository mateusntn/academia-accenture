package br.personswagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.personswagger.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> { 
	
}