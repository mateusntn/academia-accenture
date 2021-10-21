package br.person.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.person.entity.Person;
import br.person.repository.PersonRepository;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository _personRepository;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<Person> Get() {
        return _personRepository.findAll();
    }

    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public ResponseEntity<Person> GetById(@PathVariable(value = "id") long id)
    {
        Optional<Person> person = _personRepository.findById(id);
        if(person.isPresent())
            return new ResponseEntity<Person>(person.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/person", method =  RequestMethod.POST)
    public Person Post(@Valid @RequestBody Person person)
    {
        return _personRepository.save(person);
    }

    @RequestMapping(value = "/person/{id}", method =  RequestMethod.PUT)
    public ResponseEntity<Person> Put(@PathVariable(value = "id") long id, @Valid @RequestBody Person newPerson)
    {
        Optional<Person> oldPerson = _personRepository.findById(id);
        if(oldPerson.isPresent()){
            Person person = oldPerson.get();
            person.setName(newPerson.getName());
            _personRepository.save(person);
            return new ResponseEntity<Person>(person, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/person/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id)
    {
        Optional<Person> person = _personRepository.findById(id);
        if(person.isPresent()){
            _personRepository.delete(person.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}