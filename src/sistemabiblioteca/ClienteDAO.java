package sistemabiblioteca;

/**
 *
 * @author Luna
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


class ClienteDAO {
    
    
     Connection conector = null;
    public ClienteDAO(Connection conn){
        conector = conn;
    }
     public int agregarCliente(ClienteDTO Cliente) {
        PreparedStatement objetoSentSql=null;
        ResultSet generatedKeys = null;
        int id = 0;
        
        String sql = "INSERT INTO Clientes " + "(nombre, apellidos, domicilio, telefono)"
                      +"VALUES(?,?,?,?)";
        try{
            conector.setAutoCommit(false);
            objetoSentSql = conector.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS );
            objetoSentSql.setString(1, Cliente.getNombre());
            objetoSentSql.setString(2, Cliente.getApellidos());
            objetoSentSql.setString(3, Cliente.getDomicilio());
            objetoSentSql.setString(4, Cliente.getTelefono());
            objetoSentSql.setString(5, Cliente.getMail());
            objetoSentSql.executeUpdate();
            generatedKeys = objetoSentSql.getGeneratedKeys();
            if (generatedKeys.next()) {
                id = generatedKeys.getInt(1);
            }
            conector.commit();      
        }catch(SQLException ex){
            try{
                conector.rollback();
            }catch(SQLException exl){
                System.out.println("Error en recuperacion de transaccion");
            }
        }
        
       return id; 
    }
     
     public List<ClienteDTO> clientegeneralDAO (){
         List<ClienteDTO> cliente = new ArrayList<>();
         PreparedStatement consulta= null;
         ResultSet resultSet = null;
         String consultaSQL = "SELECT "+" * "+"FROM Clientes";
         
         try{
             consulta = conector.prepareStatement(consultaSQL);
             resultSet = consulta.executeQuery();
             
             while (resultSet.next()){
                 ClienteDTO uncliente = new ClienteDTO();
                 uncliente.setIdcliente(resultSet.getInt(1));
                 uncliente.setNombre(resultSet.getString(2));
                 uncliente.setApellidos(resultSet.getString(3));
                 uncliente.setDomicilio(resultSet.getString(4));
                 uncliente.setTelefono(resultSet.getString(5));
                 uncliente.setMail(resultSet.getString(6));
                  cliente.add(uncliente);
             }
         } catch (SQLException ex) {
        }
         return cliente;
         
     }
     public int actulizarcliente(ClienteDTO nuevoCliente){
          PreparedStatement sentenciaSQL= null;
          int resultado=0;
          String sql = "UPDATE Clientes SET"+" nombre=?, apellidos=?, domicilio=?, telefono=?, mail=?"+"WHERE idcliente=?";
          
          try{
              conector.setAutoCommit(false);
              sentenciaSQL=conector.prepareStatement(sql);
              sentenciaSQL.setInt(1,    nuevoCliente.getIdcliente());
              sentenciaSQL.setString(2, nuevoCliente.getNombre());
              sentenciaSQL.setString(3, nuevoCliente.getApellidos());
              sentenciaSQL.setString(4, nuevoCliente.getDomicilio());
              sentenciaSQL.setString(5, nuevoCliente.getTelefono());
              sentenciaSQL.setString(6, nuevoCliente.getMail());
              sentenciaSQL.executeUpdate();
              conector.commit();
              resultado=nuevoCliente.getIdcliente();
              
              
          } catch (SQLException ex) {
              resultado =0;
              ex.printStackTrace();
              
            try{
                conector.rollback();
            }catch(SQLException e){
                System.out.println("Error de roolback");
            }
         }
          return resultado;
     }
     public int borrarCliente(ClienteDTO cliente){
         PreparedStatement sentenciaSQL= null;
          int resultado=0;
          String sql = "DELETE FROM Clientes WHERE idcliente=?";
          try{
              conector.setAutoCommit(false);
              sentenciaSQL=conector.prepareStatement(sql);
              sentenciaSQL.setInt(1, cliente.getIdcliente());
              sentenciaSQL.executeUpdate();
              conector.commit();
          } catch (SQLException ex) {
            resultado =0;
              ex.printStackTrace();
              try{
                conector.rollback();
            }catch(SQLException e){
                System.out.println("Error de roolback");
            }
         }
          return resultado;
     }
    
}
