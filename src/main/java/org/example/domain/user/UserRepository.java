package org.example.domain.user;

public interface UserRepository {
    public void save (User user);
    public User[] findAll();
}
