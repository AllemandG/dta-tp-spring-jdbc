package tp;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import tp.controller.BookController;
import tp.entities.Book;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		BookController bookController = context.getBean(BookController.class);

		bookController.rowsNumber();
		bookController.allBooks();

		/*
		 * "Welcome to Hell";666;"The Devil";"0006-06-06";1
		 * "See you never";0;"Pole Emploi";"2017-12-12";2
		 * "Rends l'argent";900;"Arnaud";"2017-12-13";3
		 * "Yolooooooooo";13;"Moi";"2017-12-11";4
		 * 
		 */

		Book b1 = new Book("fokv bwkfl qjof mqh pmfj pl", 51, "zodo", new Date(2017, 12, 12));
		Book b2 = new Book("qofyidiqkef uqgfq oiqghdiqwgfbioaqf", 5549, "zodo", new Date(2017, 12, 11));
		Book b3 = new Book("siwyfkzls ahdiksguogi ogdikqldhoqf opihfos", 2649, "zodo", new Date(2017, 12, 10));

		bookController.insert3(b1, b2, b3);
		bookController.rowsNumber();
		bookController.allBooks();
		
		Book b4 = new Book("tome 1", 415, "auteur 1", new Date(2017, 12, 12));
		Book b5 = new Book("tome 2", 946, "auteur 1", new Date(2017, 12, 12));
		Book b6 = new Book("tome 3", 658, "auteur 1", new Date(2017, 12, 12));
		Book b7 = new Book("tome 4", 286, "auteur 1", new Date(2017, 12, 12));
		Book b8 = new Book("tome 5", 331, "auteur 1", new Date(2017, 12, 11));
		Book b9 = new Book("tome 6", 513, "auteur 1", new Date(2017, 12, 10));
		
		bookController.insert3(b4, b5, b6);
		
		bookController.insert3Sleep(b7, b8, b9);
		bookController.rowsNumber();
		bookController.allBooks();

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
		}

		bookController.rowsNumber();
		bookController.allBooks();

		b2.setAuthor("test");
		bookController.update(b2);
		
		bookController.delete(b3);
		
		bookController.rowsNumber();
		bookController.allBooks();
		
		context.close();
	}

}
