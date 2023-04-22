package com.example.textsearchapi.service;

import com.example.textsearchapi.entity.Document;
import com.example.textsearchapi.repository.DocumentRepository;

import com.example.textsearchapi.specification.DocumentSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    @Cacheable(value = "searchCache", key = "#keywords")
    public List<Document> searchDocuments(String keywords) {
        String[] keywordArray = keywords.split(" ");
        Specification<Document> spec = Specification.where(null);

        for (String keyword : keywordArray) {
            spec = spec
                    .or(DocumentSpecification.titleContains(keyword))
                    .or(DocumentSpecification.contentContains(keyword));
        }

        return documentRepository.findAll(spec);
    }
}

