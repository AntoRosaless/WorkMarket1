package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
        private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
        private static final String URL = "jdbc:mysql://localhost:3306/workmarket";
        private static final String USER = "root";
        private static final String PASSWORD = "1234";
        Connection conexion =null;
	
        public Conexion(){}
        
        public Connection conectar() {            
                  try {                
                           Class.forName(CONTROLADOR);
                           conexion = DriverManager.getConnection(URL,USER,PASSWORD);
                           System.out.println("Conexion Ok");
                   } catch (ClassNotFoundException | SQLException  ex) {
                           System.out.println("Error al conectar a la base de datos");
                           System.out.println(ex);              
                   }				
                   return conexion;
         }
}

