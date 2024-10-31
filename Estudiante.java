public class Estudiante extends Persona implements Evaluable{
    private float nota;

    public Estudiante(float peso, int estatura, String nombre, String cedula, float nota) {
        super(peso, estatura, nombre, cedula);
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("Cedula: %s\nNombre: %s\nNota: %.2f \nEstatura:", this.cedula, this.nombre, this.nota);

    }

    @Override
    public boolean esAprobado() {
        return this.nota >= 10;
    }
}
