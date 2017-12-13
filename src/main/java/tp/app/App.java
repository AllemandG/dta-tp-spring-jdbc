package tp.app;

import java.sql.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import tp.Scan;
import tp.controller.BookController;
import tp.entities.Book;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Scan.class);
		
		
		BookController bookController = context.getBean(BookController.class);
		
		bookController.rowsNumber();
		bookController.allBooks();
		
		Book b1 = new Book ("asgfvsx", 4615, "sgfqsgx", new Date(2017, 12, 12));
		Book b2 = new Book ("qsgdqcgvsgfsg qf s gegqef ", 6331, "qfqtgs e", new Date(2017, 12, 11));
		Book b3 = new Book ("sgv seq fsf vgthgzef", 51163, "fbs fvver fzr", new Date(2017, 12, 10));
		
		bookController.insert3(b1, b2, b3);
		
		
		
		Book b4 = new Book ("t1", 415, "a1", new Date(2017, 12, 12));
		Book b5 = new Book ("t2", 331, "a2", new Date(2017, 12, 11));
		Book b6 = new Book ("t2", 513, "a3", new Date(2017, 12, 10));
		
		//bookController.insert3SameId(b4, b5, b6);
		
		
		Book b7 = new Book ("t1", 415, "a1", new Date(2017, 12, 12));
		Book b8 = new Book ("t2", 331, "a2", new Date(2017, 12, 11));
		Book b9 = new Book ("t2", 513, "a3", new Date(2017, 12, 10));
		
		bookController.insert3Sleep(b7, b8, b9);
		
		bookController.allBooks();
		
		try {Thread.sleep(20000);} catch (InterruptedException e) {}
		
		bookController.allBooks();
		
		context.close();
	}

}
