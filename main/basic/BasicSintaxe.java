package main.basic;
import java.util.Scanner;
import java.util.ArrayList;
public class BasicSintaxe {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> sequênciadenumbers = new ArrayList<>();

        System.out.println("Olá !! Seja bem vindo! Qual o seu nome completo?%n");
        String nomeCompleto = input.nextLine(); 
        System.out.printf("Seu nome completo é : %s%n",nomeCompleto);
        
        for (int i = 0 ; i < 10 ; i++){
            sequênciadenumbers.add(i); 
            System.out.printf("%d%n",i);
        } 
        int qtd = sequênciadenumbers.size(); 
        System.out.printf("foram gerados %d números.",qtd); 
        
        sequênciadenumbers.clear();
        System.out.println("Agora vamos faça vocês mesmo !!Digite 10 números e veja a quantidade !"); 
        for (int i = 1; i < 11 ;i++){ 
            System.out.printf("Digite o %dº número :",i);
            int próximo = input.nextInt();
            sequênciadenumbers.add(próximo);
        } 
        int qtd2 = sequênciadenumbers.size(); 
        System.out.printf("Os quantitativo números digitados foram :%d%n",qtd2); 
        System.out.printf("Os números digitados foram :%s",sequênciadenumbers);
         
        input.close(); 
    }       
}
    

