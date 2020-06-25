package com.estudos.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.workshopmongo.domain.User;
import com.estudos.workshopmongo.repository.UserRepository;
import com.estudos.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repositorio;
	
	public List<User> findAll(){
		return repositorio.findAll();
	}
	
	public User findById(String id) {
	
		Optional<User> user = repositorio.findById(id);
			
		if(!user.isPresent()) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		
		return user.get();
	}
}
