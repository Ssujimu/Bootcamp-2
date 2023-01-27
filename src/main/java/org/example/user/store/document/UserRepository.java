package org.example.user.store.document;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDoc, String> {
    //

}
