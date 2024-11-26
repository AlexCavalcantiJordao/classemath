package classemath;

public class ClasseMath {

    public static void main(String[] args) {

        int x = 3;
        int y = 4;
        double z = 81.56;

        System.out.println("PI vale: " + Math.PI);
        System.out.println("O valor absoluto de X é: " + Math.abs(x));
        System.out.println("O valor maior de X e Y é: " + Math.max(x, y));
        System.out.println("O valor menor de X e Y é: " + Math.min(x, y));
        System.out.println("A raiz quadrada de Z é: " + Math.sqrt(z));
        System.out.println("Z arredondado para cima é: " + Math.ceil(z));
        System.out.println("Número aleatório gerado: " + Math.random());
        System.out.println("A hipotenusa de X e Y é: " + Math.hypot(x, y));
        System.out.println("O seno de 90º é: " + Math.sin(Math.PI / 2));
    }
}