package br.com.mastertech.contacts.entity;

import br.com.mastertech.contacts.entity.builder.ContactBuilder;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private String user;

    public Contact() {
    }

    public Contact(String name, String phone, String user) {
        this.name = name;
        this.phone = phone;
        this.user = user;
    }

    public static ContactBuilder builder(){
        return ContactBuilder.aContact();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
