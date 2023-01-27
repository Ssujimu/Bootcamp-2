package org.example.user.store.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.user.aggregate.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("USER")
public class UserDoc {
    //
    @Id
    private String id;
    private String pw;
    private String name;

    public UserDoc(User user) {
        //
        this.id = user.getId();
        this.pw = user.getPw();
        this.name = user.getName();
    }

    public User toUser() {
        //
        return new User(
                this.id,
                this.pw,
                this.name
        );
    }
}
