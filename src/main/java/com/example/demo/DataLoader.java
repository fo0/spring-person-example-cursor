package com.example.demo;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataLoader {

    private final PersonService service;

    @PostConstruct
    public void init() {
        List<Person> people = Arrays.asList(
                new Person(1L, 19, "Tom Smith", "246 Main St", "tomsmith@example.com", "555-6789"),
                new Person(2L, 20, "Bob Johnson", "789 Elm St", "bobjohnson@example.com", "555-9012"),
                new Person(3L, 20, "Lucy Kim", "789 Pine St", "lucykim@example.com", "555-6789"),
                new Person(4L, 21, "Noah Smith", "246 Pine St", "noahsmith@example.com", "555-6789"),
                new Person(5L, 22, "Alex Johnson", "246 Maple Ave", "alexjohnson@example.com", "555-0123"),
                new Person(6L, 23, "William Johnson", "456 Maple Ave", "williamjohnson@example.com", "555-4567"),
                new Person(7L, 24, "Kevin Brown", "246 Oak Ave", "kevinbrown@example.com", "555-2345"),
                new Person(8L, 25, "John Doe", "123 Main St", "johndoe@example.com", "555-1234"),
                new Person(9L, 26, "Ava Brown", "789 Elm St", "avabrown@example.com", "555-2345"),
                new Person(10L, 27, "Michael Johnson", "456 Maple Ave", "michaeljohnson@example.com", "555-4567"),
                new Person(11L, 28, "David Lee", "135 Pine St", "davidlee@example.com", "555-7890"),
                new Person(12L, 29, "Olivia Davis", "123 Main St", "oliviadavis@example.com", "555-4567"),
                new Person(13L, 30, "Jane Smith", "456 Oak Ave", "janesmith@example.com", "555-5678"),
                new Person(14L, 31, "Ethan Lee", "456 Oak Ave", "ethanlee@example.com", "555-8901"),
                new Person(15L, 32, "Mia Brown", "246 Main St", "miabrown@example.com", "555-2345"),
                new Person(16L, 33, "Jessica Lee", "789 Pine St", "jessicalee@example.com", "555-8901"),
                new Person(17L, 35, "Alice Brown", "246 Maple Ave", "alicebrown@example.com", "555-3456"),
                new Person(18L, 37, "Sophia Kim", "123 Oak Ave", "sophiakim@example.com", "555-0123"),
                new Person(19L, 40, "Isabella Davis", "789 Pine St", "isabelladavis@example.com", "555-8901"),
                new Person(20L, 42, "Sarah Kim", "789 Oak Ave", "sarahkim@example.com", "555-2345"),
                new Person(21L, 50, "Emily Davis", "123 Elm St", "emilydavis@example.com", "555-0123"));

        service.saveAll(people);
    }

}
