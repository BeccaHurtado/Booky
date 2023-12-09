package booklog.example.Booky.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import nonapi.io.github.classgraph.json.Id;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

   @Id
   private String id;

   @NotNull
   @Size(max = 10)
    private String username;

   @NotNull
    @Size(max = 50)
    @Email
    private String email;

   @NotNull
    @Size(max = 20)
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


