
package sistemabiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class AppSistemaBiblioteca {
    static Connection con;
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        System.out.println("Prueba actualización...");
        System.out.println("Test - Diego");
        System.out.println("commit");
        System.out.println("Soy el victorensen");
        System.out.println("PP");
        System.out.println("Ing Software");
        while(true){
            String opciones[]={"Andy","Diego","PP","Victor","Salir"};
            int seleccion=JOptionPane.showOptionDialog(null, "¿Quién se conecta a la BD?", "MySQL", 0, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
            switch(seleccion){
                case 0:
                    if(createConnection("andy", "prueba"))
                        break;
                    else{
                        JOptionPane.showMessageDialog(null, "Te equivocaste de botón", "Errror", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }   
                case 1:
                    if(createConnection("root", "root"))
                        break;
                    else{
                        JOptionPane.showMessageDialog(null, "Te equivocaste de botón", "Errror", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }   
                case 2:
                    if(createConnection("pepon", "admin"))
                        break;
                    else{
                        JOptionPane.showMessageDialog(null, "Te equivocaste de botón", "Errror", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }
                case 3:
                    if(createConnection("victornsn", "admin"))
                        break;
                    else{
                        JOptionPane.showMessageDialog(null, "Te equivocaste de botón", "Errror", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }               
                case 4:
                    System.exit(0);
                    break;
                default:
                    continue;
            }
            break;
        }
        new LibreriaUI(con).setVisible(true);
        
    }
    
    static boolean createConnection(String user,String pass){
        String db="mydb", u=user, p=pass;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://25.13.55.58:3306/"+db, u, p );
            System.out.println("Connection MYSQL database "+db+" succesful as "+u);
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LibreriaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
