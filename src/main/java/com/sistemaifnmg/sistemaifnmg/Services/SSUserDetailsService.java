package com.sistemaifnmg.sistemaifnmg.Services;

import com.sistemaifnmg.sistemaifnmg.Models.Usuario;
import com.sistemaifnmg.sistemaifnmg.Repository.UsuarioRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.Set;

@Transactional
@Service
public class SSUserDetailsService implements UserDetailsService {

    private UsuarioRepository ur;

    public SSUserDetailsService(UsuarioRepository usuarioRepository) {
        this.ur = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            Usuario usuario = ur.findByUsername(username);
            if (usuario == null) {
                return null;
            }
            return new org.springframework.security.core.userdetails.User(usuario.getUsername(), usuario.getSenha(), getAuthories(usuario));
        } catch (Exception e) {
            throw  new UsernameNotFoundException("Usuário não Encontrado!");
        }
    }
    private Set<GrantedAuthority> getAuthories(Usuario usuario){
        Set<GrantedAuthority> authorities  = new HashSet<>();
        for (Role role: usuario.getRoles()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRoleName());
            authorities.add(grantedAuthority);
        }
        return authorities;
    }
}
