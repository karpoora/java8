package com.learning.java.repository;

import com.learning.java.model.entity.Contacts;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by krvh271 on 1/9/18.
 */
@Repository
public interface ContactsRepository extends JpaRepository<Contacts,Long> {
    Optional<Contacts> findById(Long id);
}
