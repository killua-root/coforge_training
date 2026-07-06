package com.coforge.day4.assignment.lib_mang_sys;

public class Book {
    int bid;
    String title;
    boolean isIssued;

    Book(int bid, String title) {
        this.bid = bid;
        this.title = title;
        this.isIssued = false;
    }
}