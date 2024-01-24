package junitlab;

import java.util.ArrayList;

public class Pila {
    private ArrayList<Integer> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    // Método para introducir elementos en la pila que cumplan la condición
    public boolean push(int elemento) {
        if (esValido(elemento)) {
            elementos.add(elemento);
            System.out.println("Elemento " + elemento + " agregado a la pila.");
            return true;
        } else {
            System.out.println("El elemento " + elemento + " no cumple con la condición.");
            return false;
        }
    }

    // Método para verificar si un elemento cumple con la condición
    private boolean esValido(int elemento) {
        return elemento > 0 && elemento <= 999;
    }

    // Método para eliminar y obtener el elemento en la cima de la pila
    public int pop() {
        if (!isEmpty()) {
            int elemento = elementos.remove(elementos.size() - 1);
            System.out.println("Elemento " + elemento + " removido de la pila.");
            return elemento;
        } else {
            System.out.println("La pila está vacía. No se puede hacer pop.");
            return -1; // Valor de retorno que indica que la pila está vacía
        }
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    // Método para obtener el elemento en la cima de la pila sin removerlo
    public int top() {
        if (!isEmpty()) {
            return elementos.get(elementos.size() - 1);
        } else {
            System.out.println("La pila está vacía. No hay elemento en la cima.");
            return -1; // Valor de retorno que indica que la pila está vacía
        }
    }

    // Método para imprimir la pila
    public void imprimirPila() {
        System.out.println("Contenido de la pila:");
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println(elementos.get(i));
        }
    }

}
