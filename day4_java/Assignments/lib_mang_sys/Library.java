package com.coforge.day4.assignment.lib_mang_sys;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(int bookId, Member member) {
        for (Book b : books) {
            if (b.bid == bookId && !b.isIssued) {
                b.isIssued = true;
                System.out.println(b.title + " issued to " + member.memberName);
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.bid == bookId && b.isIssued) {
                b.isIssued = false;
                System.out.println(b.title + " returned.");
                return;
            }
        }
        System.out.println("Book not found or already returned.");
    }

    public void searchBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + b.title);
                return;
            }
        }
        System.out.println("Book not found.");
    }
}