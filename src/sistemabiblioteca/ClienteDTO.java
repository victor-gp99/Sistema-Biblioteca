package sistemabiblioteca;

/**
 *
 * @author Luna
 */
class ClienteDTO {
    
    
    private int idcliente;
    private String nombre;
    private String apellidos;
    private String domicilio;
    private String telefono;
    private String mail;
    
     public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = telefono;
    }
}

    

