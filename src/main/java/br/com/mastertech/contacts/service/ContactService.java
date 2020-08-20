package br.com.mastertech.contacts.service;

import br.com.mastertech.contacts.dto.User;
import br.com.mastertech.contacts.entity.Contact;
import br.com.mastertech.contacts.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> findAllByUser(String user) {
        return contactRepository.findAllByUser(user);
    }

    public Contact saveContact(Contact contact, User user) {
        contact.setUser(user.getName());
        return contactRepository.save(contact);
    }
}
