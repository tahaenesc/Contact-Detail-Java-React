package io.contact.repo;

import io.contact.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactRepo extends JpaRepository<Contact, String> {
    Optional<Contact> findById(String id);



}
