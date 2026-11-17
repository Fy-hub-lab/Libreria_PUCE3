package com.puce.libreria.repository;

import com.puce.libreria.entity.libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LibroRepository extends JpaRepository<libro, Long> {
}
