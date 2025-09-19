package com.example.doument_service.service;

import com.example.doument_service.model.DocumentTemplatePackage;
import com.example.doument_service.model.Property;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.doument_service.repository.*;

@Service
@RequiredArgsConstructor
public class PropertyService {
    private final PropertyRepository repository;

    public List<Property> findAll() {
        return repository.findAll();
    }

    public Property save(Property dtp) {
        return repository.save(dtp);
    }

    public Property getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}