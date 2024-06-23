package Logica;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class GestionDeEquipos {
    public void registrarEquipos(String inputs[]) {
        String regex[] = { "\\b(cpu|monitor|mouse|teclado|ups|pen-drive|camara|impresora|fotocopiadora)\\b", "\\d+",
                "\\d+", "^(0?[1-9]|1?[0-9]|2?[0-9]|3?[0-1])/(0?[1-9]|1?[0-2])/\\d{4}$", ".*", "\\d+" };
        String registro = "";
        String[] datos = { "descripción", "cantidad de equipos", "costo unitario de adquisición del equipo",
                "Fecha en formato dd/mm/aaaa", "Número de la factura", "Cedula" };
        String text = "";
        boolean esValidoRegex = false;

        for (int i = 0; i < datos.length; i++) {
            text = inputs[i].toLowerCase();
            esValidoRegex = text.matches(regex[i]);
            if (esValidoRegex) {
                registro += text + "#";

            } else {
                System.err.println(datos[i] + " incorrecto\n");
                break;
            }
        }
        if(esValidoRegex){
        registro = registro.substring(0, registro.length() - 1);
        añadirRegistro(registro);
        }
    }

    public void añadirRegistro(String text) {
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

    public  String generarReportes() {
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
            System.out.println("Hubo un error al leer los registros");
        }
        if (!str.isEmpty()) {
            str = str.substring(0, str.length() - 1);
           return reporte(str.split("-"));
        } else {
            System.out.println("No hay nada registrado");
        }
        return "";
    }
    
     public String generarReporteIndividual(String id) {
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
            System.out.println("Hubo un error al leer los registros");
        }
        if (!str.isEmpty()) {
            str = str.substring(0, str.length() - 1);
            String persons[] = str.split("-");
            String person ="";
            for(int i = 0; i < persons.length; i++){
                if(persons[i].contains(id)){
                    person+= persons[i] + "-";
                }
            }
            
            if(!person.isEmpty()){
                person = person.substring(0, person.length() - 1);
                 return reporte(person.split("-"));
            }else{
             System.out.println(id + " no esta registrado.");
            }
        } else {
            System.out.println("No hay nada registrado");
        }
        
        return "";

    }

    public String reporte(String[] text) {
        String person="";
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
            person+= CI + "-" + totalEquipos + "-" + totalMonto+ "#";
        }
        return person.substring(0, person.length() - 1);
    }
}
