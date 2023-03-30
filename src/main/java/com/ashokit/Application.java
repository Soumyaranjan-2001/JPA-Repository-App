package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Book;
import com.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =
		                   SpringApplication.run(Application.class, args);
		
        BookRepository repo = ctxt.getBean(BookRepository.class);
		
		Book b1 = new Book();
		b1.setBookId(101);
		b1.setBookName("Spring");
		b1.setBookPrice(1000.00);
		
		repo.save(b1);
		
		System.out.println("Record inserted : ");
	}

}
