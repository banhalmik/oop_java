package feladom;

import java.util.Scanner;

public class Feladomfut2 {
	public static void main(String[] args) {
		Feladom rectangles[] = new Feladom[10];
		
		for(int i=0;i<rectangles.length;i++) {
			rectangles[i] = new Feladom((int)(Math.random()*8) + 1, (int)(Math.random()*8) + 1);
			System.out.println(rectangles[i].getAdatok());
		}
		
		int mini = 0;
		for(int i=0;i<rectangles.length;i++) {
			if(rectangles[i].getTerulet() < rectangles[mini].getTerulet())
				mini = i;
		}
		System.out.println("A legkisebb teruletu teglalap adatai: " + rectangles[mini].getAdatok());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kérem a teglalap A oldalat: ");
		int newA = sc.nextInt();
		System.out.println("Kérem a teglalap B oldalat: ");
		int newB = sc.nextInt();
		
		Feladom newRectangle = new Feladom(newA, newB);
		
		int db = 0;
		for(Feladom t : rectangles) {
			if(t.getTerulet() < newRectangle.getTerulet())
				db++;
		}
		System.out.println("A megadott uj teglalaptol kisebb teruletu teglalpok szama: " + db);
		
		System.out.println("");
		boolean isTrue = false;
		int index = 0;
		for (int i=0;i<rectangles.length;i++) {
			if(rectangles[i].getOldalakEgyeznekE(newRectangle)) {
				isTrue = true;
				index = i;
			}
		}
		
		if(isTrue) 
			System.out.println("Az egyezo meretu teglalap indexe: " + index);
		else
			System.out.println("Nem volt egyezo meretu teglalap.");
			
		
		
	}
}
