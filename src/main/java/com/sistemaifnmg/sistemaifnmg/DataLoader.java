package com.sistemaifnmg.sistemaifnmg;

import com.sistemaifnmg.sistemaifnmg.Models.Role;
import com.sistemaifnmg.sistemaifnmg.Models.Usuario;
import com.sistemaifnmg.sistemaifnmg.Repository.RoleRepository;
import com.sistemaifnmg.sistemaifnmg.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    UsuarioRepository ur;
    @Autowired
    RoleRepository rr;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
    
        rr.save(new Role("USER"));
        rr.save(new Role("ADMIN"));

        Role adminRole = rr.findByRole("ADMIN");
        Role userRole = rr.findByRole("USER");

        Usuario usuario = new Usuario("admin@code.com", passwordEncoder.encode("1234"),"Admin", "Super",true,"admin");
        usuario.setRoles(Arrays.asList(adminRole));
        ur.save(usuario);

        usuario = new Usuario("user@code.com", passwordEncoder.encode("1234"),"User", "Super",true,"user");
        usuario.setRoles(Arrays.asList(userRole));
        ur.save(usuario);

    }
}