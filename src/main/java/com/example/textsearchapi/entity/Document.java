package com.example.textsearchapi.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Lob
    private String content;
}

