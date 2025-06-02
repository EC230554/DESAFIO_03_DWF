
package sv.edu.udb.Desafio_01.dto;

public class AuthRequest {
    private String username;
    private String password;

    // Constructor vacío (requerido para deserialización JSON)
    public AuthRequest() {
    }

    public AuthRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter y Setter para username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter y Setter para password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
