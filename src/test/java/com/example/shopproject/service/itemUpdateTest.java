package com.example.shopproject.service;

import com.example.shopproject.domain.item.Book;
import jakarta.persistence.EntityManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class itemUpdateTest {
    @Autowired
    EntityManager em;
    @Test
    public void updateTest() throws Exception {
        Book book = em.find(Book.class, 1L);

        book.setName("asdasd");

    }
}