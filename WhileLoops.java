import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber
        System.out.println("Ejercicio 1");
        System.out.println();
        int i = 0;
        while (i != 7) {
            i = getRandomNumber(7);
            System.out.println("Número generado: " + i);
        }
        System.out.println("¡El 7!");


        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        System.out.println();
        System.out.println("Ejercicio 2");
        System.out.println();
        int n = 0;
        while (n < 70) {
            n = getRandomNumber(200);
            System.out.println("Número generado: " + n);
        }


        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100.
        // El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente.
        // Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber
        int numRandom = getRandomNumber(100);
        int numHuman;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce un número del 1 al 100: ");
            numHuman = scanner.nextInt();

            if (numHuman > numRandom) {
                System.out.println("Prueba con un número menor");
            } else if (numHuman < numRandom){
                System.out.println("Prueba con un número mayor");
            }
        }
        while (numRandom != numHuman);

        System.out.println("¡Has acertado!");
        scanner.close();
    
    }

    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }
}
