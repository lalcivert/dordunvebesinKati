package day01;
import java.util.Scanner;
public class DordunbesinKati {

    public static void main(String[] args) {

        int sayi;
        System.out.println("sınır sayıyı giriniz: ");
        Scanner input =new Scanner(System.in);
        sayi=input.nextInt();

        for(int i=1;i<=sayi;i++){
            if(i%4==0 && i%5 ==0){
                System.out.println(i);
            }
        }


    }
}
