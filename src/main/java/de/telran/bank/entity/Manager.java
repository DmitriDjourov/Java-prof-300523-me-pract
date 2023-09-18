package de.telran.bank.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Manager {
    private UUID id;
    private String firstName;
    private String lastName;
    private int status;
    private LocalDate createIt;
    private LocalDate updateIt;
    private List<Client> clients;

}
