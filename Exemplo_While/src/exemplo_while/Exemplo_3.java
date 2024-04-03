package exemplo_while;
import java.util.Scanner;

public class Exemplo_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        while (numero != 10)
        // Digite um numero diferente de 10 para continuar
        {
            System.out.print("Digite o numero 10 para sair: ");
            numero = sc.nextInt();
            /*enquanto usuario digitar numero diferente de 10
            o programa vai continuar rodando
            **/
        }
        System.out.println("Voce  digitou o numero 10. Saindo...");
    }
}
