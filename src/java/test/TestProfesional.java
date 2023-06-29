package test;

import modelo.GestionarEmpresa;
import modelo.Profesional;

public class TestProfesional {
    
    public static void main(String[] args){
        /*
        //Prueba de insertar un Profesional
        Profesional p = new Profesional();
        p.setUsuario("usuario");
        p.setContrasenia("contrasenia");
        p.setNombre("nombre");
        p.setApellido("apellido");
        p.setLocalidad("localidad");
        p.setTel("tel");
        p.setEmail("email");
        p.setFoto("foto");
        p.setTitulo("titulo");
        p.setCalificacion(10);
        GestionarProfesional gp = new GestionarProfesional();
        System.out.println(gp.insertarProfesional(p));
        */
        
        /*
        //Prueba de modificar un Profesional
        Profesional p = new Profesional();
        p.setId(4);
        p.setUsuario("usuario1");
        p.setContrasenia("contrasenia1");
        p.setNombre("nombre1");
        p.setApellido("apellido1");
        p.setLocalidad("localidad1");
        p.setTel("tel1");
        p.setEmail("email1");
        p.setFoto("foto1");
        p.setTitulo("titulo1");
        p.setCalificacion(11);
        GestionarProfesional gp = new GestionarProfesional();
        System.out.println(gp.modificarProfesional(p));
        */
        
        
        /*//Prueba de borrar un Profesional
        GestionarProfesional gp = new GestionarProfesional();
        System.out.println(gp.borrarProfesional(1));
        */
        
       /*
        //Prueba de buscar por usuario y contrasenia
        GestionarProfesional gp = new GestionarProfesional();
        Profesional p = new Profesional();
        p = gp.buscarProfesional("a1", "a2");
        if (p.getUsuario()==null){
            System.out.println("usuario contrasenia incorrecta");
        }else{
            System.out.println(p.toString());
        }
        */
        
       /*
       //prueba existe el usuario y el email a registrar
       GestionarProfesional gp = new GestionarProfesional();
       if (gp.existeUsuarioEmail("a11", "a71")){
           System.out.println("usuario o el email estan registrados");
       }else{
           System.out.println("registro exitoso");
       }
       */
    }
}
