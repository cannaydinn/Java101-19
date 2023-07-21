

import java.util.Scanner;

public class DortveBesinKuvvetleri{
    public static void main(String[] args) {
        // Döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program yazınız
        
        Scanner sc = new Scanner(System.in);
        int sayi;

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = sc.nextInt();

        for(int i = 1;i<=sayi; i*=4){
            System.out.println("4'ün kuvvetleri: "+i);
        }
        System.out.println("-------------------------------");
        for(int i = 1; i<=sayi; i*=5){
            System.out.println("5'in kuvvetleri: "+i);
            
        }

    }
}