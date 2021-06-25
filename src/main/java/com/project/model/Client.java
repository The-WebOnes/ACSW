package com.project.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "client")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient;

    @NotEmpty
    private String clientName;

    @NotEmpty
    private String clientLastName;

    private Integer clientAge;
    @NotEmpty
    @Email
    private String clientEmail;
}
