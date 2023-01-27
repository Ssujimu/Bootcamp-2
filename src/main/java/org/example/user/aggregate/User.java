package org.example.user.aggregate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.user.command.UserCreate;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    //
    private String id;
    private String pw;
    private String name;

    public User(UserCreate command) {
        //
        this.id = command.getId();
        this.pw = command.getPw();
        this.name = command.getName();
    }
}
