package com.chatapi.infrastructure.repository.user;

import com.chatapi.domain.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DefaultMongoUserRepository extends MongoRepository<User, String> {
    User findByName(String name);

    Optional<User> findById(String id);
}
