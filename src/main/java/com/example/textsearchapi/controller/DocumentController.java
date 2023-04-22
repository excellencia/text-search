package com.example.textsearchapi.controller;

import com.example.textsearchapi.entity.Document;
import com.example.textsearchapi.repository.DocumentRepository;
import com.example.textsearchapi.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @Autowired
    private DocumentRepository documentRepository;

    @PostMapping
    public Document addDocument(@RequestBody Document document) {
        return documentRepository.save(document);
    }

    @GetMapping("/search")
    public List<Document> searchDocuments(@RequestParam("keywords") String keywords) {
        return documentService.searchDocuments(keywords);
    }
}

