package com.example.efoodbackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.efoodbackend.dto.MealTypeDTO;
import com.example.efoodbackend.model.Meal;
import com.example.efoodbackend.model.MealType;

@Service
public interface MealTypeService {
	public List<MealTypeDTO> getAllMealTypes();
	public String isValidInput(MealType mealType);
	public String save(MealType mealType);
	public String editMealType(MealType mealType);
	public MealType findOne(Long id);
	public String delete(Long mealTypeId);
}
