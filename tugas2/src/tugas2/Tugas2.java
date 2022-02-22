package tugas2;
import java.util.*;
public class Tugas2 {

		public static void main (String [] args) {
			
		int a;
		int b;
		int tambah;
		int kurang;
		int kali;
		int bagi;
		
		a = 2;
		System.out.println("a: " + a);
		b = 3;
		System.out.println("b: " + b);
		
		tambah = a+b;
		System.out.println("a+b: " + tambah);
		
		a= 5;
		System.out.println("a: "+ a);
		b= 2;
		System.out.println("b: "+ b);
		
		kurang = a-b;
		System.out.println("a-b: " + kurang);
		
		a= 6;
		System.out.println("a: "+ a);
		b= 2;
		System.out.println("b: "+ b);
		
		bagi = a/b;
		System.out.println("a/b: " + bagi);
		
		a= 2;
		System.out.println("a: "+ a);
		b= 3;
		System.out.println("b: "+ b);
		
		kali = a*b;
		System.out.println("a*b:" + kali);
		
		a= -7;
		System.out.println("a: "+ a);
		b= 3;
		System.out.println("b: "+ b);
		
		kurang = a-b;
		System.out.println("a-b: "+ kurang);
		
		if (kurang < 0) {		
			throw new java.lang.Error("this is very bad");
		}
	}
		
}
