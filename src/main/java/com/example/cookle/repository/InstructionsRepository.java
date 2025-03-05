package com.example.cookle.repository;

import com.example.cookle.entity.Instructions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructionsRepository extends JpaRepository<Instructions, Long> {
}
