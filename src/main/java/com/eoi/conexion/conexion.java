package com.eoi.conexion;


import com.eoi.esctructura.Formulario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {
    
    private Connection openConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/banco?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "Abde.123";
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de MySQL: " + ex);
            }
        return DriverManager.getConnection(url, user, pass);
    }  
    
    
    
    public boolean create(Formulario formu) {
        int numRegAfectados;
        String insertQuery = "INSERT INTO cliente(nombre, apellido1,apellido2,dni,telefono, email,calle,numero, piso, poblacion, fechanac, cp, contrasenya) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection con;
        PreparedStatement stmt;
        try {
            con = openConnection();
            stmt = con.prepareStatement(insertQuery);
            stmt.setString(1, formu.getNombre());
            stmt.setString(2, formu.getApellido1());
            stmt.setString(3, formu.getApellido2());
            stmt.setString(4, formu.getDni());// ojo porque ahora es un array
            stmt.setString(5, formu.getTelefono());
            stmt.setString(6, formu.getEmail());
            stmt.setString(7, formu.getCalle());
            stmt.setString(8, formu.getNumero());
            stmt.setString(9, formu.getPiso());
            stmt.setString(10, formu.getPoblacion());
            stmt.setString(11, formu.getFechanac());
            stmt.setString(12, formu.getCp());
            stmt.setString(13, formu.getContrasenya());
            System.out.println("Ejecutando la query: " + insertQuery);
            
            		    	
            numRegAfectados = stmt.executeUpdate();
            System.out.println("Registros afectados: " + numRegAfectados);
            stmt.close();
            stmt.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
}
