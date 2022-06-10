package com.projeto.p2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.projeto.p2.Data.DetalheUsuario;
import com.projeto.p2.model.Usuario;
import com.projeto.p2.repository.UsuarioRepository;

@Service
public class CreateUsuarioService {
	
	//Criação de usuario e dando Encode na senha
	
	 	@Autowired
	 	UsuarioRepository ur;

	private BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		}
	
		  public Usuario execute(Usuario usuario) {

		    Usuario existsUser = ur.findByLogin(usuario.getUsername());

		    if (existsUser != null) {
		      throw new Error("User already exists!");
		    }

		    usuario.setPassword(passwordEncoder().encode(usuario.getUsername()));
		    
		    Usuario createdUser = ur.save(usuario);

		    return createdUser;
		  }
}
