package com.sistemaifnmg.sistemaifnmg.Repository;

import com.sistemaifnmg.sistemaifnmg.Models.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository <Usuario, Long> {
    Usuario findByUsername(String username);
}
