public abstract class Persona {
    float peso;
    int estatura;
    String nombre;
    String cedula;

    public Persona(float peso, int estatura, String nombre, String cedula) {
        this.peso = peso;
        this.estatura = estatura;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }


}
