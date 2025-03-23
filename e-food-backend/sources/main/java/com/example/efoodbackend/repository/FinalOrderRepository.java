package com.example.efoodbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.efoodbackend.model.FinalOrder;
@Repository
public interface FinalOrderRepository extends JpaRepository<FinalOrder, Long>{

}
