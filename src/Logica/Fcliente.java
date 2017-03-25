package Logica;

import Datos.Vcliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fcliente {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalRegistros;

     
    
    public DefaultTableModel buscarApellido(String apellido) {

        DefaultTableModel modelo;

        String[] titulos = {"Id","Cliente","Documento","Fec.Nac", "Domicilio", "Barrio", "Ciudad", "Localidad", "Telefono", "Email", "Fecha de Alta"};

        String[] registro = new String[11];

        totalRegistros = 0;

        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT c.id,c.cliCod,pers.nombre,pers.apellido,pers.fechanac,pers.numdni,pers.domicilio,pers.numdomicilio,"+
                "pers.barrio,pers.codProv,prov.provDescripcion,pers.localidad,pers.telefono,"+
                "pers.email,pers.fechaalta FROM clientes c INNER JOIN personas pers ON c.id = pers.id "+
                "INNER JOIN provincias prov ON prov.codProv = pers.codProv WHERE apellido LIKE '%"
                + apellido + "%'ORDER BY pers.apellido ASC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("c.id");
                registro[1] = rs.getString("pers.apellido")+" "+rs.getString("pers.nombre");
                registro[2] = rs.getString("pers.numdni");
                registro[3] = rs.getString("pers.fechanac");
                registro[4] = rs.getString("pers.domicilio")+" "+rs.getString("pers.numdomicilio");
                registro[5] = rs.getString("pers.barrio");
                registro[6] = rs.getString("prov.provDescripcion");
                registro[7] = rs.getString("pers.localidad");
                registro[8] = rs.getString("pers.telefono");
                registro[9] = rs.getString("pers.email");
                registro[10] = rs.getString("pers.fechaalta");
                
                totalRegistros++;
                modelo.addRow(registro);

            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

        
    
    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"Id","Cliente","Documento","Fec.Nac", "Domicilio", "Barrio", "Ciudad", "Localidad", "Telefono", "Email", "Fecha de Alta"};

        String[] registro = new String[11];

        totalRegistros = 0;

        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT c.id,c.cliCod,pers.nombre,pers.apellido,pers.fechanac,pers.numdni,pers.domicilio,pers.numdomicilio,"+
                "pers.barrio,pers.codProv,prov.provDescripcion,pers.localidad,pers.telefono,"+
                "pers.email,pers.fechaalta FROM clientes c INNER JOIN personas pers ON c.id = pers.id "+
                "INNER JOIN provincias prov ON prov.codProv = pers.codProv WHERE numdni LIKE '%"
                + buscar + "%'ORDER BY pers.apellido ASC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("c.id");
                registro[1] = rs.getString("pers.apellido")+" "+rs.getString("pers.nombre");
                registro[2] = rs.getString("pers.numdni");
                registro[3] = rs.getString("pers.fechanac");
                registro[4] = rs.getString("pers.domicilio")+" "+rs.getString("pers.numdomicilio");
                registro[5] = rs.getString("pers.barrio");
                registro[6] = rs.getString("prov.provDescripcion");
                registro[7] = rs.getString("pers.localidad");
                registro[8] = rs.getString("pers.telefono");
                registro[9] = rs.getString("pers.email");
                registro[10] = rs.getString("pers.fechaalta");
                
                totalRegistros++;
                modelo.addRow(registro);

            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Vcliente dts) {

        sSQL = "INSERT INTO personas(nombre,apellido,fechanac,idTipo,numdni,domicilio,numdomicilio,barrio,codProv,localidad,telefono,email,fechaalta)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        sSQL2 = "INSERT INTO clientes(id,cliCod)"
                + "VALUES((SELECT id FROM personas ORDER BY id DESC LIMIT 1),?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());

            pst.setString(2, dts.getApellido());

            pst.setDate(3, dts.getFechanac());

            pst.setInt(4, dts.getTipoDni());

            pst.setString(5, dts.getNumDni());

            pst.setString(6, dts.getDomicilio());

            pst.setString(7, dts.getNumdomicilio());

            pst.setString(8, dts.getBarrio());

            pst.setInt(9, dts.getCiudad());

            pst.setString(10, dts.getLocalidad());

            pst.setString(11, dts.getTelefono());

            pst.setString(12, dts.getEmail());

            pst.setDate(13, dts.getFechaalta());

            //PARAMEROS PARA SSQL3 
            pst2.setString(1, dts.getCliCod());

            int n = pst.executeUpdate();
            if (n != 0) {
                int n2 = pst2.executeUpdate();
                if (n2 != 0) {
                    return true;
                } else {
                    return false;

                }
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    /*public boolean editar(Vcliente dts) {
     sSQL = "UPDATE personas SET nombre=?,apellido=?,tipoDocumento=?,numeroDocumento=?,direccion=?,telefono=?,email=? WHERE id =?";
     sSQL2 = "UPDATE clientes SET cliCod=? WHERE id =?";
     try {
     PreparedStatement pst = cn.prepareStatement(sSQL);
     PreparedStatement pst2 = cn.prepareStatement(sSQL2);
     pst.setString(1, dts.getNombre());
     pst.setString(2, dts.getApellido());
     pst.setString(3, dts.getTipo_documento());
     pst.setString(4, dts.getNumero_documento());
     pst.setString(5, dts.getDireccion());
     pst.setString(6, dts.getTelefono());
     pst.setString(7, dts.getEmail());
     pst.setInt(8, dts.getId());

     pst2.setString(1, dts.getCodigo_cliente());
     pst2.setInt(2, dts.getId());
           

     int n = pst.executeUpdate();
     if (n != 0) {
     int n2 = pst2.executeUpdate();
     if (n2 != 0) {
     return true;
     } else {
     return false;

     }
     } else {
     return false;
     }
     } catch (Exception e) {
     JOptionPane.showConfirmDialog(null, e);
     return false;
     }

     }

     public boolean eliminar(Vcliente dts) {
     sSQL = "DELETE FROM clientes WHERE id = ?";
     sSQL2 = "DELETE FROM personas WHERE id = ?";
     try {
     PreparedStatement pst = cn.prepareStatement(sSQL);
     PreparedStatement pst2 = cn.prepareStatement(sSQL2);
          
     pst.setInt(1, dts.getId());

          
     pst2.setInt(1, dts.getId());
           

     int n = pst.executeUpdate();
     if (n != 0) {
     int n2 = pst2.executeUpdate();
     if (n2 != 0) {
     return true;
     } else {
     return false;

     }
     } else {
     return false;
     }
     } catch (Exception e) {
     JOptionPane.showConfirmDialog(null, e);
     return false;
     }

     }*/
}
