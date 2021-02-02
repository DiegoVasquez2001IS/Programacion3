package Modelo;

import Controlador.Citas;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author Diego
 */
public class MantCitas extends Conexion {
    
    public boolean registrarCita(Citas citas)
    {
        PreparedStatement ps=null;
        Connection con = getConexion();
        
        try
        {
            String sql="INSERT INTO cita_pasaporte VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = (PreparedStatement) con.prepareStatement(sql);
            
            ps.setInt(1, 0);
            ps.setInt(2, citas.getDpi_persona());
            ps.setString(3, citas.getNombre_persona());
            ps.setString(4, citas.getApellidos_persona());
            ps.setString(5, citas.getCorreo_persona());
            ps.setString(6, citas.getCelular_persona());
            ps.setString(7, citas.getFecha_cita());
            ps.setString(8, citas.getHora_cita());
            ps.setString(9, citas.getSede_migracion());
            ps.setString(10, citas.getAltura_persona());
            ps.setString(11, citas.getTez_persona());
            ps.setString(12, citas.getOjos_persona());
            ps.setString(13, citas.getOcupacion_persona());
            ps.setInt(14, citas.getNum_boleta());
            ps.setInt(15, citas.getNum_recibo());
            ps.execute();
            return true;
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
            return false;
        }
        finally
        {
            try
            {
                con.close();
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            }
        }
    }
    
    public boolean cita_disponible(Citas cita)
    {
        PreparedStatement ps=null;
        Connection con = getConexion();
        ResultSet rs=null;
        
        try
        {
            String sql="SELECT COUNT(*) AS num_citas FROM cita_pasaporte WHERE (fecha_cita=? AND hora_cita=?) AND sede_migracion=?";
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, cita.getFecha_cita());
            ps.setString(2, cita.getHora_cita());
            ps.setString(3, cita.getSede_migracion());
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                if(rs.getInt("num_citas")>10)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
            else
            {
                return false;
            }
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            return false;
        }
        finally
        {
            try
            {
                con.close();
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            }
        }
    }
}
