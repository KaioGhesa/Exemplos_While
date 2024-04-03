package exemplo_while;

//programa que fica repetindo palavras varias vezes
public class Exemplo_While {
    public static void main(String[] args) {
        int contador = 10;
        //Contador de quantas vezes vai ser escrita aquela palavra
        while (contador>=0){
            //contador enquanto aquela palavra for igual ou menor que zero
            System.out.println("Contagem de palavras");
            contador--;
        }
        System.out.println("Fim do programa!!! ");
    }
}
