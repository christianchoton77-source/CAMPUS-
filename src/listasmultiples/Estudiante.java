package listasmultiples;

public class Estudiante {
        private String nombre;
        private String codigo;
        private NodoCurso cabeza;

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cabeza = null;
    }
        
    public void matricular(Curso curso) {
        NodoCurso nuevo = new NodoCurso(curso);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }    
    
    public void mostrar() {
        NodoCurso actual = cabeza;
        
        while(actual != null) {
            System.out.println(actual.curso);
            actual = actual.siguiente;
        }
    }
}
