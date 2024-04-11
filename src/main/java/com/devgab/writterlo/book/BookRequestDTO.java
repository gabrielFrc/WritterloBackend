package com.devgab.writterlo.book;

public record BookRequestDTO(String name, String[] categories, Integer price, String image_url, String author, String resumo) {
}
