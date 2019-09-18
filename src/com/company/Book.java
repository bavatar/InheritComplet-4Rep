package com.company;

public class Book extends Product{

    private String author;
    private int pages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString(){
        return  "Code:               " + getCode() + "\n" +
                "Author:             " + getAuthor() + "\n" +
                "Price:              " + getFormattedPrice() + "\n" +
                "Description         " + getDescription() + "\n";
    }
}
