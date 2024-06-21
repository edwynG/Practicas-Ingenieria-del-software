import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class GestionDeEquipos {

    public static void main(String[] args) {
        boolean exit = false;
        String option = "-1";
        Scanner cin = new Scanner(System.in);
        while (!exit) {
            try {
                menuInterfaz();
                option = cin.nextLine();
                switch (option) {
                    case "1":
                        registrarEquipos(cin);
                        break;
                    case "2":
                        generarReporte();
                        break;
                    case "0":
                        exit = true;
                        System.out.println("Cerrando programa..");
                        break;
                    default:
                        System.out.println("Opción incorrecta\n");
                        break;
                }
            } catch (Exception e) {

            }
        }
        cin.close();
        System.out.println("Programa cerrado\n");
    }

    public static void menuInterfaz() {
        System.out.println("\nSelecciona alguna de las siguietes opciones");
        System.out.println("1: Registrar Equipo");
        System.out.println("2: Generar reporte");
        System.out.println("0: Salir del programa");
    }

    public static void registrarEquipos(Scanner cin) {
        String regex[] = { "\\b(cpu|monitor|mouse|teclado|ups|pen-drive|camara|impresora|fotocopiadora)\\b", "\\d+",
                "\\d+", "^(0?[1-9]|1?[0-9]|2?[0-9]|3?[0-1])/(0?[1-9]|1?[0-2])/\\d{4}$", ".*", "\\d+" };
        String registro = "";
        String[] datos = { "descripción", "cantidad de equipos", "costo unitario de adquisición del equipo",
                "Fecha en formato dd/mm/aaaa", "Número de la factura", "Cedula" };
        String text = "";
        boolean esValidoRegex = false;

        for (int i = 0; i < datos.length; i++) {
            System.out.println("\nIngresa " + datos[i] + "\n");
            text = cin.nextLine().toLowerCase();
            System.out.println("\n");
            esValidoRegex = text.matches(regex[i]);
            if (esValidoRegex) {
                registro += text + "#";

            } else {
                System.err.println(datos[i] + " incorrecto\n");
                i--;
            }
        }
        registro = registro.substring(0, registro.length() - 1);
        añadirRegistro(registro);
    }

    public static void añadirRegistro(String text) {
        String nombreArchivo = "registro.txt";
        try {
            FileWriter fw = new FileWriter(nombreArchivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.newLine(); // Agregar una nueva línea al final del texto
            bw.close();
            System.out.println("Registro exitoso!!");
        } catch (Exception e) {
            System.out.println("Hubo un error al registrar");
        }
    }

    public static void generarReporte() {
        String nombreArchivo = "registro.txt"; // Reemplaza con el nombre de tu archivo
        String linea = "";
        String str = "";
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    // Procesar la línea solo si no está vacía
                    str += linea.trim() + "-";
                }

                // Aquí puedes trabajar con cada línea leída
            }
        } catch (Exception e) {
            System.out.println("Hubo un errro al leer los registros");
        }
        if (!str.isEmpty()) {
            str = str.substring(0, str.length() - 1);
            reporte(str.split("-"));
        } else {
            System.out.println("No hay nada registrado");
        }

    }

    public static void reporte(String[] text) {
        System.out.println("\nReporte\n");
        for (int i = 0; i < text.length; i++) {
            int indexHash = text[i].lastIndexOf("#");
            if (indexHash < 0)
                continue;
            String CI = text[i].substring(indexHash + 1, text[i].length());
            int totalEquipos = 0;
            int totalMonto = 0;

            for (int j = 0; j < text.length; j++) {
                if (text[j].contains(CI)) {
                    indexHash = text[j].indexOf("#");
                    int indexHash2 = text[j].indexOf("#", indexHash + 1);
                    int indexHash3 = text[j].indexOf("#", indexHash2 + 1);
                    totalEquipos += Integer.parseInt(text[j].substring(indexHash + 1, indexHash2));
                    totalMonto += Integer.parseInt(text[j].substring(indexHash2 + 1, indexHash3));
                    text[j] = "";
                }
            }
            System.out.println("Profesor: " + CI);
            System.out.println("Numero total de equipos: " + totalEquipos);
            System.out.println("Monto total en bolivares: " + totalMonto);
            System.out.println("\n");

        }
    }
}
