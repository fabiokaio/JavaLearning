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
        while (contagem <= 7){
           
            String palavras = input.nextLine();
            random.add(palavras);
            contagem++;
        }
        Collections.reverse(random);
        System.out.printf("As palavras escritas foram :%s%n",random);

        //Até digitar 0 e quais foram digitado.
        ArrayList <Float> numero = new ArrayList<>(); 
       
        System.out.println("Digite um número até chegar em 0");
        float count = input.nextFloat();
        while(count != 0){
            numero.add(count);
            System.out.println("Digite outro número");
            count = input.nextFloat();
        } 
        System.out.println("Você digitou o número desejado");
        
        // Par ou ímpar
        ArrayList <Integer> numero2 = new ArrayList<>();
        
        System.out.println("Digite 10 números"); 
        int counter = 0;
        while (counter < 10) {
            System.out.println("Digite mais um número");
            int listofnum = input.nextInt();
            numero2.add(listofnum) ;
            counter++;
            if (listofnum % 2 != 0){
                System.out.println("Esse número é ímpar.");
            } else {
                System.out.println("Esse número é par.");
            }
        }
        // trasformando tipo de dado
        int contador2 = 0;
        String entrada = "";
        System.out.println("Digite números para somar (ou 'stop' para encerrar):");
        while(true){
            entrada = input.nextLine();
            if (entrada.equalsIgnoreCase("stop")) {//ignora o camel case da palavra  inserida.
            break; // sai do loop
            }
            int passagem = Integer.parseInt(entrada);
            contador2+= passagem;
            System.out.println("A soma total é: " + contador2);
        }
        // Média de números numa lista.
        ArrayList <Integer> lista = new ArrayList<>();
        int fim = 0; 
        int adição = 0;
        while (fim < 4) {
            System.out.println("Digite um número :");
            int num = input.nextInt();
            lista.add(num);
            adição += num; 
            fim++;
        }
        int mediageral = adição/4;
        System.out.printf("A média é :%d%n", mediageral);
     input.close();
    }    
}
