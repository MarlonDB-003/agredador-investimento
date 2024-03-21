package br.com.marlonsilva.service;

import java.time.Instant;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marlonsilva.agredadorinvestimento.dto.CreateUserDto;
import br.com.marlonsilva.agredadorinvestimento.entity.UserEntity;
import br.com.marlonsilva.agredadorinvestimento.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUserDto createUserDto){
        var entity = new UserEntity(
            UUID.randomUUID(), 
            createUserDto.username(), 
            createUserDto.email(), 
            createUserDto.password(), 
            Instant.now(), 
            null
            );

        var userSaved = userRepository.save(entity);

        return userSaved.getUserId();
    }


}
