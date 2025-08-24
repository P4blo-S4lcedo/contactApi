package com.example.contactApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService{
	@Autowired
	ContactRepository contactRepository;
	
	public List<Contact> getContacts(){
		return contactRepository.findAll();
	}
	
	public Optional<Contact> getContactById(Long id){
		return contactRepository.findById(id);
	}
	
	public void saveOrUpdateContact(Contact contact) {
		contactRepository.save(contact);
	}
	
	public void deleteContact(Long id) {
		contactRepository.deleteById(id);
	}
	
	
}
