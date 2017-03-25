
package Logica;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    //public String   db  ="prueba";
    public String   db  ="insumosfc";
    public String url ="jdbc:mysql://localhost/"+db;
    public String user ="root";
    public String pass ="root";
    // hasta aqui funciona Bien se agrego private Connection link = null;
   // private Connection link = null;

    public Conexion() {
    }
    
    public Connection conectar(){
        Connection link = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link =DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return link;
    }
    
   
    
    
      
            
}