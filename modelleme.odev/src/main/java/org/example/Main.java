package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book= new Book(1,1,2,1,"2.hamur",12,
                "Suç ve Ceza",687,"12345678",78.00,"ciltsiz",2024);
        System.out.println(book.getId());
        System.out.println(book.getPublisherId());
        System.out.println(book.getCategoryId());
        System.out.println(book.getAuthorId());
        System.out.println(book.getPaperId());
        System.out.println(book.getImageId());
        System.out.println(book.getName());
        System.out.println(book.getNumberOfPages());
        System.out.println(book.getIsbn());
        System.out.println(book.getPrice());
        System.out.println(book.getCover());
        System.out.println(book.getPublicationYear());
    }
}