package jumanji;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zadanie41 {
public static void main(String[] args) throws FileNotFoundException {
	Scanner scanner = new Scanner(new File("C:/Users/Admin/Desktop/prace/punkty.txt"));
	String[] tablica = new String[100];
	int a =0;
	while(scanner.hasNextLine()) {
		tablica[a]=scanner.nextLine();
		a++;
	}
	int pierwsza=0;
	int druga=0;
	int trzecia=0;
	int czwarta=0;
	for (int i = 0; i < tablica.length; i++) {
		String[] c=tablica[i].split(" ");
		System.out.println(Double.parseDouble(c[0]));
		if(Double.parseDouble(c[0])>0&&Double.parseDouble(c[1])>0) {
			pierwsza=pierwsza+1;
			
		}
		if(Double.parseDouble(c[0])<0&&Double.parseDouble(c[1])>0) {
			druga++;
			
		}
		if(Double.parseDouble(c[0])<0&&Double.parseDouble(c[1])<0) {
			trzecia++;
			
		}
		if(Double.parseDouble(c[0])>0&&Double.parseDouble(c[1])<0) {
			czwarta++;
			
		}
	}
	System.out.println(pierwsza +" "+ druga +" "+trzecia + " "+czwarta);
	
}
}
