package tech.bts.productcatalog.bookexample;

import com.google.gson.Gson;

import java.io.PrintWriter;
import java.util.*;


public class BookWrite {

    public static void main(String[] args) throws Exception {

        Book book1 = new Book("Stories of Sherlock Holmes", " Arthur Conan Doyle", 800);

        writeJson(book1);
    }

    public static void writeJson (Book book) throws Exception {
        Gson gson = new Gson();
        String json = gson.toJson(book);

        PrintWriter writer = new PrintWriter("Book.json");

        writer.println(json);

        writer.close();
    }
}
