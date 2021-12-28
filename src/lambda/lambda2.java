package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lambda2 {
	
	// distinct methodu akistaki elemanlari
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    //sorted(Comparator.reverseOrder())
    //reduce
    
    public static void main(String[] args) {
        
        List<Integer> sayi=new ArrayList<>(Arrays.asList(12,17,-3,65,7,34,22,-60,42,12));
        
        List<String> liste=new ArrayList<>(Arrays.asList("wehmet","emre","nilgun","wıldız","kadex","emine","islam","islam","emre"));
        
    System.out.println(sayi.stream().filter(lambda2::ciftbul).filter(t->t>15).sorted().findFirst());
    ciftKare(sayi);
    System.out.println("\n*****");
    distinctKare(sayi);
    System.out.println();
    alfabetikSirali(liste);
    System.out.println("\n*****");
    tersKarakterSayili(liste);
    System.out.println("\n*****");
    sonHarfeGoreTersSirali(liste);
    System.out.println("\n*****");
    uzunlukSirali(liste);
    System.out.println("\n*****");
    sonharfe(liste);
    System.out.println("\n*****");
    yediKontrol(liste);
    System.out.println("\n*****");
    wileBasla(liste);
    System.out.println("\n*****");
     xileBiten(liste);
        System.out.println("\n*****");
     karakterEnbuyuk(liste);
    
    }
//    **sayi list deki sorular
    
//1- sayi Liste'teki 15'ten buyuk en kucuk tek sayiyi yazdiriniz
    
    public static void yazdir(int t) {
        System.out.print(t+" ");
    }
    public static boolean ciftbul(int t) {
        return t%2==0;
    }
    
    public static boolean tekbul(int t) {
        return t%2!=0;
    }
    public static int kare(int t) {
        return t*t;
    }
    
//2-sayi Liste'teki cift elemanlarini karelerini kucukten buyuge sirala , yazdir
    
public static void ciftKare(List<Integer> sayi) {
    sayi.stream().filter(lambda2::ciftbul).map(lambda2::kare).sorted().forEach(t->System.out.print(t+" "));
}
    //3- sayi Liste'teki tek elemanlarini karelerini buyukten kucuge  sirala , yazdir
public static void distinctKare(List<Integer> sayi) {
    sayi.stream().filter(lambda2::tekbul).map(lambda2::kare).sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+" "));
    System.out.println();
    sayi.stream().filter(lambda2::tekbul).map(lambda2::kare).sorted(Comparator.reverseOrder()).forEach(lambda2::yazdir);
}
    //**********liste  isim list deki sorular
    // 1- list elemanlarini alfabetik buyuk harf sirasi ile ve tekrarsiz yazdiriniz
    
public static void alfabetikSirali(List<String> liste) {
    liste.stream().map(t->t.toUpperCase()).sorted().distinct().forEach(t->System.out.print(t+" "));
}
// 2- list elemanlarinin charakter sayisini ters sirali(buyukten kucuge) olarak tekrarsiz yazdirin
public static void tersKarakterSayili(List<String> liste) {
    liste.stream().map(t->t.toString().length()).distinct().sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+" "));;
    
}
public static void sonHarfeGoreTersSirali(List<String> liste) {
    liste.stream().
    sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
    forEach(t->System.out.print(t+" "));
    }
    // 3-list elemanlarini character sayisina gore kucukten buyuge siralanarak yazilsin
public static void uzunlukSirali(List<String> liste) {
    liste.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)) .reversed() ).
    forEach(t->System.out.print(t+" "));
    
//  t.toString().length()-1
    System.out.println("-----");
 
}
    // 4- list elemanlarini son harfine gore ters sirali yazdiralim
    // 5- list in eleman karakter sayisi Cift  sayili olan elemanlarini eleman sayilarinin 
//      karelerini hesaplayan, tekrarli olanlari sadece bir kere ve buyukten kucuge dogru
    //  yazdiran bir program yaziniz.
public static void sonharfe(List<String> liste) {
liste.stream().map(t->t.length()).filter(lambda2::ciftbul).
map(lambda2::kare).distinct().sorted(Comparator.reverseOrder()).
forEach(t->System.out.print(t+" "));
liste.stream().filter(t->t.length()%2==0).map(t->t.length()).map(t->t*t).
distinct().sorted(Comparator.reverseOrder()).
forEach(t->System.out.print(t+" "));
}
    // 6- list elemanlarini character sayisini 7 ve 7 den az olma durumunu kontrol ediniz eger liste de 7 karakter sayili
//eleman varsa true donsun
public static void yediKontrol(List<String> liste) {
boolean a=liste.stream().noneMatch(t->t.length()>=7); 
boolean b=liste.stream().anyMatch(t->t.length()>=7)   ;
boolean c=liste.stream().allMatch(t->t.length()>=7);
System.out.println(a+" sda "+b+" sda "+c);
}
    // 7- list elemanlarinin "w" ile baslamasini kontrol ediniz       
public static void wileBasla(List<String> liste) {
    boolean a=liste.stream().anyMatch(t->t.toString().startsWith("w"));
System.out.println(a);
liste.stream().filter(t->t.toString().charAt(0)=='w').forEach(t->System.out.print(t+" "));
}
    // 8- x ile biten var mi hic uyan var mi
public static void xileBiten(List<String> liste) {
    boolean a=liste.stream().anyMatch(t->t.toString().endsWith("x"));
System.out.println(a);
liste.stream().filter(t->t.toString().charAt(t.length()-1)=='x').forEach(t->System.out.print(t));
}
    // 9- karakter sayisi en buyuk elemani yazdiriniz
    //    karakter sirasina gore tersden sirala sonrada ilkinial        
public static void karakterEnbuyuk(List<String> liste) {
    liste.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).
    forEach(t->System.out.print(t+" "));
liste.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+" "));
}
	
	
	

}
