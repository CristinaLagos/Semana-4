package data;

import model.CentroCultivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class GestorDatos {

    private String rutaArchivo;

    public GestorDatos(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public List<CentroCultivo> cargarCentros() throws IOException {
        List<CentroCultivo> lista = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.trim().isEmpty()) continue;

                String[] partes = linea.split(";");

                if (partes.length != 3) {
                    System.out.println("Línea inválida: " + linea);
                    continue;
                }

                String nombre = partes[0];
                String comuna = partes[1];
                int toneladas = Integer.parseInt(partes[2]);

                CentroCultivo centro = new CentroCultivo(nombre, comuna, toneladas);

                lista.add(centro);
            }
        }

        return lista;
    }
}
