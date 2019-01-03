package jumanji;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad51 {
	static boolean palindrom (String a) {
		StringBuilder b=new StringBuilder(a).reverse();
		if(b.toString().equals(a)) {
			return true;
		}
		return false;
		
	}
public static void main(String[] args) throws FileNotFoundException {
	Scanner scanner = new Scanner(new File("C:/Users/Admin/Desktop/prace/rejestrator.txt"));
	String[] tablica = new String[4844];
	int a =0;
	while(scanner.hasNextLine()) {
		tablica[a]=scanner.nextLine();
		a++;
	}
	
		PrintWriter writer = new PrintWriter("C:/Users/Admin/Desktop/prace/czasy.txt");
		PrintWriter writer1 = new PrintWriter("C:/Users/Admin/Desktop/prace/wyniki5.txt");
	
	List<String> godziny = new ArrayList<>();
	for (int i = 0; i < tablica.length; i++) {
		String godzina1= String.valueOf(Integer.parseInt(tablica[i].substring(0, 4),2));
		
		String godzina2= String.valueOf(Integer.parseInt(tablica[i].substring(4, 8),2));
		String minuta1= String.valueOf(Integer.parseInt(tablica[i].substring(8, 12),2));
		String minuta2= String.valueOf(Integer.parseInt(tablica[i].substring(12, 16),2));
		String sekunda1= String.valueOf(Integer.parseInt(tablica[i].substring(16, 20),2));
		String sekunda2= String.valueOf(Integer.parseInt(tablica[i].substring(20, 24),2));
		String czas = godzina1+godzina2+":"+minuta1+minuta2+":"+sekunda1+sekunda2;
		godziny.add(czas);
	

		writer.println(czas);
		if(palindrom(czas)) {
			System.out.println(czas);
		}
	}
	writer.close();
	writer1.println(godziny.get(1110));
	writer1.println(godziny.get(2221));
	writer1.println(godziny.get(3332));
	writer1.println(godziny.get(4443));
	writer1.close();
	
}
}
