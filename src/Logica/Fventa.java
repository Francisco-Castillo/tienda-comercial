
package Logica;

import Datos.Vventa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Fventa {
     private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL="";
    private String sSQL2="";
    public Integer productos_cargados;
    
   /* public DefaultTableModel mostrar (String buscar){
        DefaultTableModel modelo ;
        String [] titulos={"No.Cpbte","Cliente","Producto","Precio Unidad","Cantidad","Fecha"};
        String [] registro = new String[6];
        productos_cargados=0;
        //modelo = new DefaultTableModel(null,titulos);
        //sSQL = "SELECT * FROM productos WHERE proDescripcion LIKE '%"+buscar+"%'ORDER BY proCod";
        /*try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL;
            
            while(rs.next())
            {
                registro[0]=rs.getString("proCod");
                registro[1]=rs.getString("proDescripcion");
                registro[2]=rs.getString("proPrecio");
                registro[3]=rs.getString("proCantidad");
                registro[4]=rs.getString("proFechaAlta");
                registro[5]=rs.getString("rubCod");
                
                productos_cargados++;
                modelo.addRow(registro);
              
                
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e);
            return null;
        }
 
                
    }*/
    
    public boolean insertar(Vventa dts){
        
        sSQL ="INSERT INTO ventas(venNumCompbte,cliCod,proCod,propreciunitario,venCantidad,venFecha)VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getNumero_comp());
            pst.setInt(2, dts.getCli_cod());
            pst.setInt(3, dts.getPro_cod());
            pst.setDouble(4, dts.getPrecio_unitario());
            pst.setInt(5, dts.getCantidad_venta());
            pst.setString(6, dts.getFecha());
           
            
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
    /* public boolean editar(Vproducto dts){
         sSQL ="UPDATE productos SET proPrecio=proPrecio + 10 WHERE proCod=?";
         //sSQL2 ="UPDATE productos SET proPrecio =234.45";
         try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
             //PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            //pst.setInt(1,dts.getProCantidad());
            pst.setInt(1,dts.getProCod());
            
            
           
            
           
            int n = pst.executeUpdate();
            //int n2= pst2.executeUpdate();
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
    
   /* public boolean eliminar(Varticulos dts){
        sSQL ="DELETE FROM articulos WHERE artCod = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getArtCod());
         
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
        
    }*/
    
    
    
}
