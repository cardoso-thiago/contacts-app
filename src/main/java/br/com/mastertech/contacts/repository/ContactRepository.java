package br.com.mastertech.contacts.repository;

import br.com.mastertech.contacts.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
    List<Contact> findAllByUser(String user);
}
