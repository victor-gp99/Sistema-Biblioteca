package sistemabiblioteca;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

class Conector {
    
    
    public Connection miconector = null;
     String pwd= "";
     
     public Conector()  {
         try {
             
           Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
          String url = "jdbc:mysql://localhost:3306/Veterinariav1";
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
