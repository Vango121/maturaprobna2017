package jumanji;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class zad42 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("C:/Users/Admin/Desktop/prace/okregi.txt"));
		List<String> e= new ArrayList<>();
		while(scanner.hasNextLine()) {
			e.add(scanner.nextLine());
		}
		int ile =0;
		List<String> styczne= new ArrayList<>();
		for (int i = 0; i < e.size(); i++) {
		String[] a =e.get(i).split(" ");

		if(Math.abs(Integer.valueOf(a[1]))==Math.abs(Integer.valueOf(a[2]))) {
			ile++;
			styczne.add(e.get(i));
		}
		
		}
		Collections.sort(styczne, new compare());
		for (int i = 0; i < styczne.size(); i++) {
			System.out.println(styczne.get(i));
		}
		System.out.println(ile);
	
	}

}
