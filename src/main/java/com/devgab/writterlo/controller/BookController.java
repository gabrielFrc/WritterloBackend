package com.devgab.writterlo.controller;

import com.devgab.writterlo.book.Book;
import com.devgab.writterlo.book.BookRepository;
import com.devgab.writterlo.book.BookRequestDTO;
import com.devgab.writterlo.book.BookResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

  @Autowired
  private BookRepository bookRepository;
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @PostMapping("/read")
  public void saveBook(@RequestBody BookRequestDTO data){
    Book bookData = new Book(data);
    bookRepository.save(bookData);
    return;
  }
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @GetMapping("/read")
  public List<BookResponseDTO> getAll(){

    List<BookResponseDTO> bookList = bookRepository.findAll().stream().map(BookResponseDTO::new).toList();
    return bookList;
  }

  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @PatchMapping("/write/edit/{id}")
  public void partialUpdateBook(@PathVariable Long id, @RequestBody BookRequestDTO partialData){
    Optional<Book> optionalBook = bookRepository.findById(id);

    if(optionalBook.isPresent()) {
      Book book = optionalBook.get();
      if (partialData.name() != null) {
        book.setName(partialData.name());
      }
      if (partialData.categories() != null) {
        if (partialData.categories().length > 0) {
          book.setCategories(partialData.categories());
        }
      }
      if (partialData.price() != null){
        book.setPrice(partialData.price());
      }
      if (partialData.image_url() != null){
        book.setImage_url(partialData.image_url());
      }
      if (partialData.author() != null){
        book.setAuthor(partialData.author());
      }
      if (partialData.resumo() != null){
        book.setResumo(partialData.resumo());
      }

      bookRepository.save(book);
      return;
    }
  }
}
