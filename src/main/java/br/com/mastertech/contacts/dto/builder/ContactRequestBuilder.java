package br.com.mastertech.contacts.dto.builder;

import br.com.mastertech.contacts.dto.ContactRequest;

public final class ContactRequestBuilder {
    private String name;
    private String phone;

    private ContactRequestBuilder() {
    }

    public static ContactRequestBuilder aContactRequest() {
        return new ContactRequestBuilder();
    }

    public ContactRequestBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ContactRequestBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public ContactRequest build() {
        return new ContactRequest(name, phone);
    }
}
