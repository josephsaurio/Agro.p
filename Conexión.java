/*Con este codigo vamos a poder conectarnos a la base de datos sin tener que estar todo
el tiempo escribiendo esas lineas de codigo*/
package clases;

//Sebas
import java.sql.*;
//---

public class Conexión {
    //Conexión Local
    public static Connection conectar(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/agrop", "root", "1846583467");
            return cn;
            
        }
        catch(SQLException e){   
            System.out.println("Error en conexión local" + e);
        }
        return (null);
    }
}
