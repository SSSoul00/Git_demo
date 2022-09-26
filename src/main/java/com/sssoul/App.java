package com.sssoul;

import com.sssoul.service.BookService;
import com.sssoul.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
