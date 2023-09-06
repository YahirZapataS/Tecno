class Main{
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.sumar(5,10));

        System.out.println(calculadora.sumar(8.5,20.2));

        System.out.println(calculadora.sumar(5,10,15));

        System.out.println(calculadora.sumar(15,10.5));

        Calculadora nombre = new Calculadora();

        nombre.saludar();
        nombre.saludar("Yahir");
        nombre.saludar("Yahir", "21");

    }
}