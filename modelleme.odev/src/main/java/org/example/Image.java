package org.example;

public class Image {
    private int ıd;
    private int bookId;
    private String url;

    public Image() {
    }

    public Image(int ıd, String url,int bookId) {
        this.ıd = ıd;
        this.url = url;
        this.bookId=bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getId() {
        return ıd;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
