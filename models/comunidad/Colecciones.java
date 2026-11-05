import java.time.LocalDate;

public class Colecciones {
    private long id;
    private String nombre;
    private String descripcion;
    private Boolean publica;
    private LocalDate fechaCreracion;
    private Long idUsuario;

    public Colecciones() {
    }

    public Colecciones(long id, String nombre, String descripcion, Boolean publica, LocalDate fechaCreracion,
            Long idUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.publica = publica;
        this.fechaCreracion = fechaCreracion;
        this.idUsuario = idUsuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getPublica() {
        return publica;
    }

    public void setPublica(Boolean publica) {
        this.publica = publica;
    }

    public LocalDate getFechaCreracion() {
        return fechaCreracion;
    }

    public void setFechaCreracion(LocalDate fechaCreracion) {
        this.fechaCreracion = fechaCreracion;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Colecciones [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", publica=" + publica
                + ", fechaCreracion=" + fechaCreracion + ", idUsuario=" + idUsuario + "]";
    }

    
    // Constructor vacío
    public Colecciones() {
        this.elementos = new ArrayList<>();
    }

    // Constructor completo
    public Colecciones(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion; 
        this.elementos = new ArrayList<>();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getElementos() {
        return elementos;
    }

    public void setElementos(List<String> elementos) {
        this.elementos = elementos;
    }

    // Agregar elementos a la colección
    public void agregarElemento(String elemento) {
        elementos.add(elemento);
    }

    // Eliminar elementos de la colección
    public void eliminarElemento(String elemento) {
        elementos.remove(elemento);
    }

    // Mostrar información
    @Override
    public String toString() {
        return "Colecciones{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", elementos=" + elementos +
                '}';
    }
}
  

