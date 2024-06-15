import java.util.Scanner;

public class A3 {
  public static void main(String[] args) {
    
    Scanner cin = new Scanner(System.in);
    System.out.println("Ingrese el tamaño del arreglo");
    int n = cin.nextInt();
    int[] x = new int[n];
    System.out.println("Ingrese los elementos");
    for (int i = 0; i < x.length; i++) {
      System.out.println("Elemento: " + ((int) i + 1));
      x[i] = cin.nextInt();
    }
    System.out.println("Ingrese el valor a buscar");
    int z = cin.nextInt();
    cin.close();
    for (int i = 0; i < x.length; i++) {
      if (x[i] == z) {
        System.out.println("Si se encuentra");
        System.exit(0);
      }
    }
    System.out.println("No se encuentra");
  }

}
