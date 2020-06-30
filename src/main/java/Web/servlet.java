/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import com.eoi.conexion.conexion;
import com.eoi.esctructura.Formulario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;


/**
 *
 * @author david
 */
@WebServlet("/servlet")
public class servlet extends HttpServlet {
    @Override
    //doPost porque el método usado en el formulario ha sido el Post
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        // Variables metidas por el usuario
        String nombre = request.getParameter("nombre"); // según el name que haya puesto a ese input
        String apellido1 = request.getParameter("apellido1");
        String apellido2 = request.getParameter("apellido2");
        String dni = request.getParameter("dni");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        String calle = request.getParameter("calle");
        String numero = request.getParameter("numero");
        String piso = request.getParameter("piso");
        String poblacion = request.getParameter("poblacion");
        String fechanac = request.getParameter("fechanac");
        String cp = request.getParameter("cp");
        String contrasenya = request.getParameter("password");
        
        

        
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido1: " + apellido1);
        System.out.println("Apellido2: " + apellido2);
        System.out.println("Dni/Nie: " + dni);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
        System.out.println("Calle: " + calle);
        System.out.println("Numero: " + numero);
        System.out.println("Piso: " + piso);
        System.out.println("Poblacion: " + poblacion);
        System.out.println("Fecha nacimiento: " + fechanac);
        System.out.println("CP: " + cp);
        System.out.println("Contraseña: " + contrasenya);
        
        Formulario forml = new Formulario(nombre,apellido1,apellido2,dni,telefono,email,calle,numero,piso,poblacion,fechanac,cp,contrasenya);
            
        
        conexion con = new conexion();
        con.create(forml);
        
        
    }   
    
    
    
}
