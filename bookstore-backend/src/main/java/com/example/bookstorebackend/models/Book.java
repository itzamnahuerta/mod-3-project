package com.example.bookstorebackend.models;

import javax.persistence.*;

// attach an entity annotation to connect to our database
// but first add something to our pom.xlm
@Entity
@Table(name="books")
public class Book {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;

    @Column
    private String author;

    @Column
    private String plotSummary;

    @Column
    private String publishingHouse;

    @Column
    private String genre;

    @Column
    private String coverImg;

    @Column
    private Double price;

    public Book() {

    }
    // shortcut to build constructor: command n => constructor => shift highlight => enter
//    public Book(String title, String author, String plotSummary, String publishingHouse, String genre, String coverImg, Double price) {
//        this.title = title;
//        this.author = author;
//        this.plotSummary = plotSummary;
//        this.publishingHouse = publishingHouse;
//        this.genre = genre;
//        this.coverImg = coverImg;
//        this.price = price;
//    }
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
