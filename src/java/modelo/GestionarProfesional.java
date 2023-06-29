package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionarProfesional {
    
    private Conexion c;
    private Connection cn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public GestionarProfesional(){       
        this.c = new Conexion();
        this.rs = null;
        this.ps = null;        
        this.cn = null;
    }
    
    public boolean insertarProfesional(Profesional p){
        boolean respuesta = false;
        try {  
            
            cn = c.conectar();
            ps = cn.prepareStatement("INSERT INTO profesional (usuario,contrasenia,nombre,apellido,localidad,tel,email,foto,titulo,calificacion) VALUES (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, p.getUsuario());
            ps.setString(2, p.getContrasenia());
            ps.setString(3, p.getNombre());
            ps.setString(4, p.getApellido());
            ps.setString(5, p.getLocalidad());
            ps.setString(6, p.getTel());
            ps.setString(7, p.getEmail());
            ps.setString(8, p.getFoto());
            ps.setString(9, p.getTitulo());
            ps.setInt(10, p.getCalificacion());
            int res = ps.executeUpdate(); 
            respuesta = res>0;
        } catch (SQLException e) {
        }finally {
            try {
                if (rs!=null) {rs.close();}
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
            } catch (SQLException e2) {
            }
        }    
        return respuesta;
    }
    
    public boolean borrarProfesional(int idprofesional){
        boolean respuesta = false;
        try {           
            cn = c.conectar();
            ps = cn.prepareStatement("DELETE FROM profesional WHERE idprofesional=?");
            ps.setInt(1, idprofesional);
            int res = ps.executeUpdate();
            respuesta = res>0;
        } catch (SQLException e) {
        }finally {
            try {                
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
            } catch (SQLException e2) {
            }
        }    
        return respuesta;
    }
    
    public boolean modificarProfesional(Profesional p){
        boolean respuesta = false;
        try {    
            cn = c.conectar();
            ps = cn.prepareStatement("UPDATE profesional SET usuario=?, contrasenia=?, nombre=?, apellido=?, localidad=?, tel=?, email=?, foto=?, titulo=?, calificacion=? WHERE idprofesional=?");
            ps.setString(1, p.getUsuario());
            ps.setString(2, p.getContrasenia());
            ps.setString(3, p.getNombre());
            ps.setString(4, p.getApellido());
            ps.setString(5, p.getLocalidad());
            ps.setString(6, p.getTel());
            ps.setString(7, p.getEmail());
            ps.setString(8, p.getFoto());
            ps.setString(9, p.getTitulo());
            ps.setInt(10, p.getCalificacion());
            ps.setInt(11, p.getId());
            int res = ps.executeUpdate();                        
            respuesta = res>0;
        } catch (SQLException e) {
        }finally {
            try {                
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
            } catch (SQLException e2) {
            }
        }    
        return respuesta;
    }
    
    public Profesional buscarProfesional(String usuario, String contrasenia){
        Profesional p = new Profesional();
        try {            
            cn = c.conectar();               
            ps = cn.prepareStatement("SELECT * FROM profesional WHERE usuario=? and contrasenia=?");
            ps.setString(1, usuario);
            ps.setString(2, contrasenia);
            rs = ps.executeQuery();
            if(rs.next()){               
                p.setId(rs.getInt(1));
                p.setUsuario(rs.getString(2));
                p.setContrasenia(rs.getString(3));
                p.setNombre(rs.getString(4));
                p.setApellido(rs.getString(5));
                p.setLocalidad(rs.getString(6));
                p.setTel(rs.getString(7));
                p.setEmail(rs.getString(8));
                p.setFoto(rs.getString(9));
                p.setTitulo(rs.getString(10));
                p.setCalificacion(rs.getInt(11));
            }
        } catch (SQLException e) {
        }finally {
            try {
                if (rs!=null) {rs.close();}
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
            } catch (SQLException e2) {
            }
        }    
        return p;
    }
    public boolean existeUsuarioEmail(String usuario, String email){
        boolean b =false;
        try {     
            cn = c.conectar();               
            ps = cn.prepareStatement("SELECT * FROM profesional WHERE usuario=? or email=?");
            ps.setString(1, usuario);
            ps.setString(2, email);
            rs = ps.executeQuery();
            if(rs.next()){               
                b=true;
            }
        } catch (SQLException e) {
        }finally {
            try {
                if (rs!=null) {rs.close();}
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
            } catch (SQLException e2) {
            }
        }    
        return b;
    }
}
