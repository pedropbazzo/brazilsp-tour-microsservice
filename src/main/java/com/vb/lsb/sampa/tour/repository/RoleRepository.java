package com.vb.lsb.sampa.tour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.vb.lsb.sampa.tour.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(String name);
}
