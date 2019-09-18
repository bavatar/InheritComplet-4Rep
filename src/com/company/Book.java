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

    @Override
    public String toString(){
        return  "Code:               " + getCode() + "\n" +
                "Author:             " + getAuthor() + "\n" +
                "Price:              " + getFormattedPrice() + "\n" +
                "Description         " + getDescription() + "\n";
    }

    // create an override of the equals method for the Book subclass.
    @Override
    public boolean equals(Object obj){
        // ?
        boolean test = false;

        if (obj == null){
            return false;
        }

        if (!Product.class.isAssignableFrom(obj.getClass())){
            return false;
        }

        final Book other = (Book)obj;
        if (this.author.equalsIgnoreCase(other.author)){
            test = true;
        }
        return test;
    }
}
