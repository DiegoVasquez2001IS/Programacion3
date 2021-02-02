package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Diego
 */
public class Conexion {
    private final String base = "migracion";
    private final String user = "root";
    private final String password = "informaticdv2016";
    private final String url = "jdbc:mysql://localhost/" + base;
    private Connection con = null;
   
    public Connection getConexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
        }
        catch(SQLException | ClassNotFoundException ex)
        {
            System.out.println(ex);
        }
       
       return con;
    }
}