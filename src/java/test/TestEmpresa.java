package test;

import modelo.Empresa;
import modelo.GestionarEmpresa;

public class TestEmpresa {
    
    public static void main(String[] args){
        /*
        //Prueba de insertar un Empresa
        Empresa p = new Empresa();
        p.setUsuario("usuario");
        p.setContrasenia("contrasenia");
        p.setRazonSocial("razon");
        p.setTel(11254785);
        p.setEmail("email");
        p.setDireccion("direccion");
        p.setLocalidad("localidad");
        p.setProvincia("provincia");
        p.setRubro("rubro");
        p.setCalificacion(10);
        p.setLogo("logo");
        GestionarEmpresa ge = new GestionarEmpresa();
        System.out.println(ge.insertarEmpresa(p));
        */
        
        /*
        //Prueba de modificar un Empresa
        Empresa p = new Empresa();
        p.setId(5);
        p.setUsuario("usuario1");
        p.setContrasenia("contrasenia1");
        p.setRazonSocial("razon1");
        p.setTel(112547851);
        p.setEmail("email1");
        p.setDireccion("direccion1");
        p.setLocalidad("localidad1");
        p.setProvincia("provincia1");
        p.setRubro("rubro1");
        p.setCalificacion(101);
        p.setLogo("logo1");
        GestionarEmpresa gp = new GestionarEmpresa();
        System.out.println(gp.modificarEmpresa(p));
        */
        
        /*
        //Prueba de borrar un Empresa
        GestionarEmpresa gp = new GestionarEmpresa();
        System.out.println(gp.borrarEmpresa(3));
        */
        
       /*
        //Prueba de buscar por usuario y contrasenia
        GestionarEmpresa gp = new GestionarEmpresa();
        Empresa p = new Empresa();
        p = gp.buscarEmpresa("a1", "a2");
        if (p.getUsuario()==null){
            System.out.println("usuario contrasenia incorrecta");
        }else{
            System.out.println(p.toString());
        }
        */
        
       /*
       //prueba existe el usuario y el email a registrar
       GestionarEmpresa gp = new GestionarEmpresa();
       if (gp.existeUsuarioEmail("a19", "a56")){
           System.out.println("usuario o el email estan registrados");
       }else{
           System.out.println("registro exitoso");
       }
       */
    }
}

