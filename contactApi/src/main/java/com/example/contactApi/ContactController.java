package com.example.contactApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/contacts")
public class ContactController{
	@Autowired
	private ContactService contactService;
	
	@GetMapping
	public List<Contact> getAll(){
		return contactService.getContacts();
	}
	
	@GetMapping("/{contactId}")
	public Optional<Contact> getById(@PathVariable("contactId") Long contactId){
		return contactService.getContactById(contactId);
	}
	@PostMapping
	public void saveUpdate(@RequestBody Contact contact) {
		System.out.println("Contacto recibido: " + contact.toString());
		contactService.saveOrUpdateContact(contact);
		
	}
	@DeleteMapping("/{contactId}")
	public void delete(@PathVariable("contactId") Long contactId) {
		contactService.deleteContact(contactId);
	}
}
