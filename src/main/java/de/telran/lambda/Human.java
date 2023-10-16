package de.telran.lambda;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Human extends Person{
    int sex;

    public Human(String name, int age, int sex) {
        super(name, age);
        this.sex = sex;
    }
}
