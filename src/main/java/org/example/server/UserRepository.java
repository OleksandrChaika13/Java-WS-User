package org.example.server;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static final Map<String, User> users = new HashMap<>();

    static {
        initData();
    }

    private static void initData() {
        User fernando = new User();
        fernando.setName("Fernando Alonso");
        fernando.setPhone("555 555-5555");
        fernando.setAge(42);
        fernando.setGender(Gender.MALE);

        users.put(fernando.getName(), fernando);


        User carlos = new User();
        carlos.setName("Carlos Sainz Jr.");
        carlos.setPhone("444 444-4444");
        carlos.setAge(29);
        carlos.setGender(Gender.MALE);

        users.put(carlos.getName(), carlos);


        User susie = new User();
        susie.setName("Susie Wolff");
        susie.setPhone("333 333-3333");
        susie.setAge(40);
        susie.setGender(Gender.FEMALE);

        users.put(susie.getName(), susie);
    }

    public User findUserData(String name) {
        return users.get(name);
    }
}