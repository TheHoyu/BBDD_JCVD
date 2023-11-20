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
    
        static final String DB_URL = "jdbc:mysql://localhost:3306/datagaming";
        static final String USER ="GM";
        static final String PASS ="1234";
        static final String QUERY = "SELECT * FROM videojuegos";

        
    public static void main(String[] args) {

      try{Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
      
      Statement stmt =  conn.createStatement();
      ResultSet rs = stmt.executeQuery(QUERY);
      //extraemos la info del set de resultados 
      
        while(rs.next()){
        
                       
                
            // OBTENEMOS INFO SEGUN EL NOMBRE DE LA COLUMNA
            System.out.println("Id: "+rs.getInt("id"));
            System.out.println("Nombre: "+rs.getString("Nombre"));
            System.out.println("Genero: "+rs.getString("Genero"));
            System.out.println("Fecha de lanzamiento: "+rs.getDate("FechaLanzamiento"));
            System.out.println("Compañia: "+rs.getString("Compañia"));
            System.out.println("Precio: "+rs.getFloat("Precio"));
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
