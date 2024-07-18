
package com.mycompany.recursos;
import java.util.ArrayList;
import java.util.List;

public class Recursos {
    
    public String metodo1() {
        return "Programación Orientada a Objetos";
    }
    
    public String metodo2(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }
    
    public int metodo3(int num1, int num2) {
        return num1 * num2;
    }
    
    public List<Integer> metodoCuatro(int x) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            numeros.add(i);
        }
        return numeros;
    }
    
    public static void main(String[] args) {
        Recursos recursos = new Recursos();
        
        // Llamada al método uno
        String mensajeUno = recursos.metodo1();
        System.out.println(mensajeUno);
        
        // Llamada al método dos
        int edad = 22; // Cambia el valor según necesites
        String mensajeDos = recursos.metodo2(edad);
        System.out.println(mensajeDos);
        
        // Llamada al método tres
        int resultado = recursos.metodo3(8, 4); // Cambia los valores según necesites
        System.out.println(resultado);
        
        // Llamada al método cuatro
        int parametroCuatro = 5; // Cambia el valor según necesites
        List<Integer> numeros = recursos.metodoCuatro(parametroCuatro);
        System.out.println(numeros);
    }
}

