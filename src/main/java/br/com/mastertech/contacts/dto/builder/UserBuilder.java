package br.com.mastertech.contacts.dto.builder;

import br.com.mastertech.contacts.dto.User;

public final class UserBuilder {
    private Long id;
    private String name;

    private UserBuilder() {
    }

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public User build() {
        return new User(id, name);
    }
}
