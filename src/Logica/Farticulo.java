
package Logica;

import Datos.Varticulo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Farticulo {
   
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalRegistros;
      
    
    public boolean insertar(Varticulo dts){
        //sSQL =" INSERT INTO articulo (artCod,artDesc,artTalle,artPrecioContado,artPrecioLista,artStock,catId,artFechaIngreso)VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setString(1, dts.getArticulo_codigo());
            pst.setString(2, dts.getArticulo_descripcion());
            pst.setString(3, dts.getArticulo_talle());
            pst.setDouble(4, dts.getArticulo_precio_contado());
            pst.setDouble(5, dts.getArticulo_precio_lista());
            pst.setInt(6, dts.getArticulo_stock());
            pst.setInt(7, dts.getArticulo_categoria());
            pst.setDate(8, dts.getArticulo_fecha_alta());
            
            int n = pst.executeUpdate();
            if(n!=0)
            {
                return true;
            }else
            {
                return false;
            }
        } catch (Exception e) {
             JOptionPane.showConfirmDialog(null,e);
             return false;
        }
        
        
    }
    
}
