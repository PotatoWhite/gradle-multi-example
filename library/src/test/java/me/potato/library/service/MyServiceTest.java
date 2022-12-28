package me.potato.library.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest("service.message=Hello")
class MyServiceTest {

    @Autowired
    private MyService service;

    @Test
    public void contextLoads() {
        assertEquals("Hello", service.message());
    }

    @SpringBootApplication
    static class TestConfiguration {
    }

}