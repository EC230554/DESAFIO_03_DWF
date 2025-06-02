package sv.edu.udb.Desafio_01.dto;

public class AuthResponse {
    private String token;

    // Constructor vacío (sin argumentos)
    public AuthResponse() {}

    // Constructor que recibe un String
    public AuthResponse(String token) {
        this.token = token;
    }

    // Getter y Setter
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
