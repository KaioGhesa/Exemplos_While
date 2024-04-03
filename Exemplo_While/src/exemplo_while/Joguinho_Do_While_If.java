package exemplo_while;
import java.util.Scanner;
public class Joguinho_Do_While_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numeroAleatorio = (int) (Math.random()*100) +1;
        /*um numero inteiro para pegar um numero aleatorio, 
        fazer vezes 100 + 1**/
        int tentativa;
        
        do {
            System.out.println("Tente adivinhar um numero (de 0 a 100): ");
            tentativa = sc.nextInt();
        if (tentativa < numeroAleatorio){
       System.out.println("Tente numero maior ;)");         
       } else if (tentativa > numeroAleatorio){
            System.out.println("Tente numero menor ;) ");
       }else {
           System.out.println("Parabens acertou o numero");
        }
       } while (tentativa != numeroAleatorio);
    }  
}
