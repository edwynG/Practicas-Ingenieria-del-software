import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int n = 0;
        try {
            n = cin.nextInt();
        } catch (Exception e) {
            System.out.println("No se permite arreglo vacio");
            cin.close();
            System.exit(0);
        }
        int[] x = new int[n];
        System.out.println("Ingrese los elementos");
        for (int i = 0; i < x.length; i++) {
            System.out.println("Elemento: " + ((int) i + 1));
            try {
                x[i] = cin.nextInt();
            } catch (Exception e) {
                System.out.println("Solo se permite datos enteros");
                cin.close();
                System.exit(0);
            }
        }

        System.out.println("Ingrese el valor a buscar");
        int z = cin.nextInt();
        cin.close();
        isElementOf(x, z);

    }

    public static void isElementOf(int[] x, int z) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == z) {
                System.out.println("Si se encuentra");
                System.exit(0);
            }
        }
        System.out.println("No se encuentra");
    }

}
