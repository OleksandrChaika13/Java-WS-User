package org.example.server;

import jakarta.jws.WebService;

@WebService(endpointInterface = "org.example.server.UserService")
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository = new UserRepository();

    @Override
    public User getUser(String name) {
        return userRepository.findUserData(name);
    }

}