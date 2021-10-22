import java.lang.module.InvalidModuleDescriptorException;
import java.sql.*;



public class lecturaDatos {

    private static final String url = "jdbc:mysql://localhost:3306/canciones";
    private static final String usuario = "pablo";
    private static final String contraseña = "admin1";


public static Connection conexion(){

    Connection conexion = null;

    try{

        conexion = DriverManager.getConnection(url, usuario, contraseña);

        System.out.println("Conectado con exito");

    } catch (SQLException e) {
        System.out.println("Error el la conexion");
    } catch (InvalidModuleDescriptorException e){
        System.out.println("error pam");
    }
    return conexion;
}



    public static void main(String[] args) {

conexion();

    }
}
