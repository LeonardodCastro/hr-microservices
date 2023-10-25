package com.company.hrworker.resource;

import com.company.hrworker.entities.Worker;
import com.company.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/workers")
public class WorkerResource {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> workerList = workerRepository.findAll();
        return ResponseEntity.ok(workerList);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        Worker worker = workerRepository.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}
