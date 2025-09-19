package com.example.doument_service.service;

import com.example.doument_service.model.DocumentTemplatePackage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.doument_service.repository.*;

@Service
@RequiredArgsConstructor
public class DocumentTemplatePackageService {
    private final DocumentTemplatePackageRepository repository;

    public List<DocumentTemplatePackage> findAll() {
        return repository.findAll();
    }

    public DocumentTemplatePackage save(DocumentTemplatePackage dtp) {
        return repository.save(dtp);
    }

    public DocumentTemplatePackage getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}