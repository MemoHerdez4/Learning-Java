public class Switch{
    public static void main(String[] args) {
        String weather = "Sunny";
        switch(weather){
            case "Sunny":
                System.out.println("El Tiempo es Soleado");
                break;
            case "Cloudy":
                System.out.println("El Tiempo es Nublado");
                break;
            default:
                System.out.println("Mala Suerte Amigo");
                break;
        }
    }
}