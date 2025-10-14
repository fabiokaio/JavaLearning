import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Loop {
    public static void main (String[]args){

        Scanner input = new Scanner(System.in);
        ArrayList <String> random = new ArrayList<>();
        System.out.println("Contando de um até 100!");
        // contagem de 0 ...100
        for (int i = 0;i <= 100; i++){
            System.out.printf("%d...%n",i);
        }
        // //Usando while numa Contagem regressiva (Já sei do while tbm)
        int i = 11;
         while (i > 0 ) {
            i--;    
            System.out.printf("%d%n",i);
            int retorno = i;
            String resultado = (retorno == 0 )? "sim" : "não";
            if (resultado.equals("sim")){ //Aprendi como usar comparação de  string no Java !
            System.out.println("Seu loop 'while' foi feito com sucesso");
            } else {
                System.out.println("Faz de novo !");
            }
        }
        // //soma progressiva.
        int inicio = 1;
        int soma = 0;
        while(inicio <= 50){
            soma += inicio; //soma = soma + inicio
            inicio++;
        }
        System.out.println("A soma total de 0  até 50 é : "+soma);

        // //novamente soma progressiva.
        int contador = 0;
        int progressao = 0;
        while (contador <= 100){
            if(contador % 2 == 0){
                 progressao += contador  ;
                 System.out.println("Número par adicionado");
            }else {
                System.out.println("Pulei para o próximo.");
            }
            contador++;
        } 
        System.out.println(" Soma total igual a :"+progressao);
        
        // //tabuada de qualquer número
        System.out.println("Digite um número e veja sua tabuada:");
        int number = input.nextInt();
        for(int multiplicando = 1; multiplicando <= 10; multiplicando++){
            int result = number*multiplicando;
            System.out.printf("O %dº resultado é :%d%n",multiplicando,result);
        }
       

        //Inversão de array com loop
        System.out.println("Digite 7 palavras");
        int contagem = 0;
        while (contagem < 7){
           
            String palavras = input.nextLine();
            random.add(palavras);
            contagem++;
        }
        Collections.reverse(random);
        System.out.printf("As palavras escritas foram :%s%n",random);
       
     input.close();
    }    
}
