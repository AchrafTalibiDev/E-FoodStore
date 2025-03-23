package com.example.efoodbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.efoodbackend.model.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {

}
