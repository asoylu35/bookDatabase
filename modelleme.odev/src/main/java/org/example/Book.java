package org.example;

import java.util.Date;

public class Book {
    private int id;
    private int publisherId;
    private int categoryId;
    private int authorId;
    private String paperId;
    private int imageId;
    private String name;
    private int numberOfPages;
    private String ısbn;
    private double price;
    private String cover;
    private int publicationYear;

    public Book() {

    }

    public Book(int id, int publisherId,int categoryId, int authorId, String paperId, int imageId, String name, int numberOfPages, String ısbn, double price, String cover, int publicationYear) {
        this.id = id;
        this.publisherId = publisherId;
        this.categoryId=categoryId;
        this.authorId = authorId;
        this.paperId = paperId;
        this.imageId = imageId;
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.ısbn = ısbn;
        this.price = price;
        this.cover = cover;
        this.publicationYear = publicationYear;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getIsbn() {
        return ısbn;
    }

    public void setIsbn(String ısbn) {
        this.ısbn = ısbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
