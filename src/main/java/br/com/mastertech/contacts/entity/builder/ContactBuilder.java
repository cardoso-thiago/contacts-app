package br.com.mastertech.contacts.entity.builder;

import br.com.mastertech.contacts.entity.Contact;

public final class ContactBuilder {
    private String name;
    private String phone;
    private String user;

    private ContactBuilder() {
    }

    public static ContactBuilder aContact() {
        return new ContactBuilder();
    }

    public ContactBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ContactBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public ContactBuilder user(String user) {
        this.user = user;
        return this;
    }

    public Contact build() {
        return new Contact(name, phone, user);
    }
}
