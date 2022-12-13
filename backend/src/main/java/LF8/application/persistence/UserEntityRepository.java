package LF8.application.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByFirstNameAndLastName(String firstName, String lastName);
    Optional<UserEntity> findByMail(String mail);
    boolean existsByEmail(String email);
}
