package com.sistemaifnmg.sistemaifnmg.Repository;

import com.sistemaifnmg.sistemaifnmg.Models.Role;
import org.springframework.data.repository.CrudRepository;



public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
