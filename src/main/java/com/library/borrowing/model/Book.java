package com.library.borrowing.model;

import lombok.Data;


@Data
public class Book {
    private Long id;
    private String title;
    private String ISBN;
    private BookStatus status;
}

