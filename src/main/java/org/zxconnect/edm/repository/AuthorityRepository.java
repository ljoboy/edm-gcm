package org.zxconnect.edm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zxconnect.edm.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
