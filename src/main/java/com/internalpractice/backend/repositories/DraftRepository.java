package com.internalpractice.backend.repositories;

import com.internalpractice.backend.entities.Draft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DraftRepository extends JpaRepository<Draft,Long> {
}
