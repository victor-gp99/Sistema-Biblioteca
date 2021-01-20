
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
        int seleccion;
        while(true){
            String opciones[]={"Andy","Harry","PP","Victor","DB OFFLINE","Salir"};
            seleccion=JOptionPane.showOptionDialog(null, "¿Quién se conecta a la BD?", "MySQL", 0, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
            switch(seleccion){
                case 0:
                    if(createConnection("andy", "prueba","25.13.55.58:3306"))
                        break;
                    else{
                        JOptionPane.showMessageDialog(null, "Te equivocaste de botón", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }   
                case 1:
                    if(createConnection("root", "root","localhost:3306"))
                        break;
                    else{
                        JOptionPane.showMessageDialog(null, "Te equivocaste de botón", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }   
                case 2:
                    if(createConnection("pepon", "admin","25.13.55.58:3306"))
                        break;
                    else{
                        JOptionPane.showMessageDialog(null, "Te equivocaste de botón", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }
                case 3:
                    if(createConnection("victornsn", "admin","25.13.55.58:3306"))
                        break;
                    else{
                        JOptionPane.showMessageDialog(null, "Te equivocaste de botón", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }               
                case 4:
                    new LibreriaUI().setVisible(true);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    continue;
            }
            break;
        }
        if(seleccion!=4)
            new LibreriaUI(con).setVisible(true);
        
    }
    
    static boolean createConnection(String user,String pass,String url){
        String db="libreriafinal", u=user, p=pass;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"+url+"/"+db, u, p );
            System.out.println("Connection MYSQL database "+db+" succesful as "+u);
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LibreriaUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
