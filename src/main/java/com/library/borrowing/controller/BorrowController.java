package com.library.borrowing.controller;


import com.library.borrowing.entity.BorrowingRecord;
import com.library.borrowing.model.Book;
import com.library.borrowing.service.IBorrowingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "borrow")
public class BorrowController {
    @Autowired
    IBorrowingRecordService borrowingRecordService;

    /**
     * This API used to borrow books
     *
     * @param book
     * @return Book
     */
    @PostMapping(path = "/")
    public BorrowingRecord borrowBook(@RequestBody Book book) {
        String user = "Dummay User";
        return borrowingRecordService.borrowBook(book, user);
    }

    @GetMapping(path = "/book/{bookId}")
    public List<BorrowingRecord> borrowBook(@PathVariable Long bookId) {
        return borrowingRecordService.getBorrowByBookId(bookId);
    }
}
