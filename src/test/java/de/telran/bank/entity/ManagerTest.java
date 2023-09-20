package de.telran.bank.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    public void testCreateManagerToClient() {
        Client client1 = Client.builder()
                .address("TestAdress")
                .phone("+1111111111111")
                .email("test@test.com")
                .firstName("Miron")
                .lastName("Ivanov")
                .status(1)
                .createIt(LocalDate.now())
                .build();
        Client client2 = Client.builder()
                .address("TestAdress2")
                .phone("+2222222222")
                .email("test@test.com")
                .firstName("Elena")
                .lastName("Petrova")
                .status(1)
                .createIt(LocalDate.now())
                .build();

        List<Client> expClients =  Arrays.asList(client1, client2);

        Manager testManager = new Manager("Mikle", "Lunin", 1, LocalDate.now(), LocalDate.now(), expClients);
//        testManager.getClients().add(client1);
//        testManager.getClients().add(client2);

        Assertions.assertEquals(2, testManager.getClients().size());
        Assertions.assertFalse(testManager.getId().toString().isEmpty());
    }


}