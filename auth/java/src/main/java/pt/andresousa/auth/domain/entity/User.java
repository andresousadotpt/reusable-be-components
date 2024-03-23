package pt.andresousa.auth.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

/**
 * This class represents a user.
 */
@Entity
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String username;

    private String password;

    private Roles role;


}
