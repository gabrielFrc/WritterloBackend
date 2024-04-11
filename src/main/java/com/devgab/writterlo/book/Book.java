package com.devgab.writterlo.book;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "livros")
@Entity(name = "livros")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Book {
  public Book(BookRequestDTO data) {
    this.name = data.name();
    this.categories = data.categories();
    this.price = data.price();
    this.image_url = data.image_url();;
    this.author = data.author();
    this.resumo = data.resumo();
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String[] getCategories() {
    return categories;
  }

  public Integer getPrice() {
    return price;
  }

  public String getImage_url() {
    return image_url;
  }

  public String getAuthor() {
    return author;
  }
  public String getResumo() { return resumo; }

  public void setName(String name) {
    this.name = name;
  }

  public void setCategories(String[] categories) {
    this.categories = categories;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public void setImage_url(String image_url) {
    this.image_url = image_url;
  }
  public void setResumo(String resumo) {
    this.resumo = resumo;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String[] categories;
  private Integer price;
  private String image_url;
  private String author;
  private String resumo;

}
