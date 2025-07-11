package dto;

public class TokenDTO {

    private String token;
    private Integer id;  // O tipo Integer permite que o ID seja nulo
    private String value;

    public TokenDTO(String token, String value, Integer id) {
        this.token = token;
        this.id = id;
        this.value = value;
    }

    public TokenDTO(String token, String value) {
        this.token = token;
        this.value = value;
        this.id = null;
    }

    public TokenDTO(String token) {
        this.token = token;
        this.value = null;
        this.id = null;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String printOBJ() {
        return "CustomDTO [token=" + token + ", id=" + (id != null ? id : "N/A") + ", value=" + value + "]";
    }

    @Override
    public String toString() {
        if (id != null && value != null)
            return "<" + token + ", " + id + "," + value + ">";
        if (id == null && value != null)
            return "<" + token + ", " + value + ">";
        else
            return "<" + token + ">";
    }
}
