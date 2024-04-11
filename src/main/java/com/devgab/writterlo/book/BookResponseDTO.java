package com.devgab.writterlo.book;

import lombok.Getter;

public record BookResponseDTO(Long id, String name, String[] categories, Integer price, String image_url, String author, String resumo) {
  public BookResponseDTO(Book book){
    this(book.getId(), book.getName(), book.getCategories(), book.getPrice(), book.getImage_url(), book.getAuthor(), book.getResumo());
  }
}
