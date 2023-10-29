package com.company.hruser.resources;

import com.company.hruser.entities.User;
import com.company.hruser.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {
    @Autowired
    private UserRepository workerRepository;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){

        User user = workerRepository.findById(id).get();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email){
        User user = workerRepository.findByEmail(email);
        return ResponseEntity.ok(user);
    }
}
