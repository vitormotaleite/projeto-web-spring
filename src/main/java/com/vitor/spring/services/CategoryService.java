package com.vitor.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitor.spring.entities.Category;
import com.vitor.spring.repositories.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

     public Category findCategoryById(Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
