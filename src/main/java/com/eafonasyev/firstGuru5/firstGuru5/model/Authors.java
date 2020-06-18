package com.eafonasyev.firstGuru5.firstGuru5.model;

import com.eafonasyev.firstGuru5.firstGuru5.model.Books;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Books> books = new HashSet<>();

    public Authors() {
    }

    public Authors(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Authors(String firstName, String lastName, Set<Books> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }

    /*
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Books> books = new HashSet<>();

    public Authors() {
    }

    public Authors(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Authors(String firstName, String lastName, Set<Books> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }*/
}