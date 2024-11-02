package com.apiexamples.payload;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDto {
    private Long id;
    @Size(min =3, max =100,message = "Plesae enter name above 2 letters")
    private String name;
    @Email(message = "Please enter valid email address")
    private String email;
    private String phone;
    private String message;

}