package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;import deneme.mainn;

public class lambda1 {

	public static void main(String[] args) {
		
		/*
		   1) Lambda "Functional Programming"
		      "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
		   2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
		   3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
		   ve hatasiz code yazma acilarindan cok faydalidir.
		   4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.
		      Lambda kullanmak hatasız code kullanmaktır.
		*/
		
		List<Integer> list=new ArrayList<>(Arrays.asList(12,13,65,3,7,34,22,60,42,55));
		
		
		print(list);
		System.out.println();
		printf(list);
		System.out.println();
		printElFunctional1(list);
		System.out.println();
		çiftf(list);
		System.out.println();
		printCıftAltmısKucuk(list);
		System.out.println();
		printTek(list);
		System.out.println();
		printKare(list);
		System.out.println();
		tekKüp(list);
		System.out.println();
		kareKök(list);
		System.out.println();
		buyuk(list);
		
		
		

	}
//structured Programıng ile list elementlerinin tamamını yazdırınız
	public static void print(List<Integer> list) {
		for (Integer w : list) {
			System.out.print(w+" ");
			//Functional Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
			
			//clasname ::methodName-->ez ber le
		}
	}
	
	public static void printf(List<Integer> list) {
		
		list.stream().forEach(t->System.out.println(t+" "));
		
	}
	
	
	public static void printEl(double t) {
		
		System.out.print(t+ " ");
		
		
	}
	public static void printElFunctional1(List<Integer>list){
		list.stream().forEach(lambda1::printEl);
	}
	
	
	
		
	
	
		
		
			 
			 
		
	 public static void çiftf(List<Integer>list) {
		 
	list.stream().filter(t-> t%2==0).forEach(lambda1::printEl);
		
		
		
	}
	 public static void printCıftAltmısKucuk(List<Integer>list) {
		 
		 list.stream().filter(t-> t%2==0 & t<60).forEach(lambda1::printEl);
		 
		 
	 }
	 
	 public static void printTek(List<Integer>list) {
		 
		 list.stream().filter(t-> t%2==1 || t>20).forEach(lambda1::printEl);
	 }
 public static void printKare(List<Integer>list) {
		 
		 list.stream().filter(t-> t%2==0).map(t-> t*t).forEach(lambda1::printEl);
		 
		 
	 }
 
 public static void tekKüp(List<Integer>list) {
	 
	 list.stream().filter(t-> t%2==1).map(t-> (t*t*t)+1).forEach(lambda1::printEl);
	 
	 
 }
 
    public static void kareKök(List<Integer> list) {
    	
    	list.stream().filter(t-> t%2==0).map(Math::sqrt).forEach(lambda1::printEl);
    	
    }

	 
	 public static void buyuk(List<Integer>list) {
		 
		 Optional<Integer> maxEl=  list.stream().reduce(Math::max)	;
		 System.out.println(maxEl);
	 
	 }
	 
	
}
