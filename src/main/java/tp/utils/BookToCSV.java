package tp.utils;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BookToCSV {
	private BookToCSV () {}
	
	public static void booksToCSV (String books) {
		File file = null;
		try {
			file = File.createTempFile("books_list", ".csv");
			System.out.println("Chemin du fichier : "+file.getAbsolutePath());
		} catch (IOException e1) {System.out.println(e1.getMessage());}
		DataOutputStream output = null;
		try {
			output = new DataOutputStream(new BufferedOutputStream( new FileOutputStream(file) ));
			try {output.writeChars(books);} catch (IOException e) {System.out.println(e.getMessage());}
		} catch (FileNotFoundException e) {System.out.println(e.getMessage());}
		finally {
			try {output.close();} catch (IOException e) {System.out.println(e.getMessage());}
		}
	}
}
