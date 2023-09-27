package de.telran.bank.entity;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@AllArgsConstructor
@Data
public class Client {
    private final UUID id = UUID.randomUUID();
    private String firstName;
    private String lastName;
    private int status;
    private String taxCode;
    private String email;
    private String address;
    private String phone;
    private LocalDate createIt;
    private Manager manager;

}
