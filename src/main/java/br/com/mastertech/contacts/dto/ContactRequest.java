package br.com.mastertech.contacts.dto;

import br.com.mastertech.contacts.dto.builder.ContactRequestBuilder;

public class ContactRequest {
    private String name;
    private String phone;

    public ContactRequest() {
    }

    public ContactRequest(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public static ContactRequestBuilder builder(){
        return ContactRequestBuilder.aContactRequest();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
