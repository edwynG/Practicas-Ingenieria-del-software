import java.util.Scanner;

public class A1 {
  public static void main(String[] args) {

    Scanner cin = new Scanner(System.in);
    int[] x = { 1, 2, 3, 4, 5, 6 };
    int n = 6;
    System.out.println("Ingrese el valor a buscar");
    int z = cin.nextInt();
    cin.close();
    int i = 0;
    while (i != n) {
      if (z == x[i]) {
        System.out.println("Si se encuentra");
        System.exit(0);
      }
      i++;
    }
    System.out.println("No se encuentra");
  }

}
