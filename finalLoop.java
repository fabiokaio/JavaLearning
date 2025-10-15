import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class finalLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList <Float> numeros = new ArrayList<>();

        System.out.println("Vamos fazer a soma, saber quantos números foram digitados, média, maior e menor. ");
        System.out.println("Digite um número");
        float numero = input.nextFloat();
        while(numero != 0){
            numeros.add(numero);
            System.out.println("Continue.");
            numero = input.nextFloat();
        }
    
        System.out.println("Você finalizou o processo.");
        System.out.println("Vamos somar.");

        float adicao = 0 ;
        for (float n : numeros)
        adicao += n;
        adicao+= numero;
        
        float div = adicao / numeros.size();
        
        float maior = Collections.max(numeros);
        float menor = Collections.min(numeros);

        System.out.printf("Sua lista foi : %s%nA média é :%f%nO maior e o menor ,respectivamente são %f e %f%n",numeros, div, maior, menor);
    
        input.close();
    }
}