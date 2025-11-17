package model;

public class CentroCultivo {
    private String nombre;
    private String comuna;
    private int toneladas;

    public CentroCultivo() {}

    public CentroCultivo(String nombre, String comuna, int toneladas) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.toneladas = toneladas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    @Override
    public String toString() {
        return "CentroCultivo{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                ", toneladas=" + toneladas +
                '}';
    }
}
