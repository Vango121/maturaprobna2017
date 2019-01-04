package jumanji;

import java.util.Comparator;

public class compare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		String a1=o1.split(" ")[0];
		String a2=o2.split(" ")[0];
		String a3=o1.split(" ")[1];
		String a4=o2.split(" ")[1];
		if(a1.compareTo(a2)==0) {
			return Integer.valueOf(a3)-Integer.valueOf(a4);
		}
		return Integer.valueOf(a1)-Integer.valueOf(a2);
	}
	

}
