package sunshine.serhiypetrosiuk.com.sunshine.data;

/**
 * Created by user on 12/15/14.
 */
public class Email {
    private Integer id   = null;
    private String email = null;
    private String name  = null;

    public Email() {
    }

    public Email(Integer id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
