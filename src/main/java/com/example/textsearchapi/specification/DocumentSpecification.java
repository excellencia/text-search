package com.example.textsearchapi.specification;


import com.example.textsearchapi.entity.Document;
import jakarta.persistence.criteria.Expression;
import org.springframework.data.jpa.domain.Specification;

public class DocumentSpecification {

    public static Specification<Document> titleContains(String keyword) {
        return (root, query, criteriaBuilder) -> {
            Expression<String> titleAsLowerCase = criteriaBuilder.lower(root.get("title").as(String.class));
            return criteriaBuilder.like(titleAsLowerCase, "%" + keyword.toLowerCase() + "%");
        };
    }

    public static Specification<Document> contentContains(String keyword) {
        return (root, query, criteriaBuilder) -> {
            Expression<String> contentAsLowerCase = criteriaBuilder.lower(root.get("content").as(String.class));
            return criteriaBuilder.like(contentAsLowerCase, "%" + keyword.toLowerCase() + "%");
        };
    }
}
