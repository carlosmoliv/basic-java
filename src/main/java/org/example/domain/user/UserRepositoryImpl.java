package org.example.domain.user;

import java.util.HashSet;
import java.util.Set;

public class UserRepositoryImpl implements UserRepository {
    private final Set<User> users;

    public UserRepositoryImpl() {
        this.users = new HashSet<>();
    }

    @Override
    public void save(User user) {
        this.users.add(user);
    }

    public User[] findAll() {
        return this.users.toArray(new User[0]);
    }
}
