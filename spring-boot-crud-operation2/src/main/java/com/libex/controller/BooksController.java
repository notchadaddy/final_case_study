package com.libex.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.libex.model.Books;
import com.libex.service.BooksService;
//mark class as Controller
@RestController
public class BooksController 
{

@Autowired
BooksService booksService;

@GetMapping("/getAllBooks")
private List<Books> getAllBooks() 
{
return booksService.getAllBooks();
}

@GetMapping("/getBookById/{bookid}")
private Books getBooks(@PathVariable("bookid") int bookid) 
{
return booksService.getBooksById(bookid);
}

@DeleteMapping("/deleteBook/{bookid}")
private void deleteBook(@PathVariable("bookid") int bookid) 
{
booksService.delete(bookid);
}

@PostMapping("/createBook")
private int saveBook(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books.getBookid();
}

@PutMapping("/updateBook")
private Books update(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books;
}
}
