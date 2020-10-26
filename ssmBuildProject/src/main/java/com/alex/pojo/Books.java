package com.alex.pojo;

public class Books {

    private int bookID;
    private String bookNAME;
    private int bookCounts;
    private String detail;

    public Books() {
    }

    public Books(int bookID, String bookNAME, int bookCounts, String detail) {
        this.bookID = bookID;
        this.bookNAME = bookNAME;
        this.bookCounts = bookCounts;
        this.detail = detail;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookNAME() {
        return bookNAME;
    }

    public void setBookNAME(String bookNAME) {
        this.bookNAME = bookNAME;
    }

    public int getBookCounts() {
        return bookCounts;
    }

    public void setBookCounts(int bookCounts) {
        this.bookCounts = bookCounts;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookID=" + bookID +
                ", bookNAME='" + bookNAME + '\'' +
                ", bookCounts=" + bookCounts +
                ", detail='" + detail + '\'' +
                '}';
    }
}
