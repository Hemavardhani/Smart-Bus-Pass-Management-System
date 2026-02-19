package com.buspass.buspass.controller;

import com.buspass.buspass.entity.BusPass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.buspass.buspass.repository.BusPassRepository;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/pass")
public class BusPassController {


    @Autowired
    private BusPassRepository repo;

    @PostMapping("/apply")
    public BusPass apply(@RequestBody BusPass pass) {
        pass.setStatus("PENDING");
        return repo.save(pass);
    }

    @GetMapping("/all")
    public List<BusPass> getAll() {
        return repo.findAll();
    }

    @PutMapping("/approve/{id}")
    public BusPass approve(@PathVariable Long id) {
        BusPass pass = repo.findById(id).get();
        pass.setStatus("APPROVED");
        pass.setExpiryDate(LocalDate.now().plusMonths(3));
        return repo.save(pass);
    }
}
