
package Logica;

import Datos.Dcategoria;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Fcategoria {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalRegistros;
    
    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"Codigo","Categoria","Descripcion"};

        String[] registro = new String[3];

        totalRegistros = 0;

        modelo = new DefaultTableModel(null, titulos);

      
        try {
            PreparedStatement pst = cn.prepareStatement("{call spmostrar_categoria()}");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("idcategoria");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("descripcion");
                
                
                totalRegistros++;
                modelo.addRow(registro);

            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    
       public boolean insertar(Dcategoria dts){
          try {
                // Llamada al procedimiento almacenado
                CallableStatement cst = cn.prepareCall("{call spinsertar_categoria (?,?,?)}");
                cst.setString(1, dts.getNombre());
                cst.setString(2, dts.getDescripcion());
              
                cst.execute();
               
                

            } catch (SQLException ex) {
                //Logger.getLogger(FrmEjercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
         
        
      }
       
       public boolean eliminar(Dcategoria dts){
          try {
                // Llamada al procedimiento almacenado
                CallableStatement cst = cn.prepareCall("{call speliminar_categoria (?)}");
                cst.setInt(1, dts.getId_categoria());
                
              
                cst.execute();
               
                

            } catch (SQLException ex) {
                //Logger.getLogger(FrmEjercicios.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
         
        
      }
       
   
           
       }
       
     
      
  
