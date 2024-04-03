package exemplo_while;
public class Exemplo_2 {
    public static void main(String[] args) {
        int soma = 0;
        int numero = 1;
        while (numero <= 100) {
            soma += numero;
            numero++;
        }
        System.out.println("A soma dos números de 1 a 100 e: " + soma);
    }
}
