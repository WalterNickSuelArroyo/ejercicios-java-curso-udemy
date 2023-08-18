package problema;
public class Persona {
    // Atributos de la clase Persona
    private String nombre;
    private int edad;
    private String telefono;
    private String numeroControl;
    
    // Constructor de la clase Persona
    public Persona(String nombre, int edad, String telefono, String numeroControl) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.numeroControl = numeroControl;
    }

    // Métodos set y get para el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    // Métodos set y get para el atributo edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    // Métodos set y get para el atributo telefono
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }

    // Métodos set y get para el atributo numeroControl
    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
    public String getNumeroControl() {
        return numeroControl;
    }
}



