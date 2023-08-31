package com.library.borrowing.service;

import com.library.borrowing.entity.BorrowingRecord;
import com.library.borrowing.model.Book;

import java.util.List;

public interface IBorrowingRecordService {

    BorrowingRecord borrowBook(Book book, String user) throws RuntimeException;

    List<BorrowingRecord> getBorrowByBookId(Long bookId);

}
