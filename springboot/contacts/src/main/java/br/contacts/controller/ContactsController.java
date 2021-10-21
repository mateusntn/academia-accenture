package br.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.contacts.model.Contact;
import br.contacts.repository.ContactsRepository;

@Controller
@RequestMapping("/contacts")
public class ContactsController {
	
	@Autowired
	private ContactsRepository contacts;
	
	@GetMapping
	public ModelAndView listar() {
		List<Contact> lista = contacts.findAll();
		
		ModelAndView modelAndView = new ModelAndView("contacts");		
		modelAndView.addObject("contacts", lista);
		
		return modelAndView;
	}
}
