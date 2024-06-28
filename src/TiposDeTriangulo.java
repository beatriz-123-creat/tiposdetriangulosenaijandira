import java.util.Scanner;

public class TiposDeTriangulo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Eu te digo o tipo do triângulo!");

        System.out.println("Digite o primeiro valor: ");
        int ladoUm = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        int ladoDois = leitor.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int ladoTres = leitor.nextInt();


        //PRIMEIRA PARTE DO PROBLEMA
        if (ladoUm < ladoDois + ladoTres && ladoDois < ladoUm + ladoTres && ladoTres < ladoUm + ladoDois){
            System.out.println("É um triângulo");
        } else{
            System.out.println("Não é um triângulo");
        }


        //SEGUNDA PARTE DO PROGRAMA;
        if (ladoDois == ladoTres && ladoTres != ladoUm || ladoTres == ladoUm && ladoUm != ladoDois ||  ladoUm == ladoDois && ladoDois != ladoTres){
                System.out.println("É um triângulo...ISÓCELES");
            } else if (ladoUm != ladoDois && ladoDois != ladoTres){
                System.out.println("É um triângulo...ESCALENO");
            } else if (ladoUm == ladoDois &&  ladoDois == ladoTres){
                System.out.println("É um triângulo...EQUILÁTERO");
            } else {
                 System.out.println("ERRO!");
        }
    }
}
