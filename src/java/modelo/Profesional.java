package modelo;

public class Profesional {
    
    private int id;
    private String usuario;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private String localidad;
    private String tel;
    private String email;
    private String foto;
    private String titulo;
    private int calificacion;
    private PublicacionP publicacion;

    public Profesional() {
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    } 

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public PublicacionP getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(PublicacionP publicacion) {
        this.publicacion = publicacion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Profesional{" + "id=" + id + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", nombre=" + nombre + ", apellido=" + apellido + ", localidad=" + localidad + ", tel=" + tel + ", email=" + email + ", foto=" + foto + ", titulo=" + titulo + ", calificacion=" + calificacion + ", publicacion=" + publicacion + '}';
    }

}
