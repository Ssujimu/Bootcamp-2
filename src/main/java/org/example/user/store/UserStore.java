package org.example.user.store;

import org.example.user.aggregate.User;
import org.example.user.store.document.UserDoc;
import org.example.user.store.document.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.NoSuchElementException;
import java.util.Optional;

@Repository
public class UserStore {
    //
    private final UserRepository userRepository;

    public UserStore(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // user 생성
    public void create(User user) {
        //
        this.userRepository.save(new UserDoc(user));
    }

    // user 조회
    public User query(String id) {
        // Optional -> 비어있을 수 있다.
        Optional<UserDoc> doc = this.userRepository.findById(id);

        // 비어져 있을때 exception
        if (doc.isEmpty()) {
           throw new NoSuchElementException();
        }

        return doc.get().toUser();
    }
}
