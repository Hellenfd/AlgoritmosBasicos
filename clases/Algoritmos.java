package clases;

public class Algoritmos{
    public static int esPar(int num){
        return num%2;
    }
    public static int esPrimo(int num){
        return num%num;
    }
    public static String stringEnReversa (String texto){
        String resultado="";
        for(int i = texto.length()-1 ; i >= 0; i--){
            resultado += texto.charAt(i);
        }
        return resultado;
    }
    public static boolean esPalindromo (String palabra){
        String palabraAlReves="";
        for(int i = palabra.length()-1 ; i >= 0; i--){
            palabraAlReves += palabra.charAt(i);
        }
        if (palabra.equals(palabraAlReves)){
            return true;
        } else{
            return false;
        }
    }
    public static String secuenciaFizzBuzz1(int valor){ //Imprime en terminal del número 1 hasta el número dado como parámetro.
        String resultado="";
        for (int i=1; i<= valor; i++){
            resultado +=i + " ";
            }
        return resultado;
    }
    public static String secuenciaFizzBuzz2(int valor){ //Reemplazar cada número divisible por 3 por la palabra Fizz.
        String resultado="";
        for (int i=1; i<= valor; i++){
                if(i%3 == 0){
                    resultado += "Fizz ";
                }else{
                resultado +=i + " ";
                }
            }
        return resultado;
    }
    public static String secuenciaFizzBuzz3(int valor){ //Reemplazar cada número divisible por 5 por la palabra Buzz.
        String resultado="";
        for (int i=1; i<= valor; i++){
                if(i%5 == 0){
                    resultado += "Buzz ";
                }else{
                resultado +=i + " ";
                }
            }
        return resultado;
    }
    public static String secuenciaFizzBuzz4(int valor){ //Reemplazar cada número divisible por ambos 3 y 5 por FizzBuzz
        String resultado="";
        for (int i=1; i<= valor; i++){
                if(i%3 == 0){
                    resultado += "Fizz ";
                }else if(i%5 == 0){
                    resultado += "Buzz ";
                }else{
                resultado +=i + " ";
                }
            }
        return resultado;
    }
}