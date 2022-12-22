public class CocheMain {
    public static void main(String[] args) {
        Coche cocheobj = new Coche("Rojo", "Chevrolet", "Suburban", 350.25,3.50);
        cocheobj.acelerar(50);
        System.out.println(cocheobj);
    }
}
