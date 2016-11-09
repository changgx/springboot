package com.changgx.bean;/**
 * Created by Administrator on 2016/11/8.
 */

/**
 * Administrator 2016/11/8
 */
public class Book {
    private int ISDN;
    private String bookName;
    private int price;
    private int num;

    public int getISDN() {
        return ISDN;
    }

    public void setISDN(int ISDN) {
        this.ISDN = ISDN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISDN=" + ISDN +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
