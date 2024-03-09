package com.example.studentbook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.studentbook.repository.BookRepository;
import com.example.studentbook.repository.UserRepository;

@SpringBootApplication
public class StudentbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentbookApplication.class, args);
	}

		@Bean
	public CommandLineRunner startup(UserRepository userRepository, BookRepository bookRepository){
		return args ->{

			// //Author1
			// User author = new User();
			// author.setId(1L);
			// author.setUsername("KarlMarx");
			// author.setAge(68);
			// author.setPassword("12345");
			// author.setRole(Role.AUTHOR);

			// //Author2
			// User author1 = new User();
			// author1.setId(2L);
			// author1.setUsername("JamesClear");
			// author1.setAge(38);
			// author1.setPassword("12345");
			// author1.setRole(Role.AUTHOR);

			// //Book1
			// Book book1 = new Book();
			// book1.setId(1L);
			// book1.setName("The Communist Manifesto");
			// book1.setAuthor(author);

			// //Book2
			// Book book2 = new Book();
			// book2.setId(2L);
			// book2.setName("The German Ideology");
			// book2.setAuthor(author);


			// //Book3
			// Book book3 = new Book();
			// book3.setId(3L);
			// book3.setName("Atomic Habits");
			// book3.setAuthor(author1);


			// //Book4
			// Book book4 = new Book();
			// book4.setId(4L);
			// book4.setName("Good Habits");
			// book4.setAuthor(author1);

			// //Save author1
			// author.setAuthoredBooks(List.of(book1, book2));
			// userRepository.save(author);

			// //Save author2
			// author1.setAuthoredBooks(List.of(book3, book4));
			// userRepository.save(author1);

			// //Create User
			// User user = new User();
			// user.setId(3L);
			// user.setUsername("elshanshirinli");
			// user.setPassword("12345");
			// user.setAge(21);
			// user.setRole(Role.STUDENT);
			// user.setReadingBooks(List.of(book2, book4));


			// //Create User
			// User user1 = new User();
			// user1.setId(4L);
			// user1.setUsername("ghost");
			// user1.setPassword("12345");
			// user1.setAge(21);
			// user1.setRole(Role.STUDENT);
			// user1.setReadingBooks(List.of(book1, book3));
	
			// //Save user
			// userRepository.save(user);
				
			// //Save user
			// userRepository.save(user1);

		};
	}

}
