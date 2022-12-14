package io.clinicalresearch.demos.repository;

import io.clinicalresearch.demos.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
