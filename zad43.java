package jumanji;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class zad43 {
public static void main(String[] args) throws FileNotFoundException {
	Scanner scanner = new Scanner(new File("C:/Users/Admin/Desktop/prace/punkty.txt"));
	String[] tablica = new String[100];
	int a =0;
	while(scanner.hasNextLine()) {
		tablica[a]=scanner.nextLine();
		a++;
	}
	double pole=0;
	int pole1=0;
	double temp=0;
	int xc=0;
	int yc=0;
	BigDecimal pole2=new BigDecimal(0);
	for (int i = 0; i < tablica.length; i++) {
		temp=0;
		double xa=Double.parseDouble(tablica[i].split(" ")[0]);
		double ya=Double.parseDouble(tablica[i].split(" ")[1]);
		if(i==99) {
			double xb1=Double.parseDouble(tablica[0].split(" ")[0]);
			double yb1=Double.parseDouble(tablica[0].split(" ")[1]);
			temp= 0.5*(Math.abs(xa*yb1-xb1*ya));
			pole=pole+temp;
			
		}
		if(i<99) {
		double xb=Double.parseDouble(tablica[i+1].split(" ")[0]);
		double yb=Double.parseDouble(tablica[i+1].split(" ")[1]);
		BigDecimal xaa=new BigDecimal(xa);
		BigDecimal yaa=new BigDecimal(ya);
		BigDecimal xbb=new BigDecimal(xb);
		BigDecimal ybb=new BigDecimal(yb);
		
		BigDecimal temp1=(xaa.multiply(ybb).subtract(xbb.multiply(yaa))).abs().multiply(BigDecimal.valueOf(0.5));
		temp= 0.5*(Math.abs(xa*yb-xb*ya));
		pole=pole+temp;
		pole2=pole2.add(temp1);
		}
	}
	pole1=(int)pole;
	System.out.println(pole1);
}
}
