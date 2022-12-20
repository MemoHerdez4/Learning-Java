public class Funciones { // Asi se crea una clase en Java y debe llamarse igual que el archivo
    public static void main(String[] args) { // Public se puede accerder en cualquier archivo, Static significa que pertenece a la clase en vez de la instancia.
        helloworld("Christian González"); // Void indica que este método no devuelve ningun valor y se llama main y toma como argumento de tipo String []
    }
    private static void helloworld(String name) {
        System.out.println("Hello" + " " + name );
    }
}

