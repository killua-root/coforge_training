package com.coforge.day4.assignment.lib_mang_sys;

public class Test {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book(101, "Atomic Habits"));
        library.addBook(new Book(102, "The 48 Laws of Power"));

        library.searchBook("Atomic Habits");

        Member akhil = new Member(1, "Akhil");
        library.issueBook(101, akhil);

        Member varshitt = new Member(2, "Varshitt");
        library.issueBook(101, varshitt);

        library.returnBook(101);

        library.issueBook(101, varshitt);
    }
}