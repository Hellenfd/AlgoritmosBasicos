import clases.Algoritmos;

public class Aplicacion{
    public static void main (String [] args){
        int num;
        num = 7;
        Algoritmos.esPar (num);
        int numero = Algoritmos.esPar(num);
    if (numero == 0){
        System.out.println("Es par");
    } else{
        System.out.println ("Es impar");
    }

        Algoritmos.esPrimo (num);
    if (numero == 1){
        System.out.println("Es primo");
    }

        String resultado = Algoritmos.stringEnReversa("reversa");
        System.out.println(resultado);

        boolean palabraAlReves = Algoritmos.esPalindromo("oruro");
        System.out.println(palabraAlReves);

        String secuencia1 = Algoritmos.secuenciaFizzBuzz1(9);
        System.out.println(secuencia1);

        String secuencia2 = Algoritmos.secuenciaFizzBuzz2(9);
        System.out.println(secuencia2);

        String secuencia3 = Algoritmos.secuenciaFizzBuzz3(15);
        System.out.println(secuencia3);

        String secuencia4 = Algoritmos.secuenciaFizzBuzz4(15);
        System.out.println(secuencia4);
    }
}