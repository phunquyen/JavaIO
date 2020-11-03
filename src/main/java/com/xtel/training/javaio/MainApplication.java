package com.xtel.training.javaio;

import java.io.IOException;
import java.util.List;

import static com.xtel.training.javaio.WriteExcel.writeExcel;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        final String excelFilePath = "D:/DocGhiFile/books1.xlsx";

        WriteExcel writeExcel = new WriteExcel();
        ReadExcel readExcel = new ReadExcel();
        final List<Book> books = writeExcel.getBooks();
        writeExcel(books, excelFilePath);
        final List<Book> book1s = readExcel.readExcel(excelFilePath);
        for (Book book : book1s) {
            System.out.println(book);
        }
    }

}
