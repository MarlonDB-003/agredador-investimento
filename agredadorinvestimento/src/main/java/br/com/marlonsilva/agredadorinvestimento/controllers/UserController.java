package br.com.marlonsilva.agredadorinvestimento.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marlonsilva.agredadorinvestimento.dto.CreateUserDto;
import br.com.marlonsilva.agredadorinvestimento.entity.UserEntity;
import br.com.marlonsilva.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody CreateUserDto createUserDto){
        var userId = userService.createUser(createUserDto);

        return ResponseEntity.created(URI.create("/users/" + userId.toString())).build();
    }

    // @GetMapping("/{userId}")
    // public ResponseEntity<UserController> getUserById(@PathVariable String userId){
        
    //     return null;
    // }

}
