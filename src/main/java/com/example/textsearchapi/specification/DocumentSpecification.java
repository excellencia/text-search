package com.example.textsearchapi.specification;


import com.example.textsearchapi.entity.Document;
import org.springframework.data.jpa.domain.Specification;

public class DocumentSpecification {

    public static Specification<Document> titleContains(String keyword) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(criteriaBuilder.lower(root.get("title")), "%" + keyword.toLowerCase() + "%");
    }

    public static Specification<Document> contentContains(String keyword) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(criteriaBuilder.lower(root.get("content")), "%" + keyword.toLowerCase() + "%");
    }
}

