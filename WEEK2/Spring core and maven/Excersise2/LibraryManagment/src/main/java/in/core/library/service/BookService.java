package in.core.library.service;

import in.core.library.repositry.BookRepository;

public class BookService {

    private BookRepository bookRepo;

    public BookService(BookRepository bookRepo){
        this.bookRepo = bookRepo;
    }
    public void service(){
        bookRepo.repository();
        System.out.println("Book service");
    }
}
