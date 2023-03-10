package br.com.vanessaeich.unittests.mocks;

import br.com.vanessaeich.dtos.v1.BookDTO;
import br.com.vanessaeich.model.Book;
import com.github.dozermapper.core.converters.LocalDateTimeConverter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Vanessa Eich on 11/01/2023
 */
public class MockBook {

    public Book mockEntity() {
        return mockEntity(0);
    }

    public BookDTO mockVO() {
        return mockVO(0);
    }

    public List<Book> mockEntityList() {
        List<Book> books = new ArrayList<Book>();
        for (int i = 0; i < 14; i++) {
            books.add(mockEntity(i));
        }
        return books;
    }

    public List<BookDTO> mockVOList() {
        List<BookDTO> books = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            books.add(mockVO(i));
        }
        return books;
    }

    public Book mockEntity(Integer number) {
        Book book = new Book();
        book.setId(number.longValue());
        book.setAuthor("Some Author" + number);
        book.setLaunchDate(LocalDateTime.now());
        book.setPrice(BigDecimal.valueOf(25));
        book.setTitle("Some Title" + number);
        return book;
    }

    public BookDTO mockVO(Integer number) {
        BookDTO book = new BookDTO();
        book.setKey(number.longValue());
        book.setAuthor("Some Author" + number);
        book.setLaunchDate(LocalDateTime.now());
        book.setPrice(BigDecimal.valueOf(25));
        book.setTitle("Some Title" + number);
        return book;
    }
}
