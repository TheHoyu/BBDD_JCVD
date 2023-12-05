/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package xml_jakarta.bbdd_juegos;

import java.sql.*;

/**
 *
 * @author Hoyu
 */
public class BBDD_Juegos {
        ///jdbc:mysql://localhost:3306/bbdd
        ///jbdc:[tipo]://[IP]:[puerto]/basededatos
        // datos para lac onexión a la  bbdd 
        static final String DB_URL = "jdbc:mysql://localhost:3306/datagaming"; // dirección de mi local hosto 
        static final String USER ="GM"; // usuario
        static final String PASS ="1234"; // contraseña 
        static final String QUERY = "SELECT * FROM videojuegos"; // consulta de prueba 

        
    public static void main(String[] args) {

      try{Connection conn = DriverManager.getConnection(DB_URL,USER,PASS); // conexión , de la bbdd , la cual usa los parameetros 
          // introducidos antes , para acceder 
      
      Statement stmt =  conn.createStatement(); // creamosun Statement (sentencia) 
          // la cual nos ayuda a procesar una sentecia sql y obtener resultados. 
      ResultSet rs = stmt.executeQuery(QUERY); // usando el Statemnte -, obtenemos un ResulSet , a traves de nuestra query
      //extraemos la info del set de resultados 
      
        while(rs.next()){// cuando el resultado pase a la siguiente linea , ( porque leealgo ) 
        
                       
                
            // OBTENEMOS INFO SEGUN EL NOMBRE DE LA COLUMNA
            System.out.println("Id: "+rs.getInt("id")); // sacamos la id del juego, con el metodo getInt, obtenemos el id del juego
            System.out.println("Nombre: "+rs.getString("Nombre"));// sacamos el nombre del juego, con el metodo getString, obtenemos el nombre del juego
            System.out.println("Genero: "+rs.getString("Genero")); // scamos el genero del juego, con getString, 
            System.out.println("Fecha de lanzamiento: "+rs.getDate("FechaLanzamiento"));// sacamos la fecha
            System.out.println("Compañia: "+rs.getString("Compañia"));// sacamos la compañia 
            System.out.println("Precio: "+rs.getFloat("Precio"));//scamos su precio 
            System.out.println("-------------------------------------------");
            
           

        }
        ////////////// INSERTAR /////////////////////////
//                   // INSERTAR AQUI UN NUEVO JUEGO : 
//            String insert = "INSERT INTO `videojuegos`"
//                    + " (`Id`, `Nombre`, `Genero`, `FechaLanzamiento`, `Compañia`, `Precio`)"
//                    + " VALUES (NULL, 'LAS AVENTURAS DE MANDALOR', 'tiros', '2023-11-01', 'Noentiendo', '80')";
//
//            Statement IN = conn.createStatement();
//       
//            IN.executeUpdate(insert);



        ////////////// BORRAR /////////////////////////
                   // INSERTAR AQUI UN NUEVO JUEGO : 
            String insert = "DELETE FROM videojuegos WHERE id  = 11;";

            Statement IN = conn.createStatement();
       
            IN.executeUpdate(insert);
          
            stmt.close();
            IN.close();
            
      }catch(SQLException e){
          e.printStackTrace(); 
      }
      finally{

      }
       
//        System.out.println("Hello World!");
    }
}
