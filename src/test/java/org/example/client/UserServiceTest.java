package org.example.client;

import org.example.client.generated.Gender;
import org.example.client.generated.User;
import org.example.client.generated.UserService;
import org.example.client.generated.UserServiceImplService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    static UserServiceImplService service;
    static UserService userService;

    @BeforeAll
    static void setup() {
        service = new UserServiceImplService();
        userService = service.getUserServiceImplPort();
    }

    @Test
    void givenUserService_whenFindByNameFernandoAlonso_thenGetUser() {
        User fernando = userService.getUser("Fernando Alonso");
        assertEquals("555 555-5555", fernando.getPhone());
        assertEquals(42, fernando.getAge());
        assertEquals(Gender.MALE, fernando.getGender());
    }

    @Test
    void givenUserService_whenFindByNameCarlosSainz_thenGetUser() {
        User carlos = userService.getUser("Carlos Sainz Jr.");
        assertEquals("444 444-4444", carlos.getPhone());
        assertEquals(29, carlos.getAge());
        assertEquals(Gender.MALE, carlos.getGender());
    }

    @Test
    void givenUserService_whenFindByNameSusieWolff_thenGetUser() {
        User susie = userService.getUser("Susie Wolff");
        assertEquals("333 333-3333", susie.getPhone());
        assertEquals(40, susie.getAge());
        assertEquals(Gender.FEMALE, susie.getGender());
    }
}