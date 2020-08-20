package br.com.mastertech.contacts.controller;

import br.com.mastertech.contacts.dto.ContactRequest;
import br.com.mastertech.contacts.dto.User;
import br.com.mastertech.contacts.entity.Contact;
import br.com.mastertech.contacts.mapper.ContactMapper;
import br.com.mastertech.contacts.service.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class ContactsController {

    private final ContactService contactService;

    public ContactsController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contatos")
    public ResponseEntity get(@AuthenticationPrincipal User user) {
        List<Contact> contact = contactService.findAllByUser(user.getName());
        List<ContactRequest> contactRequests = ContactMapper.INSTANCE.contactToContactRequest(contact);
        return contact.isEmpty() ? ResponseEntity.noContent().build() :ResponseEntity.ok(contactRequests);
    }

    @PostMapping("/contato")
    public ResponseEntity post(@AuthenticationPrincipal User user, @RequestBody ContactRequest contactRequest) {
        Contact savedContact = contactService.saveContact(ContactMapper.INSTANCE.contactRequestToContact(contactRequest), user);
        return ResponseEntity.created(URI.create("")).body(ContactMapper.INSTANCE.contactToContactRequest(savedContact));
    }
}
