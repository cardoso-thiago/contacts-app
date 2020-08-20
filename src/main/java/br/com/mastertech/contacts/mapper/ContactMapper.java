package br.com.mastertech.contacts.mapper;

import br.com.mastertech.contacts.dto.ContactRequest;
import br.com.mastertech.contacts.entity.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactMapper {
    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);

    Contact contactRequestToContact(ContactRequest contactRequest);
    ContactRequest contactToContactRequest(Contact contact);
    List<ContactRequest> contactToContactRequest(List<Contact> contact);
}
