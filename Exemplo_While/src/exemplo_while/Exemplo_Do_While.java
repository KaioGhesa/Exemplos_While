package exemplo_while;

//Execução de um bloco de código pelo menos uma vez:
public class Exemplo_Do_While {
    public static void main(String[] args) {
        int contador = 0;
        do {
            //oque o programa tem que fazer
            System.out.println("Este bloco será executado pelo menos uma vez!");
            contador++;
        } while (contador <= 20);
        //contador de quantas vezes o bloco sera utilizado
    }
}
