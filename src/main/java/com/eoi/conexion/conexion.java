package com.eoi.conexion;


import com.eoi.esctructura.Formulario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
            stmt.setString(4, formu.getDni());
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
    
   /* public class consultas{
        conexion con = new conexion();
        
        Connection conect = null;
        Statement st = null;
        ResultSet rs = null;
        String query;
        
        
        
        public boolean verificar(String dni, String password) {
            int sw=0;
            query= "select * from cliente where dni='"+dni+"' and contrasenya='"+password+"'";
            
            try { 
                conect = con.openConnection();
                st=conect.createStatement();
                rs=st.executeQuery(query);
                while(rs.next()){
                if (rs.getString(1) == null)
                   sw=0; 
                else
                    sw=1;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error Sql" + ex);
            }
            return false;
            
    }
        
    }*/
    
    //---------------------------------------------------------------------------------------
    
        public boolean verificar(String dni ,String contrasenya) {
        int numRegAfectados;
        int sw=0;
        String selectQuery = "select * from cliente where dni='"+dni+"' and contrasenya='"+contrasenya+"'";
        Connection con;
        PreparedStatement stmt;
        ResultSet rs;
        String saldo;
        try {
            con = openConnection();
            stmt = con.prepareStatement(selectQuery);
            stmt.setString(1, dni);
            stmt.setString(2, contrasenya);
            
            System.out.println("Ejecutando la query: " + selectQuery);
            
            rs = stmt.executeQuery();        // Get the result table from the query  3 
            
            while(rs.next()){
                if (rs.getString(1) == null)
                    sw=0; 
                else
                    sw=1;
                }
            /*while (rs.next()) {               // Posiciona el cursor sobre toda la fila
             saldo = rs.getString(1);        // Recuperar el valor de la primera 
             System.out.println("Employee saldo = " + saldo);
                                              // Print the column values
            }*/
            rs.close();  
            
            stmt.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //---------------------------------------------------------------------------------------
    
    /*public boolean consultaSaldo(int id_cliente) {
        int numRegAfectados;
        String selectQuery = "SELECT saldo FROM cuenta WHERE idcliente = ?";
        Connection con;
        PreparedStatement stmt;
        ResultSet rs;
        String saldo;
        try {
            con = openConnection();
            stmt = con.prepareStatement(selectQuery);
            stmt.setInt(1, id_cliente);
            
            System.out.println("Ejecutando la query: " + selectQuery);
            
            rs = stmt.executeQuery();        // Get the result table from the query  3 
            while (rs.next()) {               // Posiciona el cursor sobre toda la fila
             saldo = rs.getString(1);        // Recuperar el valor de la primera 
             System.out.println("Employee saldo = " + saldo);
                                              // Print the column values
            }
            rs.close();  
            
            stmt.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
   /* public boolean consultaSaldos() {
        int numRegAfectados;
        String selectQuery = "SELECT * FROM cuenta";
        Connection con;
        PreparedStatement stmt;
        ResultSet rs;
        String saldo;
        String saldos[] = new String[10];
        String idclientes[] = new String[10];
        int i = 0;
        try {
            con = openConnection();
            stmt = con.prepareStatement(selectQuery);
            
            System.out.println("Ejecutando la query: " + selectQuery);
            
            rs = stmt.executeQuery();        // Get the result table from the query  3 
            while (rs.next()) {               // Posiciona el cursor sobre toda la fila
             saldos[i] = rs.getString(1);        // Recuperar el valor de la primera 
             idclientes[i] = rs.getString(2);        // Recuperar el valor de la segunda 
             
             System.out.println("Saldo = " + saldos[i]);
             System.out.println("IDCliente = " + idclientes[i]);

             i++;
            }
            rs.close();  
            
            stmt.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }*/
    
    //--------------------------------------------------------------------------------------------------------------------
    

    
    
    
            
}
