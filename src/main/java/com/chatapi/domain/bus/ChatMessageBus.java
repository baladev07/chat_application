package com.chatapi.domain.bus;

import com.chatapi.domain.message.Message;

public interface ChatMessageBus {
    void emit(Message message);
}
