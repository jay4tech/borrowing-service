package com.library.borrowing.entity;

import com.library.borrowing.model.Book;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity(name="BORROWING_RECORD")
@Data
public class BorrowingRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Transient
    private Book book;
    private LocalDate borrowingDate;
    private LocalDate returnDate;
    private String user;
    private Long bookId;
}