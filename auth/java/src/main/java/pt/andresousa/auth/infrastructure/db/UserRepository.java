package pt.andresousa.auth.infrastructure.db;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.andresousa.auth.domain.entity.User;

import java.util.UUID;

/**
 * This interface represents the repository for the user entity.
 * Data Access Layer
 */
public interface UserRepository extends JpaRepository<User, UUID> {

}