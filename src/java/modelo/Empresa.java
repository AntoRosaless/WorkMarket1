package modelo;

import java.util.ArrayList;

public class Empresa {
    
    private int id;
    private String usuario;
    private String contrasenia;
    private String razonSocial;
    private int tel;
    private String email;
    private String direccion;
    private String localidad;
    private String provincia;
    private String rubro;
    private int calificacion;
    private String logo;
    private ArrayList<PublicacionE> publicaciones;

    public Empresa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public ArrayList<PublicacionE> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<PublicacionE> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", razonSocial=" + razonSocial + ", tel=" + tel + ", email=" + email + ", direccion=" + direccion + ", localidad=" + localidad + ", provincia=" + provincia + ", rubro=" + rubro + ", calificacion=" + calificacion + ", logo=" + logo + '}';
    }
    
}
