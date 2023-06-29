package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionarEmpresa {
    
    private Conexion c;
    private Connection cn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public GestionarEmpresa(){       
        this.c = new Conexion();
        this.rs = null;
        this.ps = null;        
        this.cn = null;
    }
    
    public boolean insertarEmpresa(Empresa p){
        boolean respuesta = false;
         try {  
            cn = c.conectar();
            ps = cn.prepareStatement("INSERT INTO empresa (usuario,contrasenia,razonsocial,tel,email,direccion,localidad,provincia,rubro,calificacion,logo) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
             System.out.println("valor de logo:"+p.getLogo());
            ps.setString(1, p.getUsuario());
            ps.setString(2, p.getContrasenia());
            ps.setString(3, p.getRazonSocial());
            ps.setInt(4, p.getTel());
            ps.setString(5, p.getEmail());
            ps.setString(6, p.getDireccion());
            ps.setString(7, p.getLocalidad());
            ps.setString(8, p.getProvincia());
            ps.setString(9, p.getRubro());
            ps.setInt(10, p.getCalificacion());
            ps.setString(11, p.getLogo());
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
    
    public boolean borrarEmpresa(int idempresa){
        boolean respuesta = false;
        try {           
            cn = c.conectar();
            ps = cn.prepareStatement("DELETE FROM empresa WHERE idempresa=?");
            ps.setInt(1, idempresa);
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
    
    public boolean modificarEmpresa(Empresa p){
        boolean respuesta = false;
        try {    
            cn = c.conectar();
            ps = cn.prepareStatement("UPDATE empresa SET usuario=?, contrasenia=?, razonsocial=?, tel=?, email=?, direccion=?, localidad=?, provincia=?, rubro=?, calificacion=? , logo=? WHERE idempresa=?");
            ps.setString(1, p.getUsuario());
            ps.setString(2, p.getContrasenia());
            ps.setString(3, p.getRazonSocial());
            ps.setInt(4, p.getTel());
            ps.setString(5, p.getEmail());
            ps.setString(6, p.getDireccion());
            ps.setString(7, p.getLocalidad());
            ps.setString(8, p.getProvincia());
            ps.setString(9, p.getRubro());
            ps.setInt(10, p.getCalificacion());
            ps.setString(11, p.getLogo());
            ps.setInt(12, p.getId());
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
    
    public Empresa buscarEmpresa(String usuario, String contrasenia){
        Empresa p = new Empresa();
        try {            
            cn = c.conectar();               
            ps = cn.prepareStatement("SELECT * FROM empresa WHERE usuario=? and contrasenia=?");
            ps.setString(1, usuario);
            ps.setString(2, contrasenia);
            rs = ps.executeQuery();
            if(rs.next()){               
                p.setId(rs.getInt(1));
                p.setUsuario(rs.getString(2));
                p.setContrasenia(rs.getString(3));
                p.setRazonSocial(rs.getString(4));
                p.setTel(rs.getInt(5));
                p.setLocalidad(rs.getString(6));
                p.setDireccion(rs.getString(7));
                p.setLocalidad(rs.getString(8));
                p.setProvincia(rs.getString(9));
                p.setRubro(rs.getString(10));
                p.setCalificacion(rs.getInt(11));
                p.setLogo(rs.getString(12));
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
            ps = cn.prepareStatement("SELECT * FROM empresa WHERE usuario=? or email=?");
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
