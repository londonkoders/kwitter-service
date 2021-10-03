package com.londonkoders.kwitter.kweet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KweetRepository extends JpaRepository<Kweet, Long> {

    Optional<Kweet> findById(long id);
    List<Kweet> findAll();

}
