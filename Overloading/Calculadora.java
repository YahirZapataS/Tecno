public class Calculadora {

    public int sumar(int valor1, int valor2){
        int resultado = valor1 + valor2;
        return resultado;
    }

    public double sumar(double valor1, double valor2){
        double resultado = valor1 + valor2;
        return resultado;
    }

    public int sumar(int valor1, int valor2, int valor3){
        int resultado = valor1 + valor2 + valor3;
        return resultado;
    }

    public double sumar(int valor1, double valor2){
        double resultado = valor1 + valor2;
        return resultado;
    }
    public void saludar(){
        System.out.println("¡Hola!");
    }

    public void saludar(String nombre){
        System.out.println("¡Hola soy " + nombre + "!");
    }

    public void saludar(String nombre, String edad){
        System.out.println("Hola soy" + nombre + " y tengo " + edad);
    }
}