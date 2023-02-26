public class Main {
    public static void main(String[] args) {
        int respuesta;
        respuesta = suma(10, 30, 20);
        System.out.println("El resultado de la suma es: " + respuesta);
    }

    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
class Coche {
    public int Puertas = 0;
    public void agregarpuerta(){
        this.Puertas++;
        this.Puertas++;
        this.Puertas++;
        this.Puertas++;
    }
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarpuerta();
        System.out.println("el coche tiene " + miCoche.Puertas + " puertas");
    }
}


