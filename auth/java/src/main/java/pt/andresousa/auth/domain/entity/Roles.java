package pt.andresousa.auth.domain.entity;

import java.util.stream.Stream;

/**
 * This class represents the roles that a user can have.
 */
public enum Roles {
    ADMIN("ADMIN"),
    USER("ADMIN"),
    INVALID_ROLE("INVALID_ROLE");

    private final String role;

    Roles(final String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    /**
     * Returns the role from a string.
     * @param role the role as a string
     * @return the role
     */
    public static Roles fromString(final String role) {
        return Stream
                .of(values())
                .filter(r -> r.getRole().equalsIgnoreCase(role))
                .findFirst()
                .orElse(INVALID_ROLE);
    }
}
