package com.chatapi.infrastructure.repository.message;

import com.chatapi.domain.message.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultMongoMessageRepository extends MongoRepository<Message, String> {
}
