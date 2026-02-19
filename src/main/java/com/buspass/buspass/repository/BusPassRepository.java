package com.buspass.buspass.repository;

import com.buspass.buspass.entity.BusPass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BusPassRepository extends JpaRepository<BusPass, Long> {
        List<BusPass> findByUserId(Long userId);
    }


