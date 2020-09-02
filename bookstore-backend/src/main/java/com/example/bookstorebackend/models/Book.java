package com.example.bookstorebackend.models;

// attach an entity annotation to connect to our database
// but first add something to our pom.xlm

public class Book {
    private Long id;
    private String title;
    private String author;
    private String plotSummary;
    private String publishingHouse;
    private String genre;
    private String coverImg;
    private Double price;

    // shortcut to build constructor: command n => constructor => shift highlight => enter
    public Book(String title, String author, String plotSummary, String publishingHouse, String genre, String coverImg, Double price) {
        this.title = title;
        this.author = author;
        this.plotSummary = plotSummary;
        this.publishingHouse = publishingHouse;
        this.genre = genre;
        this.coverImg = coverImg;
        this.price = price;
    }
    // shortcut type "get" and "set"
    public String getTitle() {
        // getter
        return title;
    }

    public void setTitle(String title) {
        // setter
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPlotSummary() {
        return plotSummary;
    }

    public void setPlotSummary(String plotSummary) {
        this.plotSummary = plotSummary;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
}
