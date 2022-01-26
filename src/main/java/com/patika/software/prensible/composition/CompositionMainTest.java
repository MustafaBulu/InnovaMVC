package com.patika.software.prensible.composition;

import java.util.ArrayList;

public class CompositionMainTest {

    public static void main(String[] args) {
        Author author= new Author();
        author.setAuthorName("Mustafa");
        author.setAuthorSurname("Bulu");
        author.setBookList(new ArrayList<>()); //null pointer exception

        System.out.println(author);

        Book book = new Book();
        book.setBookName("BookName 1");
        book.setBookPrice("25");
        book.setAuthor(author);
        book.getAuthor().getBookList().add(book);

        Book book2 = new Book();
        book2.setBookName("BookName 2");
        book2.setBookPrice("35");
        book2.setAuthor(author);
        book2.getAuthor().getBookList().add(book2);

        System.out.println(book);
        System.out.println(book2);
    }
}
