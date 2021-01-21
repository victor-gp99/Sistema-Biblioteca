/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author Luna
 */
class Conector {
    
    
    public Connection miconector = null;
     String pwd= "";

    public Conector()  {
         try {
             
           Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
             String url = null;
          
           miconector = DriverManager.getConnection(url, "root", pwd);
          
         if(miconector!=null)System.out.println("conexion exitosa");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void cerrar(){
        try{
            miconector.close();
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
}
