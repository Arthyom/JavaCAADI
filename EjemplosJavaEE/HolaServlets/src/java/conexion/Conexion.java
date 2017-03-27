/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 *
 * @author frodo
 */
public class Conexion {
    
    public String url = "jdbc:mysql://localhost/ejemplo1";
    public String user = "root";
    public String pass = "";
     public Connection cn;
     
    public  Conexion()
     {}
    
    
     public String conectar ( )
     {
         try {
             Class.forName("com.mysql.jdbc.Driver");
             this.cn = DriverManager.getConnection( url, user, pass);
             
             if ( cn != null ){
                 System.out.println(" se ha conectado con exito!" );
                 Statement cons = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                 ResultSet res = cons.executeQuery("SELECT * FROM usuarios");
                 
                 String Salida = "";
                 boolean sig = res.next();
                 
                 while( sig )
                 {
                     Salida += ( res.getString(2)+ " \n") ;
                     sig = res.next();
                 }
                 
                 return Salida;
                 
             }
             
         } catch (Exception e) {
             System.out.println( "error al conectar");
         } 
         
         return "error!";
     }
     
  
     
    
}
